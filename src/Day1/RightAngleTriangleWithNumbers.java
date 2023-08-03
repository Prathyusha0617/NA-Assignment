package Day1;

import java.util.Scanner;

public class RightAngleTriangleWithNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        scanner.close();

        displayRightAngleTriangle(numRows);
    }

    public static void displayRightAngleTriangle(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

