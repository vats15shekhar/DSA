package ArraysAdvanced;

public class KSwapsToBringAnElementTogether {

    public int kMinSwaps(int[] A, int num)
    {
        int l = 0;
        //looping through the input array to find the total number of elements we
        // want to bring together

        for(int i = 0 ; i <A.length ; i++)
        {
            if(num == A[i])
            {
                l++;
            }
        }

        // We will take a window of length l and find out the total number
        // of num elements in the first window 0 to l-1
        int cnt = 0;
        int minswap = Integer.MAX_VALUE;

        for(int j = 0 ; j < l ; j++)
        {
            if(A[j] == num)
            {
                cnt++;
            }
        }

        // The number of swap required to get all num elements together,
        // is the total length - number of num elements in the 1st window
        minswap = l - cnt;


       // Now we want to move the window to the next and see if the cnt increases because of num element. If there are more num elements in the next window, that will mean that the number of swaps will decrease
        int s = 1;
        int e = l ;

        while(e < A.length)
        {
            // if the element which is going out is num, then we subtract 1 from cnt
            if(A[s-1] == num)
            {
                cnt--;
            }

            // if the element which is entering the window is num. then we increase the cnt
            if(A[e] == num)
            {
                cnt++;
            }

            // l-cnt will be the total swaps required to get the num elements together. We check which is the min swap
            minswap = Math.min(l-cnt, minswap);

            s++;
            e++;
        }

        return minswap;
    }
}
