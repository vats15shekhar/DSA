package SortingAlgorithms;

public class MergeSort {

    public int[] sortArrays(int[] A, int[] B)
    {

        int m = A.length ;
        int n = B.length;
        int[] temp = new int[m+n];
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        while(p1 < m && p2 < n)
        {
            if(A[p1] > B[p2])
            {
                temp[p3] = B[p2];
                p3++;
                p2++;
            }
            else if(A[p1] < B[p2])
            {
                temp[p3] = A[p1];
                p1++;
                p3++;
            }

        }

        while(p1 != m)
        {
            temp[p3] = A[p1];
            p1++;
            p3++;
        }

        while(p2 != n)
        {
            temp[p3] = B[p2];
            p2++;
            p3++;
        }

        return temp;
    }
}
