package BinarySearch;

public class FindAthMagicalNumber {

    public int findLCM(int num1, int num2) {
        return (num1 * num2) / findGCD(num1, num2);
    }

    public int findGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return findGCD(num2, num1 % num2);
    }

    public int count(int B, int C, int A)
    {
        return A/B + A/C - A/findLCM(B,C);
    }

    public int findAthMagicalNumber(int B, int C, int A)
    {

        int l = 1;
        int h = A * Math.min(B, C);
        int mid = 0;
        int x = 0;
        int ans = 0;

        while(l<=h)
        {
            mid = l + (h-l)/2;

            x = count(B,C,mid);

            if(A == x)
            {
                ans = mid;
                h = mid - 1;
            }
            else if(x > A)
            {
                h = mid - 1;
            }
            else
            {
                l = mid + 1;
            }


        }


       return ans;

    }

}
