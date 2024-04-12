package TwoPointer;


// In two pointer. When we do not get a better answer with a pointer, then we increase or decrease the pointer

public class FindIfSumExistsInArray {
    public boolean findIfSumExists(int[] A, int K)
    {
        int sum = 0;
        int p1 =0;
        int p2 = A.length - 1;

        while(p1 < p2)
        {
            if(A[p1] + A[p2] == K)
            {
                return true;
            }
            else if(A[p1] + A[p2] > K)
            {
                p2--;
            }
            else {
                p1++;
            }
        }

        return false;
    }

}
