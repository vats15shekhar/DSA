package BinarySearch;

public class MaximizeTheMinDiffBetCows {

    public boolean AccomodateCows(int[] A, int cowsDist, int numCows)
    {
        int n = A.length ;
        int cnt = 1;
        int diff = 0;
        int s = A[0];

      for(int i = 1 ; i < n ; i++)
      {
          diff = A[i] - s;
          if(diff>= cowsDist)
          {
              cnt++;
              s = A[i] ;
          }
      }

      if(cnt >= numCows)
      {
          return true;
      }
      else
      {
          return false;
      }

    }


    public int maximizeMinDis(int[] A, int cows)
    {
        int l = Integer.MAX_VALUE;
        int h = A[A.length - 1] - A[0];

        for(int i = 1 ; i < A.length ; i++)
        {
            l = Math.min(l, A[i] - A[i-1]);
        }

        int mid = 0;
        int ans = 0;

        while(l<=h)
        {
           mid = l + (h-l)/2;

           if(AccomodateCows(A, mid, cows))
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
