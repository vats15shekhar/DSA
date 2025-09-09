package Graphs;

public class NumberOfIslands {

    public int numIslands(int[][] grid) {

    int r = grid.length;
    int c = grid[0].length;
    int count = 0;

    for(int i = 0 ; i < grid.length; i++)
    {
        for(int j =0 ; j < grid[0].length; j++)
        {
            if(grid[i][j] == 1)
            {
                DFS(grid, i, j, r, c);
                count++;
            }
        }
    }
        return count;
    }

    public void DFS(int[][] grid, int i, int j, int r, int c)
    {
        if(i < 0 || i >= r || j < 0 || j >= c || grid[i][j] == 0)
        {
            return;
        }

        grid[i][j] = 0;

        DFS(grid, i-1, j, r, c);
        DFS(grid, i, j+1, r, c);
        DFS(grid, i+1, j, r, c);
        DFS(grid, i, j-1, r, c);

    }

}

/* Input to Number of Islands Problem
 int A = 6;
        int[][] B  =  {{0,1}, {0,2}, {1,2}, {3,4}};
        int[][] grid = {{1,0,1,1},
                {1,1,0,0},
                {1,0,0,1},
                {0,0,1,1}};

        NumberOfIslands numberOfIslands = new NumberOfIslands();
        int g = numberOfIslands.numIslands(grid);
        System.out.println(g);
 */
