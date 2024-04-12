package TwoPointer;


// Find if a pair exists in an array, such that A[j] - A[i] = k. If such a pair exists then return true. Else return false.

public class FindIfDiffExistsInAnArray {

    public boolean findDiff(int[] A, int k)
    {
        int n = A.length;
        int p1 = 0;
        int p2 = 1;

        while(p1 < p2 && p2 < n && p1 < n-1)
        {
            if(A[p2] - A[p1] == k)
            {
                return true;
            }
            else if(A[p2] - A[p1] > k)
            {
                p1++;
            }
            else {
                p2++;
            }
        }

        return false;

    }
}
