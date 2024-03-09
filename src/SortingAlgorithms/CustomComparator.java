package SortingAlgorithms;

import java.util.Arrays;
import java.util.Comparator;

public class CustomComparator {

    public void customComparator(int[] A)
    {
        Integer[] numbers = new Integer[A.length];
        for(int i = 0 ; i < A.length ; i++)
        {
            numbers[i] = A[i];
        }

        // Sort the array in ascending order
        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // Custom comparator to sort in ascending order
                return o1 - o2;
            }
        });

        System.out.println("Sorted array in ascending order: " + Arrays.toString(numbers));

        // Sort the array in descending order
        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // Custom comparator to sort in descending order
                return o2 - o1;
            }
        });

        System.out.println("Sorted array in descending order: " + Arrays.toString(numbers));
    }
}
