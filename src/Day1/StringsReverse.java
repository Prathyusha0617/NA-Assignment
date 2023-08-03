package Day1;

public class StringsReverse {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "olleh";
        
        if (areStringsReverse(str1, str2)) {
            System.out.println("The two strings are reverse of each other.");
        } else {
            System.out.println("The two strings are not reverse of each other.");
        }
    }
    public static boolean areStringsReverse(String str1, String str2) {
        
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(str2.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
