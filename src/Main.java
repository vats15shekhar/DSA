// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    /*public static void mergeSort(int[] A, int s, int e)
    {
        if(s == e)
        {return;}

        int m = (s+e)/2;
        mergeSort(A, s, m);
        mergeSort(A,m+1, e);

        merge(A, s,m,e);

    }

    public static void merge(int[] A, int s, int m, int e) {

        int[] temp = new int[e-s+1];
        int p3 = 0;
        int p1 = s;
        int p2 = m+1;

    while(p1 <= m && p2 <= e)
    {
        if(A[p1] < A[p2])
        {
            temp[p3] = A[p1];
            p1++;
            p3++;
        }
        else if(A[p2] < A[p1])
        {
            temp[p3]= A[p2];
            p3++;
            p2++;
        }
    }
     if(p1 <= m)
     {
         while(p1 <= m)
         {
             temp[p3] = A[p1];
             p1++;
             p3++;
         }

     }

    if(p2 <= e)
    {
        while(p2 <= e)
        {
            temp[p3] = A[p2];
            p2++;
            p3++;
        }

    }

    for(int i = 0 ; i < temp.length ; i++)
    {
        A[i+s] = temp[i];
    }
    return;
    }*/


    public static int solve(int[] A) {


        int s = 0;
        int e = A.length -1;

        return mergeSort(A,s,e);

    }

    public static int mergeSort(int[] A, int s, int e)
    {
        if(s == e)
        {return 0;}

        int m = (s+e)/2;
        int l = mergeSort(A, s, m);
        int r = mergeSort(A,m+1, e);

        return merge(A, s,m,e) + l + r;

    }

    public static int merge(int[] A, int s, int m, int e) {


        int p3 = 0;
        int p1 = s;
        int p2 = m+1;
        int[] temp = new int[e-s+1];
        count = 0;

        while(p1 <= m && p2 <= e)
        {
            if(A[p1] > 2*A[p2])
            {
                count += m - p1 + 1;
                temp[p3] = A[p2];
                p2++;
                p3++;

            }
            else if(A[p1] < 2*A[p2])
            {
                temp[p3] = A[p1];
                p3++;
                p1++;

            }
        }

        if(p1 <= m)
        {
            while(p1 <= m)
            {
                temp[p3] = A[p1];
                p1++;
                p3++;
            }

        }

        if(p2 <= e) {
            while (p2 <= e) {
                temp[p3] = A[p2];
                p2++;
                p3++;
            }
        }

        for(int i = 0 ; i < temp.length ; i++)
        {
            A[i+s] = temp[i];
        }


        return count;

    }
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.



        int res = solve(A);
        System.out.println(res);

    }

    static int[] A = {1, 3, 2, 3, 1};
    static int count = 0;
}