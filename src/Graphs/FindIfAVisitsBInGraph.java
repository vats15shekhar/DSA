package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FindIfAVisitsBInGraph {

    public Integer path(int A, int[][] B) {

        // Visited graph to indicate which nodes have been visited
        int[] visited = new int[A + 1];

        // Constructing a graph from input B.
        // (i,0) indicates the start node, (i,1) indicates the node that's being connected to
        List<List<Integer>> graph = new ArrayList<List<Integer>>();

        // In this queue we keep inserting the nodes as we visit them
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Adding a list for each node in the grph
        for(int i = 0 ; i <= A ; i++) {
            graph.add(i ,new ArrayList<>());
        }

        // Adding the nodes being visited from jth node as a list
        for(int j = 0 ; j < B.length ; j++) {
            graph.get(B[j][0]).add(B[j][1]);
        }

        // adding the first node of the graph which is 1
        queue.add(1);

        // we have visited node 1 so we mark it as 1
        visited[1] = 1;

        while(!queue.isEmpty())
        {
            Integer top = queue.poll();


            for(int i = 0 ; i < graph.get(top).size() ; i++) {
                // Only is  node is not visited, we add it to the queue
                if(visited[graph.get(top).get(i)] == 0)
                {
                    queue.add(graph.get(top).get(i));
                    visited[graph.get(top).get(i)] = 1;
                }
            }
        }

        return visited[A];
    }
}
