package TwoPointer;

// Find the maximum rainwater that can be trapped between any two buildings. A[i] represents the height of the building

public class RainWaterUsingTwoPointers {

    public int maxRainWaterBetweenBuildings(int[] A)
    {
        int n = A.length;
        int p1 = 0;
        int p2 = n-1;
        int width = 0;
        int height = 0;
        int volume = 0;
        int ans = Integer.MIN_VALUE;

        while(p1 < p2)
        {
            height = Math.min(A[p1], A[p2]); // we are picking the building with min height. Because that height will determine the water contained between the two buildings.
            width = p2-p1; // This is the distance between the two buildings.
            volume = height * width; // volume of water trapped between the two buildings
            ans = Math.max(volume, ans); // This is the max volume of water

            if(A[p1] < A[p2])
            {
                p1 ++;
            }
            else
            {
                p2 --;
            }

        }
        return ans;

    }

    /*
    Intuition:

    Here we are keeping the pointers at the two ends of the array. We are not keeping them together,
    because it will be difficult to decide which pointer to move. Once we have the pointer at the ends,
    the water which will be contained within the buildings will be the distance between the two buildings * the min
    length building. Only the smaller building will decide how much water will be held between the two buildings.
    Once we calculate with the min building, we know that we will not get a better answer with that building anymore.

    Say we change the other pointer, it will reduce the distance between the earlier building. And no matter if the new
    building is higher or smaller, the volume will be less in both cases.

    Which is why we get rid of the min building, because we won't get a better answer with it.
    And we keep changing the pointer based on which building is smaller.

     */



}
