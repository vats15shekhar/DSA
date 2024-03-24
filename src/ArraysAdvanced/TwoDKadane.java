package ArraysAdvanced;

public class TwoDKadane {

    public static void prefixmatrix(int[][] A) {
        // column wise prefix sum

        for (int j = 0; j < A[0].length; j++) {
            for (int i = 1; i < A.length; i++) {

                A[i][j] = A[i][j] + A[i - 1][j];
            }
        }

    }

    public static int kadane2D(int[] B)
    {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0 ; i < B.length ; i++)
        {
            sum += B[i];
            max = Math.max(sum, max);

            if(sum < 0)
            {
                sum = 0;
            }
        }

        return max;
    }

    public static int twoDKadane(int[][] A, int a1, int a2)
    {
        // Calling this method to perform column wise prefix sum
        prefixmatrix(A);

        int[] arr = new int[A[0].length];

        // storing the column wise subarray sum between a1 and a2 in arr
        for(int j = 0 ; j < A[0].length ; j++)
        {
            if(a1 == 0)
            {
                arr[j] = A[a2][j];
            }
            else
            {
                arr[j] = A[a2][j] - A[a1-1][j];
            }

        }

        int maxSubMatrixSum = kadane2D(arr);

        return maxSubMatrixSum;

    }
}
