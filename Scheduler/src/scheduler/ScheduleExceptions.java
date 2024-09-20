
package scheduler;

public class ScheduleExceptions {
    public static class InvalidTaskSelection extends RuntimeException {
        public InvalidTaskSelection(String message) {
            super(message);
        }
    }
}


