package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
The concept of graph colouring says that no two adjacent nodes in a graph can have same colour.
Chromatic number is the total number of colours used to colour the nodes of a graph.
 */
public class CheckBipartite {

    public List<List<Integer>> graphConstruction(int[][] edges, int n){

        List<List<Integer>> gp = new ArrayList<List<Integer>>();
        for(int i = 0; i < n; i++){
            gp.add(new ArrayList<>());
        }

        for(int i = 0 ; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            gp.get(u).add(v);
        }
        return gp;
    }

    public boolean checkBipartite(int[][] edges, int n, int src){

        List<List<Integer>> gp = graphConstruction(edges, n);
        int[] colour = new int[n];

        /*
        In Graph colouring, we assign a colour to the source node. 0 denotes no colour. We
        set the colour of src to 1. Then we iterate on the adjacent nodes and check if those nodes
        have no colour. If not we assign a different colour to the node. 3-color[u] will assign
        a different colour to the node. If a node has been assigned a colour already. Say red. And
        the one of the adjacent nodes is also red. Then in this case the graph cannot be a bipartite.
        In Bipartite only two colours are allowed. So, if the colours are same then a 3rd colour must
        be used. And that we do not allow.
         */

        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        colour[src] = 1;

        while(!q.isEmpty()){
            int u = q.poll();

            for(int i = 0 ; i < gp.get(u).size(); i++){

                int v = gp.get(u).get(i);
                // Colour a node for the 1st time
                if(colour[v] == 0){
                    colour[v] = 3-colour[u];
                    q.add(v);
                }
                // If the node is already coloured, and colour of u and v are same, then it is not bipartite
                else if(colour[v] == colour[u]){
                    return false;
                }
            }
        }
        return true;
    }


}
