// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import ArraysAdvanced.FindFirstMissingPositiveInteger;
import ArraysAdvanced.FindIfSubArrIsIncOrDecInARange;
import ArraysAdvanced.KadanesAlgo;
import ArraysAdvanced.SubMatrixSum;
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


        SubMatrixSum sm = new SubMatrixSum();
        System.out.println(sm.submatrix(A, 0, 2, 0, 2));


    }

    static int[][] A = {{2, 5, 4, 2}, {1, 8, 5, 0}, {7, 3, 5, 9}};

}