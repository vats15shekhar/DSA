package BinarySearch;

public class FindPeakInAnUnsortedArray {

    public int peak(int[] A)
    {
        int n = A.length ;
        int l = 1;
        int h = n-2;
        int mid = 0;

        if(A[0] > A[1])
        {
            return A[0];
        }
        if(A[n-1] > A[n-2])
        {
            return A[n-1];
        }

        while(l<=h)
        {
            mid = l + (h-l)/2;

            if(A[mid] > A[mid+1] && A[mid] > A[mid-1])
            {
                return A[mid];
            }
            else if (A[mid+1] > A[mid])
            {
                l = mid+1;
            }
            else if(A[mid-1] > A[mid])
            {
                h = mid -1;
            }
        }

        return 0;
    }
}
