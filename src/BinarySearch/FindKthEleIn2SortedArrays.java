package BinarySearch;

// Find the kth index element if 2 sorted arrays were merged together to form a sorted array.
// We cannot use extra space and we cannot merge sort the given arrays.

public class FindKthEleIn2SortedArrays {

    public int FindSmallerElements(int[] A, int k)
    {
        int l = 0;
        int h = A.length - 1;
        int mid = 0;
        // Initializing the ans to -1, because if there are no elements less than k,
        // we want to send the cnt as 0. In the return we are adding 1 to ans and returning.
        // A -1 will indicate that there are no lesser elements and cnt will be returned as 0
        int ans = -1;

        while(l <= h)
        {
            mid = l + (h-l)/2;


            if(A[mid] < k)
            {
                ans = mid;
                l = mid + 1;
            }
            else if (A[mid] >= k)
            {
                h = mid - 1;
            }
        }

        return ans + 1;
    }

    public int FindKthIndexElement(int[] A, int[] B, int k)
    {
        int l = Integer.MAX_VALUE;
        int h = Integer.MIN_VALUE;
        int mid = 0;
        int ans = 0;
        int cnt = 0;

        // These for loops are to find the minimum and maximum element from both the arrays
        for(int x : A)
        {
            l = Math.min(l, x);
            h = Math.max(h, x);
        }

        for(int y : B)
        {
            l = Math.min(l, y);
            h = Math.max(h, y);
        }

        while(l <= h)
        {
            mid = l + (h-l)/2;

            cnt = FindSmallerElements(A, mid) +  FindSmallerElements(B, mid);

            if(cnt <= k)
            {
                ans = mid;
                l = mid + 1;
            }
            else
            {
                h = mid - 1;
            }

        }

        return ans;

    }


}
