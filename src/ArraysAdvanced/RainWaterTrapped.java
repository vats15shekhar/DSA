package ArraysAdvanced;

public class RainWaterTrapped {

    public int rainWaterUnits(int[] A)
    {
        int[] prefixMax = new int[A.length];
        int[] suffixMax = new int[A.length];

        prefixMax[0] = A[0];
        suffixMax[A.length - 1] = A[A.length - 1];

        // Generating prefix max. left max array
        for(int i = 1 ; i < A.length ;i++)
        {
            prefixMax[i] = Math.max(prefixMax[i-1], A[i]);
        }

        // generating suffix max. Right max array
        for(int j = A.length - 2 ; j >= 0 ; j--)
        {
            suffixMax[j] = Math.max(suffixMax[j+1], A[j]);
        }

        //variables needed to calculate the rainwater
        int sum = 0;
        int lmax = 0;
        int rmax = 0;
        int height = 0;

        for(int k = 1 ; k < A.length -1 ; k++)
        {
            lmax = prefixMax[k-1];
            rmax = suffixMax[k+1];

            height = Math.min(lmax,rmax);

            sum += Math.max((height - A[k]),0);

        }

        return sum;

    }

}
