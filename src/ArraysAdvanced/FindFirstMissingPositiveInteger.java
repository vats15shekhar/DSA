package ArraysAdvanced;

public class FindFirstMissingPositiveInteger {

    public int findFirstMissingInt(int[] A)
    {
        int n = A.length;
        int[] boolArr = new int[n+1];


        for (int j : A) {
            if (j <= n && j > 0) {
                boolArr[j] = 1;
            }
        }

        for(int k = 1 ; k < boolArr.length ; k++)
        {
            if(boolArr[k] != 1)
            {
                return k;
            }
        }

        return boolArr.length ;

    }

}
