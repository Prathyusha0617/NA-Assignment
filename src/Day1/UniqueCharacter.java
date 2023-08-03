package Day1;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacter {
	public static Set<Character> findUniqueCharacters(String str) {
        Set<Character> uniqueChars = new HashSet<>();
        
        for (char c : str.toCharArray()) {
    
            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
            }
        }

        return uniqueChars;
    }

    public static void main(String[] args) {
        String inputString = "hello world";
        Set<Character> uniqueCharacters = findUniqueCharacters(inputString);

        System.out.println("Unique characters in the string:");
        for (char c : uniqueCharacters) {
            System.out.print(c + " ");
        }
    }

}
