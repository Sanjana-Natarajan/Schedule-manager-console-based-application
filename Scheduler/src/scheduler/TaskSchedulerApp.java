
package scheduler;

/**
 *
 * @author sanjana
 */
public class TaskSchedulerApp {
    public static void main(String[] args) {
        TaskCoordinator taskCoordinator = new TaskCoordinator();
        UserInputGuardian inputGuardian = new UserInputGuardian();

        System.out.println("Welcome to your creative task scheduler!");

        boolean runApp = true;
        while (runApp) {
            System.out.println("\n--- Task Scheduler Menu ---");
            System.out.println("1. Add a Task");
            System.out.println("2. Remove a Task");
            System.out.println("3. View All Tasks");
            System.out.println("4. Exit");

            int choice = inputGuardian.getIntInput("Choose an option (1-4): ");

            switch (choice) {
                case 1:
                    taskCoordinator.addTask();
                    break;
                case 2:
                    taskCoordinator.removeTask();
                    break;
                case 3:
                    taskCoordinator.viewAllTasks();
                    break;
                case 4:
                    runApp = false;
                    System.out.println("Exiting Task Scheduler. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}


