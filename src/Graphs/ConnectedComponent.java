package Graphs;

import java.util.ArrayList;

public class ConnectedComponent {

    int[] visited;
    public int connectedComponents(int A, int[][] B)
    {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        visited = new int[A];
        int components = 0;

        // Constructing the graph
        for(int i = 0 ; i < A; i++)
        {
            graph.add(new ArrayList<>());
            for(int j = 0 ; j < B[i].length ;j++)
            {
                graph.get(i).add(B[i][j]);
            }
        }

        visited[0] = 1;

        for(int i = 0 ; i < A; i++)
        {
            if(visited[i] == 0)
            {
                DFS(visited, graph, i);
                components++;
            }
        }

    return components;
    }

    public void DFS(int[] visited, ArrayList<ArrayList<Integer>> graph, int s)
    {

        if(visited[s] == 1)
        {
            return;
        }
        visited[s] = 1;

        for(int i = 0 ; i < graph.get(s).size(); i++)
        {
            s = graph.get(s).get(i);
            DFS(visited, graph, s);
        }

    }

}
