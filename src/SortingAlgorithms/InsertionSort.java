package SortingAlgorithms;

public class InsertionSort {


    public void insertionSort(int[] A)
    {
        int n = A.length ;
        int temp = 0;

        for(int i = 1 ; i < n ; i++)
        {
            int j = i - 1;
            while( j>=0){
                if(A[j] > A[j+1] ){
                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;

                }

                j-- ;
            }
        }
    }



}
