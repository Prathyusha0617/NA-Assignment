package Day1;

import java.util.Arrays;

public class ArrayEqualityChecker {

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        // Check for null or different lengths
        if (arr1 == null || arr2 == null || arr1.length != arr2.length) {
            return false;
        }

        // Sort the arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare the sorted arrays element by element
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 2, 4};
        int[] arr2 = {3, 1, 5, 4, 2};

        if (areArraysEqual(arr1, arr2)) {
            System.out.println("Both arrays contain the same elements.");
        } else {
            System.out.println("The arrays do not contain the same elements.");
        }
    }
}

