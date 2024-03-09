// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import ArraysAdvanced.FindFirstMissingPositiveInteger;
import SortingAlgorithms.CustomComparator;
import SortingAlgorithms.InsertionSort;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

       /* InsertionSort i = new InsertionSort();
        i.insertionSort(A);
        System.out.println(Arrays.toString(A));

        CustomComparator c = new CustomComparator();
        c.customComparator(A);*/

        FindFirstMissingPositiveInteger f = new FindFirstMissingPositiveInteger();
        System.out.println(f.findFirstMissingInt(A));

    }

    static int[] A = {5, 4, 3, 2, 1, 7, 9};

}