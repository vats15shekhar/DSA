package ArraysAdvanced;

public class MaxStrictlyIncSubarray {

    public int MaxIncSubarray(int[] A)
    {
        {
            int maxEle = Integer.MIN_VALUE;

            for(int i = 0 ; i < A.length ; i++)
            {
                maxEle = Math.max(maxEle, A[i]);
            }

            int[] boolArr = new int[maxEle + 1];
            int cnt = 0;
            int maxCnt = Integer.MIN_VALUE;

            for(int j = 0 ; j < A.length ; j++)
            {
                boolArr[Math.abs(A[j])] = 1;

            }

            for(int k = 0 ; k < boolArr.length ; k++)
            {
                if(boolArr[k] == 1)
                {
                    cnt++;
                }
                else
                {
                    cnt = 0;
                }
                maxCnt = Math.max(cnt,maxCnt);
            }

            return maxCnt;

        }
    }

}
