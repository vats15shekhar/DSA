package SortingAlgorithms;

public class QuickSort {

    public int rearrange(int[] A, int s, int e)
    {
        int p1 = s+1;
        int p2 = e;
        int pivot = A[s];
        int temp = 0;

        while(p1 <= p2)
        {
            if(A[p1] <= pivot)
            {
                p1++;
            }
            else if(A[p2] > pivot)
            {
                p2--;
            }
            else
            {
                temp = A[p1];
                A[p1] = A[p2];
                A[p2] = temp;
                p1++;
                p2--;
            }
        }

        temp = A[s] ;
        A[s] = A[p1 - 1];
        A[p1 - 1] = temp;

        return p1 -1 ;
    }

    public void quickSort(int[] A, int s, int e)
    {

       if( s >= e) {
           return;
       }

        int p = rearrange(A, s, e);

        quickSort(A, s, p-1);
        quickSort(A, p+1, e);

    }


}
