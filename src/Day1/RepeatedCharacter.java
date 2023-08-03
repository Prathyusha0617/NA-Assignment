package Day1;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacter {
    public static void printRepeatedCharacters(String str) {
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

       
        for (char c : str.toCharArray()) {
          

            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Repeated characters in the string:");
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String inputString = "hello world5";
        printRepeatedCharacters(inputString);
    }


}
