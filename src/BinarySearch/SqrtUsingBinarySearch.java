package BinarySearch;

public class SqrtUsingBinarySearch {

    public int findSqrt(int N)
    {

        int l = 1;
        int h = N;
        int mid = 0;
        int ans = 0;

        while(l<=h)
        {
            mid = l + (h-l)/2;

            if(mid*mid == N)
            {
                return mid;
            }
            else if(mid*mid < N)
            {
                ans = mid;
                l = mid+1;
            }
            else if(mid*mid > N)
            {
                h = mid - 1;
            }
        }

        return ans;


    }
}
