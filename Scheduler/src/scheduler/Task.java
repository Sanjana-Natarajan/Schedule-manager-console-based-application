
package scheduler;

/**
 *
 * @author sanjana
 */
import java.time.LocalDate;
import java.time.LocalTime;

public class Task {
    private String title;
    private String description;
    private LocalDate dueDate;
    private LocalTime startTime;
    private LocalTime endTime;

    public Task(String title, String description, LocalDate dueDate, LocalTime startTime, LocalTime endTime) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public boolean overlapsWith(Task other) {
        return this.dueDate.equals(other.dueDate) &&
               (this.startTime.isBefore(other.endTime) && this.endTime.isAfter(other.startTime));
    }

    @Override
    public String toString() {
        return "Task Title: " + title + ", Description: " + description +
               ", Due Date: " + dueDate + ", Start Time: " + startTime + ", End Time: " + endTime;
    }
}

