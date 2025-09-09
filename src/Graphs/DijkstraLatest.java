package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraLatest {

    //Input: src = 0, V = 5, edges[][] = [[0, 1, 4], [0, 2, 8], [1, 4, 6], [2, 3, 2], [3, 4, 10]]
    public List<List<List<Integer>>> graphConstruction(int src, int n, int[][] edges) {

        int[] dis = new int[n+1];

        List<List<List<Integer>>> gp = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            gp.add(new ArrayList<>());
        }

        for(int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];

            gp.get(u).add(Arrays.asList(w,v));
        }
        return gp;

    }

    public int[] dijkstraPractice( List<List<List<Integer>>> gp, int src, int n){

        int[] dist = new int[n];

        PriorityQueue<List<Integer>> pq = new PriorityQueue<>((p1,p2) -> Integer.compare(p1.get(0), p2.get(0)));
        pq.add(Arrays.asList(0, src));
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;

        while(!pq.isEmpty()){

            List<Integer> cur = pq.poll();

            int d = cur.get(0);
            int u = cur.get(1);

            if(dist[u] == d){
                for(int i = 0 ; i < gp.get(u).size() ; i++){

                    List<Integer> node = gp.get(u).get(i);
                    int w = node.get(0);
                    int v = node.get(1);

                    if(dist[v] > dist[u] + w){
                        dist[v] = dist[u] + w;
                        pq.add(Arrays.asList(w, v));
                    }

                }
            }
        }

        return dist;
    }

}
