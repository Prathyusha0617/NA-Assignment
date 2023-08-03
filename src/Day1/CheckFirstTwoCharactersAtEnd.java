package Day1;

import java.util.Scanner;

public class CheckFirstTwoCharactersAtEnd {
	 public static boolean checkFirstTwoCharactersAtEnd(String input) {
	        int length = input.length();
        if (length < 2) {
	            return false; // If the string has less than 2 characters, return false
	        }

	        String firstTwoCharacters = input.substring(0, 2);
	        String lastTwoCharacters = input.substring(length - 2);

	        return firstTwoCharacters.equals(lastTwoCharacters);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        scanner.close();

	        if (checkFirstTwoCharactersAtEnd(input)) {
	            System.out.println("The first two characters are present at the end of the string.");
	        } else {
	            System.out.println("The first two characters are not present at the end of the string.");
	        }
	    }

}
