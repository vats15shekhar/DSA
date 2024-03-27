package BinarySearch;

public class FindFrequency {

    public int frequency(int[] A, int k)
    {
        int n = A.length;
        int l = 0;
        int h = n-1;
        int mid = 0;
        int s = 0;
        int e = 0;

        while(l<=h)
        {
            mid = l + (h-l)/2;

            if(A[mid] == k)
            {
               s = mid;
               h = mid - 1;
            }
           else if (A[mid]> k)
            {
                h = mid - 1;
            }
           else
            {
                l = mid + 1;
            }
        }

        l = 0;
        h = n-1;
        mid = 0;
        while(l <= h)
        {
            mid = l + (h-l)/2;

            if(A[mid] == k)
            {
                e = mid;
                l = mid + 1;
            }
            else if (A[mid]> k)
            {
                h = mid - 1;
            }
            else
            {
                l = mid + 1;
            }
        }

        return e - s + 1;

    }
}
