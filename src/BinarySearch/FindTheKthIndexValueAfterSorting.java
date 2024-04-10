package BinarySearch;

// Find the kth index value in an array after sorting the array. You are not used to sort the actual array and you cannot use any extra space

public class FindTheKthIndexValueAfterSorting {

    public int findCount(int[] A, int x)
    {
        int cnt = 0;

        for(int i = 0 ; i < A.length ; i++)
        {
            if(A[i] < x)
            {
                cnt++;
            }
        }

        return cnt;

    }

    public int findKthElement(int[] A, int k)
    {
        int ans = 0;
        int l = Integer.MAX_VALUE;
        int h = Integer.MIN_VALUE;

        for(int i = 0 ; i < A.length ; i++)
        {
            l = Math.min(A[i], l);
            h = Math.max(A[i], h);
        }

        int mid = 0;
        int x = 0;

        while(l<=h)
        {
            mid = l + (h-l)/2;

            x = findCount(A, mid);

            if(x == k)
            {
                ans = mid;
                l = mid+1;
            }
            else if( x < k)
            {
                l = mid+1;
            }
            else
            {
                h = mid - 1;
            }

        }

        return ans;


    }


}
