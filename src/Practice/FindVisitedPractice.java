package Practice;

import java.util.ArrayList;
import java.util.LinkedList;

public class FindVisitedPractice {

  public void DFS(int source, ArrayList<ArrayList<Integer>> graph, int[] visited) {

     if(visited[source] == 1)
     {return;}
      visited[source] = 1;

      for(int i=0; i<graph.get(source).size(); i++) {
          if(visited[graph.get(source).get(i)] == 0) {
              DFS(graph.get(source).get(i), graph, visited);
          }
      }


  }
}
