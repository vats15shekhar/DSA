// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void rearrange(int[] A)
    {
        int p1 = 1;
        int p2 = A.length - 1;
        int pivot = A[0];
        int temp = 0;

        while(p1 <= p2)
        {
            if(A[p1] <= pivot)
            {
                p1++;
            }
            else if(A[p2] > pivot)
            {
                p2--;
            }
            else
            {
                temp = A[p1];
                A[p1] = A[p2];
                A[p2] = temp;
                p1++;
                p2--;
            }
        }

        temp = A[0] ;
        A[0] = A[p1 - 1];
        A[p1 - 1] = temp;

    }






    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        rearrange(A);
        System.out.println(Arrays.toString(A));

    }

    static int[] A = {10,3,8,15,6,12,2,18,7,15,14};

}