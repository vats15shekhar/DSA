package Graphs;

import Practice.Graph;

import java.util.Arrays;

public class BellmanFordAlgorithm {

    public int[] bellmanFord(int[][] graph, int node) {

        int[] visited = new int[node];
        Arrays.fill(visited, Integer.MAX_VALUE);

        visited[0] = 0;
        boolean flag = false;
        int u = 0;
        int v = 0;
        int w = 0;

        for(int i = 1; i < node; i++) {

            flag = false;
            for(int j = 0; j < graph.length; j++) {
                u = graph[j][0];
                v = graph[j][1];
                w = graph[j][2];

                if(visited[v] > visited[u] + w && visited[u] != Integer.MAX_VALUE) {
                    visited[v] = visited[u] + w;
                    flag = true;
                }
            }

            if(!flag)
            {
                break;
            }

        }
    return visited;

    }
}
