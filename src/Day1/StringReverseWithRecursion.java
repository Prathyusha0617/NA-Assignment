package Day1;

public class StringReverseWithRecursion {

    public static String reverseString(String str) {
       
        if (str == null || str.length() <= 1) {
            return str;
        }

        
        String reversedSubstring = reverseString(str.substring(1));

        
        return reversedSubstring + str.charAt(0);
    }

    public static void main(String[] args) {
        String originalString = "hello";
        String reversedString = reverseString(originalString);
        System.out.println("Original string: " + originalString);
        System.out.println("Reversed string: " + reversedString);
    }
}

