// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import ArraysAdvanced.FindFirstMissingPositiveInteger;
import ArraysAdvanced.KadanesAlgo;
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

        //FindFirstMissingPositiveInteger f = new FindFirstMissingPositiveInteger();
        KadanesAlgo kad = new KadanesAlgo();
        System.out.println(kad.kadane(A));

    }

    static int[] A = {-10, -2, -3, -1};

}