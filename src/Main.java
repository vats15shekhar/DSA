// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import ArraysAdvanced.*;
import BinarySearch.*;
import Graphs.ConnectedComponent;
import Graphs.FindIfAVisitsBInGraph;
import Graphs.NumberOfIslands;
import SortingAlgorithms.CustomComparator;
import SortingAlgorithms.InsertionSort;
import SortingAlgorithms.MergeSort;
import SortingAlgorithms.MergeSortAlgoRecursion;
import TescoOrder.Container;
import TescoOrder.ProductVolume;
import TwoPointer.FindIfDiffExistsInAnArray;
import TwoPointer.FindIfSumExistsInArray;
import TwoPointer.MinimizeDiffIn3Arrays;
import TwoPointer.RainWaterUsingTwoPointers;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        int A = 6;
        int[][] B  =  {{0,1}, {0,2}, {1,2}, {3,4}};
        int[][] grid = {{1,0,1,1},
                {1,1,0,0},
                {1,0,0,1},
                {0,0,1,1}};

        NumberOfIslands numberOfIslands = new NumberOfIslands();
        int g = numberOfIslands.numIslands(grid);
        System.out.println(g);
    }




}