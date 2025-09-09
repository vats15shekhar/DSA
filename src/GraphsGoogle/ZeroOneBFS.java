package GraphsGoogle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class ZeroOneBFS {

    public int[] zeroOneBFS(int[][] graph, int n) {

        ArrayList<ArrayList<ArrayList<Integer>>> gp = new ArrayList<ArrayList<ArrayList<Integer>>> ();

        // Graph Construction
        for (int i = 0; i < n; i++) {
            gp.add(new ArrayList<>());
        }

        for (int i = 0; i < graph.length; i++) {

            int u = graph[i][0];
            int v = graph[i][1];
            int w = graph[i][2];
            gp.get(u).add(new ArrayList<>(Arrays.asList(v, w)));
        }

        // Create an array for the shortest path

        int[] shortestPath = new int[n];
        Arrays.fill(shortestPath, Integer.MAX_VALUE);
        shortestPath[0] = 0; // The path to the source node 0 is 0

        // Creating a double ended queue. In this dequeue,
        // we add the node that has a distance 0 is pushed towards the left.
        // And the nodes that have greater distance are pushed towards the right
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(0); // Adding the source node 0 to the deque


        while(!deque.isEmpty())
        {
            int u = deque.removeFirst();
            int min = Integer.MAX_VALUE;

            for(int i = 0 ; i < gp.get(u).size() ; i++){

                ArrayList<Integer> pair = gp.get(u).get(i);
                int v = pair.get(0);
                int w = pair.get(1);

                // Taking this minimum variable to determine the smaller distance
                // That will be used to determine whether to put a u node to the left
                // or the right of the deque
                 if(min > w){
                     min = w;
                 }

                if(w == min){
                     deque.addFirst(v);
                 }
                 else {
                     deque.addLast(v);
                 }

                 if(shortestPath[u] + w < shortestPath[v])
                 {
                     shortestPath[v] = shortestPath[u] + w;
                 }

            }

        }



        return shortestPath;
    }
}

/*
  int n = 9;
  int[][] edges = {{0,1,0}, {0, 7, 1}, {1,2,1}, {1, 7, 1}, {2, 3, 0}, {2, 5, 0},
  {2, 8, 1}, {3, 4, 1},{3, 5, 1},{4, 5, 1},{5, 6, 1},{6, 7, 1},{7, 8, 1}};

 */
