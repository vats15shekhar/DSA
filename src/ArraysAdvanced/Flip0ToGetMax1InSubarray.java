package ArraysAdvanced;

public class Flip0ToGetMax1InSubarray {

    public int KadaneforFlip(int[] A)
    {
        int cntMax = Integer.MIN_VALUE;
        int cnt =0;
        int sum = 0;

        for(int i = 0 ; i < A.length ; i++)
        {
            sum += A[i];
            cnt++;
            cntMax = Math.max(cntMax, cnt);

            if(sum < 0)
            {
                sum = 0;
                cnt = 0;
            }
        }

        return cntMax;
    }

    public int maxOnesInASubarrayAfterFlipping(int[] A)
    {
        // iterating on this array to flip the 1s to -1 because once flipped,
        // they will become 0 and they will have a negative contribution in the sum

        for(int i = 0 ; i < A.length ; i++)
        {
            if(A[i] == 0)
            {
                A[i] = 1;
            }
            else if(A[i] == 1)
            {
                A[i] = -1;
            }
        }

       return KadaneforFlip(A);
    }
}
