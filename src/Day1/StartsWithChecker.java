package Day1;

import java.util.Scanner;

public class StartsWithChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the prefix to check: ");
        String prefixToCheck = scanner.nextLine();

        scanner.close();

        boolean startsWithPrefix = mainString.startsWith(prefixToCheck);

        if (startsWithPrefix) {
            System.out.println("The main string starts with the prefix.");
        } else {
            System.out.println("The main string does not start with the prefix.");
        }
    }
}