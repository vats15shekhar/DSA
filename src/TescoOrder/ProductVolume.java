package TescoOrder;

import javax.swing.*;

public class ProductVolume {

   public int productVolume(int productId) {
       int prodVolume = 0;

       if (productId == 1) {
           prodVolume = 2 * 4 * 10;
       } else if (productId == 2) {
           prodVolume = 10 * 30 * 4;
       } else if (productId == 3) {
           prodVolume = 5 * 6 * 7;
       }
       return prodVolume;
   }


}
