package ArraysAdvanced;

// Find if the start and end given for the array is an increasing subarray or not
public class FindIfSubArrIsIncOrDecInARange {
    public Boolean incOrDec(int[] A, int l, int r)
    {
        int n = A.length;
        int[] incDec = new int[n];

        // Building an array to indicate increasing or decreasing values.
        /*
        If i -> i+1 is an increasing number then set A[i] to 1. Say we are asked to
        check if the subarray is increasing between left to right index. We have to check
        if the subarray consists of 1s between left to right-1. That is because we are checking
        the increasing subarray till right index, and not right + 1. If we take right into consideration
        then it will mean that we are also checking increasing sub array from right to right + 1.
        Which is not the case.
         */
       for( int i = 0 ; i < n-1 ; i++ )
       {
           if(A[i+1] > A[i]) // Check if i+1 is > than i. Set that array index to 1.
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
        /*
        Now create a prefix sum array so that it can be useful to check the subarray sum
         */
        pfIncDec[0] = incDec[0];
        for(int j = 1 ; j < n ; j++)
        {
            pfIncDec[j] = incDec[j] + pfIncDec[j-1];
        }

        /*
        If left index is 0 check prefix till right-1. If it equals right index - left index
        then the subarray is increasing.

        If left index is not zero then check the subarray sum between r-1 and l-1
         */
        if((l == 0 && pfIncDec[r-1] == sum) || (l != 0 && (pfIncDec[r-1]-pfIncDec[l-1]) == sum))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
