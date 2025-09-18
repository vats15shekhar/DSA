// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import ArraysAdvanced.GroupAnagrams;
import ArraysAdvanced.ProductOfArrayExceptSelf;
import Graphs.BellmanFordAlgorithm;
import Graphs.DijkstraLatest;
import GraphsGoogle.RevEdgesForShortestPath;
import GraphsGoogle.ZeroOneBFS;
import Practice.Practice;
import Practice.Graph;
import StringProblems.FirstRepeatingChar;
import StringProblems.IfCharsInStrCanFormPalindrome;
import StringProblems.ValidParenthesis;
import TescoOrder.B;
import TescoOrder.A;

import java.util.*;


public class Main {

        public static void main(String[] args) {

                //Input: src = 0, V = 5, edges[][] = [[0, 1, 4], [0, 2, 8], [1, 4, 6], [2, 3, 2], [3, 4, 10]]
               // DijkstraLatest dijkstra = new DijkstraLatest();
               // List<List<List<Integer>>> gp =  dijkstra.graphConstruction(0, 5, new int[][]{{0, 1, 4}, {0, 2, 8}, {1, 4, 6}, {2, 3, 2}, {3, 4, 10}});
              //  System.out.println(Arrays.toString(dijkstra.dijkstraPractice(gp, 0, 5)));

                Practice p = new Practice();
                System.out.println(p.unitOfRainwaterTrapped(new int[]{2,1,3,2,1,2,4,3,2,1,3,1}));

        }

}