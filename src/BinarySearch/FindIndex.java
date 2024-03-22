package BinarySearch;

public class FindIndex {

   // Given a sorted array arr[] consisting of N distinct integers and an integer K, the task is to find the index of K, if it’s present in the array arr[]. Otherwise, find the index where K must be inserted to keep the array sorted.

    public int find_index(int[] arr, int n, int K)
    {

        // Lower and upper bounds
        int start = 0;
        int end = n - 1;

        // Traverse the search space
        while (start <= end)
        {
            int mid = (start + end) / 2;

            // If K is found
            if (arr[mid] == K)
                return mid;

            else if (arr[mid] < K)
                start = mid + 1;

            else
                end = mid - 1;
        }

        // Return insert position
        return end + 1;
    }
}
