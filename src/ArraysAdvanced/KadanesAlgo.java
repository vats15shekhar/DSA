package ArraysAdvanced;

public class KadanesAlgo {

    public int kadane(int[] A)
    {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int n = A.length;

        for(int i = 0 ; i < n ; i++)
        {
            // In Kadane's Algo we take take sum only if the sum till now is positive.
            // Once it becomes negative, we set the sum to 0. That is because a negative
            // value will only make the total sum lesser
            sum = sum + A[i];
            max = Math.max(sum, max);

            if(sum < 0)
            {
                sum = 0;
            }

        }

        return max;
    }
}
