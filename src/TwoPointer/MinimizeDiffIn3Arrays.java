package TwoPointer;

/*
Problem :
There are 3 sorted arrays given. Minimize the difference max(A[i], B[j], C[k]) - min(A[i], B[j], C[k])

 */

public class MinimizeDiffIn3Arrays {

    public int minimizeDiff(int[] A, int[] B, int[] C)
    {
        int n = A.length;

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        int ans = Integer.MAX_VALUE;

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        while(p1 < n && p2 < n && p3 < n)
        {
            maxNum = Integer.MIN_VALUE;
            minNum = Integer.MAX_VALUE;

            maxNum = Math.max(maxNum, A[p1]);
            maxNum = Math.max(maxNum, B[p2]);
            maxNum = Math.max(maxNum, C[p3]);

            minNum = Math.min(minNum, A[p1]);
            minNum = Math.min(minNum, B[p2]);
            minNum = Math.min(minNum, C[p3]);

            ans = Math.min(ans, maxNum - minNum);

            if(A[p1] == minNum)
            {
                p1++;
            }
            else if(B[p2] == minNum)
            {
                p2++;
            }
            else if(C[p3] == minNum)
            {
                p3++;
            }

        }

        return ans;
    }
}

/*
Intuition:
Here we place the pointers on the 0th index of the array. And we increase the pointer that has minimum element.
That is because we cannot get a better answer with the minimum value pointer.


*/
