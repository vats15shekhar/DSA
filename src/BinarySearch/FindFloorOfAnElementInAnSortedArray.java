package BinarySearch;

public class FindFloorOfAnElementInAnSortedArray {

    public int findFloor(int[] A, int k)
    {
        int ans = Integer.MIN_VALUE;
        int n = A.length;
        int l = 0;
        int h = n-1;
        int mid = 0;

        while(l<=h)
        {
            mid = l + (h-l)/2;

            if(A[mid] == k)
            {
                return A[mid];
            }
            else if(A[mid] > k)
            {
                h = mid - 1;
            }
            else
            {
                ans = A[mid];
                l = mid + 1;
            }
        }

        return ans;

    }

}
