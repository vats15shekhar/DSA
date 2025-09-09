package Graphs;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Given a weighted, undirected, and connected graph with V vertices and E edges,
 * your task is to find the sum of the weights of the edges in the Minimum Spanning Tree (MST)
 * of the graph. The graph is provided as a list of edges, where each edge is represented
 * as [u, v, w], indicating an edge between vertex u and vertex v with edge weight w.
 */

public class MinimumSpanningTree {

    public int spanningTree(int V, int[][] edges) {
        // code here
        int[] comp = new int[edges.length];
        int mincost = 0;

        // Fill the component array with it's own edge
        for(int i = 0; i < comp.length; i++){
            comp[i] = i;
        }

        // Sort by 3rd element (index 2)
        Arrays.sort(edges, Comparator.comparingInt(col -> col[2]));

        for(int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            int Pu = comp(comp, u);
            int Pv = comp(comp, v);

            if(Pu != Pv){
                mincost+= edges[i][2];
                comp[Math.max(Pu,Pv)] = Math.min(Pv,Pu);
            }

        }

        return mincost;
    }

    public int comp(int[] comp, int n){

        if(comp[n] == n){
            return n;
        }

        comp[n] = comp(comp, comp[n]);
        return comp[n];

    }
}
