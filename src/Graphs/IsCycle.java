package Graphs;

import java.util.ArrayList;

public class IsCycle {
    // Function to detect cycle in an undirected graph.

    public static boolean[] vis;
    public static boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int components = 0;
        int n = adj.size();
        int e = 0;
        // Get the total number of edges in this graph
        for(int i = 0 ; i< adj.size(); i++)
        {
            e = e + adj.get(i).size();
        }
        // This is because from the adj list we get the edge from one
        // node to another, twice. Hence we divide the total edges by 2
        // to get the actual number of edges.
        e = e/2;

        // Initializing a boolean array to check which nodes are visited
        vis = new boolean[n + 1];
        vis[0] = false;

        for(int i = 0 ; i < adj.size() ; i++)
        {
            if(vis[i] == false)
            {
                DFS(adj, vis, i);
                components ++;
            }
        }

        if(e > n - components)
        {
            return true;
        }
        return false;

    }

    public static void DFS(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int s)
    {
        if(vis[s])
        {
            return;
        }
        vis[s] = true;

        for(int i = 0 ; i < adj.get(s).size(); i++)
        {
            int v = adj.get(s).get(i);
            DFS(adj, vis, v);
        }
    }
}

// Input to the method isCycle

    /*    ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
         int[][] ad = {{1}, {0,2,4}, {1,3}, {2,4}, {1,3}};

         for(int i = 0 ; i < ad.length; i++)
         {
             adj.add(i, new ArrayList<Integer>());

             for(int j = 0 ; j < ad[i].length; j++)
             {
                 adj.get(i).add(ad[i][j]);
             }
         }

        System.out.println(isCycle(adj)); */