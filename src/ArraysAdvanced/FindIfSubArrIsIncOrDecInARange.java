package ArraysAdvanced;

// Find if the start and end given for the array is an increasing subarray or not
public class FindIfSubArrIsIncOrDecInARange {
    public Boolean incOrDec(int[] A, int l, int r)
    {
        int n = A.length;
        int[] incDec = new int[n];

        // Building an array to indicate increasing or decreasing values
       for( int i = 0 ; i < n-1 ; i++ )
       {
           if(A[i+1] > A[i])
           {
               incDec[i] = 1;
           }
           else
           {
               incDec[i] = 0;
           }
       }
       // Initializing the last index value of this array with 0
       incDec[n-1] =0;
       int sum = r-l;
       int[] pfIncDec = new int[n];

       //Building prefix sum array of the increasing decreasing array

        pfIncDec[0] = incDec[0];
        for(int j = 1 ; j < n ; j++)
        {
            pfIncDec[j] = incDec[j] + pfIncDec[j-1];
        }

        if((l == 0 && pfIncDec[r] == sum) || (l != 0 && (pfIncDec[r]-pfIncDec[l-1]) == sum))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
