package Practice;

import java.util.*;

public class Practice {

    public int unitOfRainwaterTrapped(int[] rainwater){

        int n = rainwater.length;
        int[] leftmax = new int[n];
        int[] rightmax = new int[n];
        leftmax[0] = rainwater[0];
        rightmax[n-1] = rainwater[n-1];

        //Get the maximum height if the building from the left side
        for(int i = 1; i < rainwater.length; i++){
            leftmax[i] = Math.max(leftmax[i-1], rainwater[i]);
        }

        //Get the maximum height of the building from the right side
        for(int i = n-2 ; i >=0 ; i--){
            rightmax[i] = Math.max(rightmax[i+1], rainwater[i]);
        }

        int totalwaterunits = 0;

        for(int i = 1 ; i < n-1 ; i++){

         int   lmax = leftmax[i-1];
         int   rmax = rightmax[i+1];

         int h = Math.min(lmax,rmax);

         totalwaterunits += Math.max(h- rainwater[i], 0);
        }
        return totalwaterunits;

    }

}