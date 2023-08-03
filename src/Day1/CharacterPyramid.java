package Day1;

import java.util.Scanner;

public class CharacterPyramid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the pyramid: ");
        int height = scanner.nextInt();

        printCharacterPyramid(height);
    }

    public static void printCharacterPyramid(int height) {
        char currentChar = 'A'; // Starting character
        int charCount = 1; // Number of characters in the current row

        for (int i = 1; i <= height; i++) {
            // Print leading spaces
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }

            // Print characters
            for (int j = 1; j <= charCount; j++) {
                System.out.print(currentChar);
                if (j < charCount) {
                    System.out.print(" ");
                }
                currentChar = nextCharacter(currentChar); // Move to the next character
            }

            System.out.println();
            charCount += 2; // Increase the number of characters for the next row
        }
    }

    public static char nextCharacter(char ch) {
        return (char) (ch + 1);
    }
}

