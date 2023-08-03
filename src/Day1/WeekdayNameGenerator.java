package Day1;

import java.util.Scanner;

public class WeekdayNameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-7): ");
        int number = scanner.nextInt();
        scanner.close();

        String weekdayName = getWeekdayName(number);

        if (weekdayName != null) {
            System.out.println("Weekday " + number + " is " + weekdayName + ".");
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
    }

    public static String getWeekdayName(int number) {
        String[] weekdays = {
                "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
        };

        if (number >= 1 && number <= 7) {
            return weekdays[number - 1];
        } else {
            return null;
        }
    }
}

