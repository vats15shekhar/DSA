public class Rearrange {


    public static void rearr(int[] A)
    {
        int p1 = 1;
        int p2 = A.length - 1;
        int pivot = A[0];
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

        temp = A[0] ;
        A[0] = A[p1 - 1];
        A[p1 - 1] = temp;

    }
}
