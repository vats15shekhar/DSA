package ArraysAdvanced;

public class FindFirstMissingPositiveInteger {

    public int findFirstMissingInt(int[] A)
    {
        // With extra space. A boolean array
       /* int n = A.length;
        int[] boolArr = new int[n+1];
        for (int j : A) {
            if (j <= n && j > 0) {
                boolArr[j] = 1;
            }
        }
        for(int k = 1 ; k < boolArr.length ; k++)
        {
            if(boolArr[k] != 1)
            {
                return k;
            }
        }
        return boolArr.length ;*/

        // Without extra space
        int n = A.length;
        int filler = n + 1;
        int ind = 0;

        for(int i = 0 ; i < n ; i++)
        {
            if(A[i] <= 0)
            {
                A[i] = filler;
            }
        }

        for(int j = 0 ; j < n ; j++)
        {
            if(Math.abs(A[j]) <= n && Math.abs(A[j]) > 0)
            {// We are first checking if the Absolute value of the element is less than n and greater than 0
             // In that case we go to the index position A[j] - 1. then make that element negative. Negative element indicates presence of the element
                ind = Math.abs(A[j]) - 1;
                A[ind] = A[ind] * -1;
            }
        }

        //Now iterate on the entire array to check a positive integer. A positive integer indicates the absence of the element in the array
        for(int k = 0 ; k < n ; k++)
        {
            if(A[k] > 0)
            {
                return k + 1;
            }
        }

        // If all the elements are negative in the array. which means that the first missing number is n+ 1
        return n+1;

    }

}
