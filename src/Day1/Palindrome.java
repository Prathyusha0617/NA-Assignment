package Day1;

public class Palindrome {
    public static void main(String[] args) {
        String input = "MADAM";
        String reversed = "";

        // Reverse the input string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Check if the reversed string is equal to the original input
        if (input==reversed) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}