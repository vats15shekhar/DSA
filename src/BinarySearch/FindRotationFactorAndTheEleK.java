package BinarySearch;

public class FindRotationFactorAndTheEleK {

    public int rotationFactor(int[] A)
    {
        int l = 0;
        int h = A.length - 1;
        int mid = 0;
        int k = 0;

        while(l <= h)
        {
            mid = l + (h-l)/2;

            if(A[mid] < A[0])
            {
                k = mid;
                h = mid-1;
            }
            else
            {
                l = mid+1;
            }

        }

        return k;
    }

    public int findEleByBinSearch(int[] A, int s, int e, int ele)
    {
        int l = s;
        int h = e;
        int mid = 0;
        while(l<=h)
        {
            mid = l + (h-l)/2;
            if(A[mid] == ele)
            {
                return A[mid];
            }
            else if(A[mid] > ele)
            {
                h = mid - 1;
            }
            else
            {
                l = mid+1;
            }

        }

        return 0;
    }

    public int findEle(int[] A, int ele)
    {
        int rot = rotationFactor(A);

        if(ele < A[0])
        {
           return findEleByBinSearch(A, rot, A.length - 1, ele);
        }
        else
        {
          return  findEleByBinSearch(A, 0, rot-1, ele);
        }

    }

}
