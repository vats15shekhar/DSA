import java.util.*;
import java.io.*;
import java.math.*;

public class Solution {
    static int sum;
    static int temp;

    static int ret = 0;
    public static int solve(int A) {

        if(A%10 == A){
            return A;
        }

        sum = A%10 + solve(A/10);

        if(sum %10 != sum)
        {
            temp = sum;
            sum = 0;
            solve(temp);
        }
        else if(sum %10 == sum && sum == 1)
        {
            ret = 1;
        }

        return ret;

    }

    public static void Main(String args[]) {

       int a = solve(12345);
       System.out.print(a);

        /* Ignore and do not change the code above */
    }


}

    /* Ignore and do not change the code below */
