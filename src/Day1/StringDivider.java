package Day1;

import java.util.Scanner;

public class StringDivider {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the number of equal parts (n): ");
        int n = scanner.nextInt();
        scanner.close();

        String[] equalParts = divideString(inputString, n);

        if (equalParts != null) {
            System.out.println("The string divided into " + n + " equal parts:");
            for (String part : equalParts) {
                System.out.println(part);
            }
        } else {
            System.out.println("Invalid input. The number of parts (n) must be greater than 0.");
        }
    }

    public static String[] divideString(String inputString, int n) {
        if (n <= 0) {
            return null;
        }

        int strLength = inputString.length();
        int partLength = (int) Math.ceil((double) strLength / n);
        String[] equalParts = new String[n];

        int startIndex = 0;
        for (int i = 0; i < n; i++) {
            int endIndex = Math.min(startIndex + partLength, strLength);
            equalParts[i] = inputString.substring(startIndex, endIndex);
            startIndex = endIndex;
        }

        return equalParts;
    }
}

