package Graphs;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstras {

    public Integer dikstras(List<List<List<Integer>>> gp, int n, int s, int dest)
    {
        int[] dist = new int[n + 1];

        //Time taken to blast the source node is 0. Initializing it to that.
        dist[s] = 0;

        // Declaring the min heap to get the minimum time required to blast a station
        PriorityQueue<List<Integer>> minHeap = new PriorityQueue<>((p1, p2) -> Integer.compare(p1.get(0), p2.get(0)));

        // 0 is the time of the s(source element). We add that as a pair to the heap
        minHeap.add(Arrays.asList(0, s));

        while(!minHeap.isEmpty())
        {
            List<Integer> cur = minHeap.poll();
            Integer d = cur.get(0);
            Integer u = cur.get(1);

            // If we are blasting the node for the very first time then the
            if(dist[u] == d)
            {
                for(int i = 0 ; i < gp.get(u).size(); i++)
                {
                    List<Integer> vNode = gp.get(u).get(i);
                    Integer w = vNode.get(0);
                    Integer v = vNode.get(1);

                    if(dist[u] + w < dist[v])
                    {
                        dist[v] = dist[u] + w;
                        minHeap.add(Arrays.asList(dist[v], v));
                    }


                }
            }


        }

        return dist[dest];

    }


}
