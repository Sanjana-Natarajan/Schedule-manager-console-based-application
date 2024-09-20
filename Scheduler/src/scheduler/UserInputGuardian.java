
package scheduler;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserInputGuardian {
    private Scanner scanner = new Scanner(System.in);

    public int getIntInput(String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public String getStringInput(String message) {
        System.out.print(message);
        return scanner.next();
    }

    public LocalDate getDateInput(String message) {
        System.out.print(message);
        String dateInput = scanner.next();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(dateInput, dateFormatter);
    }

    public LocalTime getTimeInput(String message) {
        System.out.print(message);
        String timeInput = scanner.next();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        return LocalTime.parse(timeInput, timeFormatter);
    }
}
