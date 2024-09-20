
package scheduler;

/**
 *
 * @author sanja
 */
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TaskCoordinator {
    private List<Task> taskList = new ArrayList<>();
    private UserInputGuardian inputGuardian = new UserInputGuardian();

    public void addTask() {
        String title = inputGuardian.getStringInput("Enter task title: ");
        String description = inputGuardian.getStringInput("Enter task description: ");
        LocalDate dueDate = inputGuardian.getDateInput("Enter task due date (yyyy-mm-dd): ");
        LocalTime startTime = inputGuardian.getTimeInput("Enter task start time (HH:mm): ");
        LocalTime endTime = inputGuardian.getTimeInput("Enter task end time (HH:mm): ");
        
        Task newTask = new Task(title, description, dueDate, startTime, endTime);

        if (isTaskConflict(newTask)) {
            System.out.println("Error: Task conflicts with an existing task scheduled at the same time.");
        } else {
            taskList.add(newTask);
            SystemMonitor.log("Task added: " + newTask.getTitle());
        }
    }

    private boolean isTaskConflict(Task newTask) {
        for (Task existingTask : taskList) {
            if (existingTask.overlapsWith(newTask)) {
                return true;
            }
        }
        return false;
    }

    public void removeTask() {
        if (taskList.isEmpty()) {
            System.out.println("No tasks available to remove.");
            return;
        }
        int taskIndex = inputGuardian.getIntInput("Enter the task number to remove a task (1 to " + taskList.size() + "): ") - 1;
        try {
            Task removedTask = taskList.remove(taskIndex);
            System.out.println("Task removed: " + removedTask.getTitle());
            SystemMonitor.log("Task removed: " + removedTask.getTitle());
        } catch (IndexOutOfBoundsException e) {
            throw new ScheduleExceptions.InvalidTaskSelection("Invalid task number selected.");
        }
    }

    public void viewAllTasks() {
        if (taskList.isEmpty()) {
            System.out.println("No tasks to display.");
        } else {
            System.out.println("\n--- Current Tasks ---");
            for (int i = 0; i < taskList.size(); i++) {
                System.out.println((i + 1) + ". " + taskList.get(i));
            }
        }
    }
}
