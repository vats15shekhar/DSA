package SortingAlgorithms;

public class MergeSortAlgoRecursion {

   public void sortAlgo(int[] A, int s,  int e)
   {
       if(s == e)
       {
           return;
       }

       int m = s + (e-s)/2;
       sortAlgo(A, s, m);
       sortAlgo(A, m+1, e);

       mergeSortAlgo(A, s, m, e);

   }



    public void mergeSortAlgo(int[] A, int s, int m, int e)
    {

        int[] temp = new int[e-s+1];
        int p1 = s;
        int p2 = m+1;
        int p3 = 0;

        while(p1 <= m && p2 <= e)
        {
            if(A[p1] >= A[p2])
            {
                temp[p3] = A[p2];
                p3++;
                p2++;
            }
            else if(A[p1] < A[p2])
            {
                temp[p3] = A[p1];
                p1++;
                p3++;
            }

        }

        while(p1 <= m)
        {
            temp[p3] = A[p1];
            p1++;
            p3++;
        }

        while(p2 <= e)
        {
            temp[p3] = A[p2];
            p2++;
            p3++;
        }

        for(int i = 0 ; i < temp.length ; i++)
        {
            A[s++] = temp[i];
        }

    }

}
