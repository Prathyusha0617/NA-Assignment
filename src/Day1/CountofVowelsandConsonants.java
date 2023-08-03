package Day1;

public class CountofVowelsandConsonants {
	public static void countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;


        for (char c : str.toCharArray()) {
           
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            } else if (Character.isLetter(c)) { 
                consonantCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }

    public static void main(String[] args) {
        String inputString = "hello world";
        countVowelsAndConsonants(inputString);
    }

}
