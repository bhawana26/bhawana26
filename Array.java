import java.util.*;
public class Array {
     public static int trappedrainwater(int height[]){
      int n = height.length;
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i = 1; i<n;i++){
         leftmax[i] = Math.max(leftmax[i],height[i-1]);
        }  
        int rightmax[] = new int[n];
        rightmax[n- 1] = height[n-1];
        for(int i=n-2;i>=0;i--){
         rightmax[i] = Math.max(rightmax[i],height[i+1]);
        }
        int trappedwater = 0;
        for(int i= 0;i<n; i++){
         int waterlevel = Math.min(leftmax[i],rightmax[i]);
         trappedwater += waterlevel - height[i];
        }
        return trappedwater;
     }
     public static int buyandsellatock(int price[]){
      int buyprice = Integer.MAX_VALUE;
       
       int maxprofit = 0;
      for(int i = 0;i<price.length;i++){
        if(buyprice < price[i]){
          int profit = price[i] - buyprice;
          maxprofit = Math.max(maxprofit, profit);
        }else {
          buyprice = price[i];
        }
      }
      return maxprofit;
     }
      public static boolean checkduplicates(int num[]){
            for(int i = 0; i<num.length;i++){
              for(int j = i+1;j< num.length;j++){
                    if(num[i]== num[j]){
                      return true;
                    }
              }
            }
            return false;
      }
      public static void rainwater(int water[]){
            int n = water.length;
            int leftmax[] = new int[n];
             leftmax[0] = water[0];
             for(int i = 1; i<n;i++){
              leftmax[i] = Math.max(water[i+1],leftmax[i]);
              }
              int rightmax[] = new int[n];
              rightmax[n-1] = water[n-1];
              for(int i = n-2;i>=0;i--){
                rightmax[i] = Math.max(rightmax[i],water[i-1]);
              }
              int trappedwater = 0;
              for(int i = 0;i<n; i++){
                int waterlevel = Math.max(leftmax[i],rightmax[i]);
                trappedwater = waterlevel - water[i];
                System.out.println(trappedwater);
              }
      }
    public static void main(String args[]){
        // int height[] = {4,2,0,6,3,2,5};
      // System.out.println(trappedrainwater(height));
      //int price[] = {7,1,5,3,6,4};
      //System.out.println(buyandsellatock(price));
      //int num[]  = {1,1,1,3,3,2,3,4};
      //System.out.println(checkduplicates(num));
      int water[] = {1,0,2,1,0,1,3,2,1,2,1};
      rainwater(water);
   }  
}
