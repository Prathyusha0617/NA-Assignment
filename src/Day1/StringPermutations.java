package Day1;

public class StringPermutations {
	public static void printPermutations(String str) {
        printPermutationsHelper("", str);
    }

    private static void printPermutationsHelper(String prefix, String remaining) {
        int n = remaining.length();

        if (n == 0) {
            System.out.println(prefix); // Base case: When there are no characters remaining to permute
        } else {
            for (int i = 0; i < n; i++) {
                // Fix one character at the beginning (prefix), and generate permutations for the rest (remaining)
                printPermutationsHelper(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1));
            }
        }
    }

    public static void main(String[] args) {
        String inputString = "abc";
        System.out.println("Permutations of the string: " + inputString);
        printPermutations(inputString);
    }

}
