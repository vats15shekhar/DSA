package ArraysAdvanced;

public class MinCandiesForChildren {

    public int candyCount(int[] arr)
    {
        int p1 = 1;
        int p2 = arr.length - 1;
        int[] candy = new int[arr.length];

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(i == 0 && arr[i+1] > arr[i])
            {
                candy[i] = 1;
            }
            else if(arr[i] > arr[i-1] && arr[i] > arr[i+1])
            {
                candy[i] = candy[i-1] + 1;
            }

        }
        return 1;

    }
}

/*
Problem Statement -

Given an array arr[] consisting of n positive integers representing the ratings of n children,
the task is to find the minimum number of candies required for distributing to n children such
that every child gets at least one candy and the children with the higher rating get more candies
than its neighbors.
 */
