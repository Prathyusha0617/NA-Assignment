package Day1;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
	public static boolean areAnagrams(String str1, String str2) {
        // Remove whitespace and convert both strings to lowercase for case-insensitive comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If the lengths are not equal, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

    
        for (char c : str1.toCharArray()) {
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }

        
        for (char c : str2.toCharArray()) {
            int count = charFrequencyMap.getOrDefault(c, 0);
            if (count == 0) {
              
                return false;
            } else {
                charFrequencyMap.put(c, count - 1);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }
    }

}
