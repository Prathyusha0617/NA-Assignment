package Day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayShuffler {
    public static void main(String[] args) {
        // Example array
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Original array: " + Arrays.toString(array));

        // Convert the array to a List
        List<Integer> list = Arrays.asList(array);

        // Shuffle the List
        Collections.shuffle(list);

        // Convert the shuffled List back to an array
        list.toArray(array);

        System.out.println("Shuffled array: " + Arrays.toString(array));
    }
}
