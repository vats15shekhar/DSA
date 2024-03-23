package ArraysAdvanced;

public class SubMatrixSum {

    public int submatrix(int[][] A, int a1, int a2, int b1, int b2)
    {

        // Row wise prefix sum
        for(int i = 0 ; i < A.length ; i++)
        {
            for(int j = 1 ; j < A[0].length ; j++)
            {
                A[i][j] = A[i][j] + A[i][j-1];
            }
        }

        // column wise prefix sum
        for(int j = 0 ; j < A[0].length ; j++)
        {
            for(int i = 1 ; i < A.length ; i++)
            {
                A[i][j] = A[i][j] + A[i-1][j];
            }
        }


        int sum = 0;

        sum = sum + A[a2][b2];

        if(b1>0)
        {
            sum = sum - A[a2][b1-1];
        }

        if(a1 >0)
        {
            sum = sum - A[a1-1][b2];
        }

        if(a1 > 0 && b1 > 0)
        {
            sum = sum + A[a1-1][b1-1];
        }

        return sum;




    }
}
