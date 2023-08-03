package Day1;

import java.util.Arrays;
import java.util.Scanner;

public class NumsinAscindingorder {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Convert the number to a string to extract its digits
        String numberString = Long.toString(number);

        char[] digits = numberString.toCharArray();
        Arrays.sort(digits);

        System.out.print("Digits in ascending order: ");
        for (char digit : digits) {
            System.out.print(digit);
        }

        scanner.close();
    }
       

}
