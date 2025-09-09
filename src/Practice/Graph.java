package Practice;

import java.util.ArrayList;
import java.util.List;

public class Graph {
        public int nodes; // Number of nodes
        public List<List<Integer>> adjList; // Adjacency list representation

        // Constructor
        public Graph(int nodes) {
            this.nodes = nodes;
            adjList = new ArrayList<>();
            for (int i = 0; i <= nodes; i++) {
                adjList.add(new ArrayList<>());
            }
        }

        // Add an edge between two nodes
        public void addEdge(int u, int v) {
            adjList.get(u).add(v);
            adjList.get(v).add(u); // Since the graph is undirected
        }

    }

