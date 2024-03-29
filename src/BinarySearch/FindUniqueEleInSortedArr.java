package BinarySearch;

public class FindUniqueEleInSortedArr {

    //Find unique element in a sorted array where there is just one unique elements and rest are duplicate pairs

    public int findUnique(int[] A)
    {
        int n = A.length;

        if(A.length == 0)
        {
            return A[0];
        }
        else if(A[0] != A[1])
        {
            return A[0];
        }
        else if(A[n-1] != A[n-2])
        {
            return A[n-1];
        }

        int l = 1;
        int h = n-2;
        int mid = 0;

        while(l<=h)
        {
            mid = l + (h-l)/2;

            if(A[mid] != A[mid-1] && A[mid] != A[mid+1])
            {
                return A[mid];
            }
            if(A[mid] == A[mid-1])
            {
                mid = mid -1;
            }
            if(mid%2 == 0)
            {
                l = mid + 2;
            }
            else
            {
                h = mid - 1;
            }

        }

        return 0;

    }
}
