package GraphsGoogle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class MinCostToReachACity {
    public int minCost(int maxTime, int[][] edges, int[] passingFees) {

        ArrayList<ArrayList<ArrayList<Integer>>> gp = new ArrayList<>();

        int n = edges.length;
        int[] minTime = new int[n];

        // Constructing the graph
        for(int i = 0 ; i < n ; i++){
            gp.add(new ArrayList<>());
        }

        for(int i = 0 ; i < n ; i++){
            int u = edges[i][0]; // source
            int v = edges[i][1]; // dest
            int w = edges[i][2]; // weight
            gp.get(u).add(new ArrayList<>(Arrays.asList(w, v)));
        }

        // Filing the Array MinTime with maxTime value except node 0. Because to reach node 0 it takes 0 mins.
        Arrays.fill(minTime, maxTime);
        minTime[0] = 0;

        // Creating a MinHeap to get the minimum time needed to get to a node.
        PriorityQueue<List<Integer>> minHeap = new PriorityQueue<>((p1, p2) -> Integer.compare(p1.get(0), p2.get(0)));

        // In the min heap add the list of weight(w) and curr node (u)
        minHeap.add(Arrays.asList(passingFees[0],0));

        // Create an array to store the minimum passing fees

        int[] minfees = new int[n];
        Arrays.fill(minfees, Integer.MAX_VALUE);

        minfees[0] = passingFees[0];

        while(! minHeap.isEmpty())
        {
            List<Integer> cur = minHeap.poll();
            Integer w = cur.get(0);
            Integer u = cur.get(1);

            // This condition indicates that we are reaching the node for the very first time
            if(u == minTime[u])
            {
                for(int i = 0 ; i < gp.get(u).size() ; i++){

                    Integer w1 = gp.get(u).get(i).get(0);
                    Integer v = gp.get(u).get(i).get(1);

                    if(minfees[u] + passingFees[v] < minfees[v])
                    {
                        minfees[v] = minfees[u] + passingFees[v];
                        minHeap.add(Arrays.asList(minfees[v], v));
                    }

                    if(minTime[u] + w1 < minTime[v])
                    {
                        minTime[v] = minTime[u] + w1;

                    }

                }
            }

        }


        return minfees[n-1];
    }
}
