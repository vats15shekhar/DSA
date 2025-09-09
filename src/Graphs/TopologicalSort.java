package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopologicalSort {

    // Function to return list containing vertices in Topological order.
    public int[] topologicalSort(int A, int[][] B) {

        ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();
        int[] topoSortedArray = new int[A];
        int[] indegree = new int[A + 1];
        int c = 0;
        int index = 0;

        // Adding a list for every node in the graph ArrayList
        for(int i = 0 ; i <= A; i++) {
            g.add(i, new ArrayList<Integer>());
        }

        //Constructing the graph
        for (int[] node : B) {
            //        u     ->    v
            g.get(node[0]).add(node[1]);
            // Adding the incoming nodes to the indegree array. This indicates the number of nodes
            // coming towards each node;
            // we do indegree[node[1]]++ because it indicates one more node coming towards B[i][1]
            indegree[node[1]]++;
        }

        // Min Heap. This priority queue will always order the queue in the ascending order.
        // We declare this queue to resolve the nodes as their indegree nodes become 0.
        PriorityQueue<Integer> q = new PriorityQueue<>();

        //Inserting into the queue all the nodes that have no nodes incoming to it.
        for(int i = 1 ; i < indegree.length; i++) {
            if(indegree[i] == 0) {
               // add all the nodes to the queue that has no incoming edges
                q.offer(i);
            }
        }

        while(!q.isEmpty())
        {
            int top = q.poll();
            c++;

            // keep adding the elements to the result array as we pop them from the queue
            topoSortedArray[index++] = top;

            for(int i = 0 ; i < g.get(top).size(); i++) {

                int ind = g.get(top).get(i);
                indegree[ind]--;
                if(indegree[ind] == 0) {
                    q.offer(ind);
                }
            }
        }

        // c is the counter variable to verify that all the nodes have been resolved.
        // If all the nodes are not resolved it means that there is a cycle
        // And in that case we cannot get the topological order of a graph
        if(c != A)
        {
            return new int[0];
        }

        return topoSortedArray;
    }

}
