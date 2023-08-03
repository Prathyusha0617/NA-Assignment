package Day1;

public class CharacterRemover {

    public static String removeCharacters(String str1, String str2) {
        StringBuilder result = new StringBuilder();

        for (char c : str1.toCharArray()) {
            if (str2.indexOf(c) == -1) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        String resultString = removeCharacters(str1, str2);
        System.out.println("String after removing characters present in the second string: " + resultString);
    }
}
