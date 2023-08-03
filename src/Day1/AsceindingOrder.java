package Day1;

import java.util.Arrays;
import java.util.Scanner;

public class AsceindingOrder {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        // Convert the name to lowercase to handle both upper and lower case letters
        name = name.toLowerCase();

        char[] letters = name.toCharArray();
        Arrays.sort(letters);

        System.out.print("Letters in ascending order: ");
        for (char c : letters) {
            System.out.print(c);
        }

        scanner.close();
    }

}
