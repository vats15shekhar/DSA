package BinarySearch;

public class MinTimeTakenByKWorkersToFinishTask {


    public Boolean checkMinTime(int[] A, int time, int k)
    {
       int sum = 0;
       int c = 0;

       for(int i : A)
       {
           sum += i;
           if(sum > time)
           {
               c++;
               sum = i;
           }


       }
       if(sum!=0)

       {c++;}

        return c <= k;

    }

    public int findMinTime(int[] A, int k)
    {
        // The minimum time taken for a worker to finish one task will be same as the maximum element of the array.

        int maxTime = Integer.MIN_VALUE;
        int totaltime = 0;
        for (int j : A) {
            maxTime = Math.max(j, maxTime);
            totaltime += j;
        }

        int l = maxTime;
        int h = totaltime;
        int mid = 0;
        int ans = 0;

        while(l<=h)
        {
            mid = l+(h-l)/2;

            if(checkMinTime(A, mid, k))
            {
                ans = mid;
                h = mid-1;
            }
            else
            {
                l = mid + 1;
            }

        }

        return ans;

    }


}
