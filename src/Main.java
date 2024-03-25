// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import ArraysAdvanced.*;
import BinarySearch.FindIndex;
import SortingAlgorithms.CustomComparator;
import SortingAlgorithms.InsertionSort;
import SortingAlgorithms.MergeSort;
import SortingAlgorithms.MergeSortAlgoRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {

    public static void demo()
    {



    }


    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

      /*  MergeSortAlgoRecursion mr = new MergeSortAlgoRecursion();
        mr.sortAlgo(A,0, A.length - 1);
        System.out.println(Arrays.toString(A));*/

       // System.out.println((5+3)/2);


        MaxStrictlyIncSubarray sm = new MaxStrictlyIncSubarray();
        System.out.println(sm.MaxIncSubarray(B));


    }

    static int[][] A = {{2, 5, -4, 2}, {1, -8, 5, 6}, {7, 3, -5, -9}, {3, 0, 3, -1}};
    static int[] B = {4, 8, 9, 7, 6, 2, 1, 5};

}