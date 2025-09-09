package Graphs;

import java.util.*;

public class DFS {
    public List<List<Integer>> BFS(int[][] adjMat, int n){
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

        return grph;
    }

    public void DFS(List<List<Integer>> adjMat, boolean[] v, int s){

        if(v[s]){
            return;
        }
        v[s] = true;

        for(int i = 0 ; i < adjMat.get(s).size(); i++){
             s = adjMat.get(s).get(i);
             DFS(adjMat, v, s);
        }
    }


}
