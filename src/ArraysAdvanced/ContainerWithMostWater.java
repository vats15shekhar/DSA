package ArraysAdvanced;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        // we place two pointers. One at the start of the array. Another one at the end of the array

        int p1 = 0;
        int p2 = height.length - 1;
        int volume = 0;
        int maxVol = 0;
        int h = 0;

        while (p1 < p2) {

            // The volume of the water is determined by the shorter building
            h = Math.min(height[p1], height[p2]);

            // volume is height multiplied with the distance between two buildings
            volume = h * (p2 - p1);
            maxVol = Math.max(maxVol, volume); // Calculating the maximum volume


            // If a building is smaller, it will not contribute to a greater volume of water
            // so we discard the shorter building and decrease or increase the pointer accordingly
            if (height[p2] <= height[p1]) {
                p2--;
            } else {
                p1++;
            }
        }

        return maxVol;

    }
}
