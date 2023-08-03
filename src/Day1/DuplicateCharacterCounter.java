package Day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacterCounter {

    public static void countAndPrintDuplicates(String input) {
        // Remove non-alphabetic characters (optional step, modify as needed)
        input = input.replaceAll("[^a-zA-Z]", "");

        // Convert the string to lowercase to ignore case sensitivity
        input = input.toLowerCase();

        // Create a HashMap to store character occurrences
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Iterate through the characters in the input string
        for (char ch : input.toCharArray()) {
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Print duplicates
        System.out.println("Duplicates in the input string:");
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " occurrences");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        countAndPrintDuplicates(input);
    }
}
