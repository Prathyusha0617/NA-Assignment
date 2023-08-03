package Day1;

import java.util.HashSet;

public class ArrayPairsWithSum {

    public static void findPairsWithSum(int[] arr, int targetSum) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            int complement = targetSum - num;
            if (set.contains(complement)) {
                System.out.println("(" + num + ", " + complement + ")");
            }
            set.add(num);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 3, 6, 7, 1, 5};
        int targetSum = 9;

        System.out.println("Pairs with sum " + targetSum + ":");
        findPairsWithSum(arr, targetSum);
    }
}