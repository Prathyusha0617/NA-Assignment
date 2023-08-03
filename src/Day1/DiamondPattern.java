package Day1;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (odd number): ");
        int numRows = scanner.nextInt();
        scanner.close();

        if (numRows % 2 == 0) {
            System.out.println("Please enter an odd number of rows.");
            return;
        }

        printDiamondPattern(numRows);
    }

    public static void printDiamondPattern(int numRows) {
        int midRow = numRows / 2 + 1;

        for (int i = 1; i <= numRows; i++) {
            int spaces = Math.abs(midRow - i);
            int stars = numRows - (2 * spaces);

            // Print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= stars; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
