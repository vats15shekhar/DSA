package Graphs;

import java.util.*;

public class BFS {

    public boolean[] BFS(int[][] adjMat, int n){

        boolean[] vis = new boolean[n];
        Arrays.fill(vis, false);

        List<List<Integer>> grph = new ArrayList<>();
        for(int i = 0; i < n; i++){
            grph.add(new ArrayList<>());
        }

        // Graph construction
        for(int i = 0 ; i < adjMat.length ; i++)
        {
            int u =  adjMat[i][0];
            int v = adjMat[i][1];

            grph.get(u).add(v);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        vis[0] = true;
        int u = 0;

        while(!queue.isEmpty()){

            u = queue.peek();
            queue.poll();

            // Iterate on the nodes that are reachable from u
            for(int i = 0; i < grph.get(u).size(); i++){
                int v = grph.get(u).get(i);

                if(!vis[v])
                {
                    vis[v] = true;
                    queue.add(v);
                }
            }

        }

        return vis;
    }

}
