package BinarySearch;

public class FindSubarraySumOfLengthKLessOrEqualToB {

    public int findMaxSubarray(int[] A, int k, int B)
    {
        int sum = 0;
        // looping through the array to find the sum of first subarray of window length k

        for(int i = 0 ; i < k ; i++)
        {
            sum+= A[i];
        }

        int maxSum = Integer.MIN_VALUE;

        if(sum <= B)
        {
            maxSum = Math.max(maxSum, sum);
        }
        else
        {
            return sum;
        }

        int e = k;
        int s = 1;

        while (e < A.length)
        {
            sum = sum - A[s-1] + A[e];
            if(sum <= B)
            {
                maxSum = Math.max(maxSum, sum);
            }
            else
            {
                break;
            }
            s++;
            e++;
        }

        return maxSum;
    }

    public int findMaxK(int[] A, int B)
    {


        int l = 1;
        int h = A.length - 1;
        int mid = 0;
        int ans = 0;

        while(l <=h)
        {
            mid = l + (h-l)/2;

            if(findMaxSubarray(A, mid, B) <= B)
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
