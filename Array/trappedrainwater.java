import java.util.*;
public class trappedrainwater{
    public static int rainwater(int height []){
        int n = height.length;

        //calculate left max boundary

         int leftmax[] = new int [n];
         leftmax[0] = height[0];
         for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
         }

         //calculate right max boundary

         int rightmax[]=new int[n];
         rightmax[n-1]=height[n-1];
         for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
         }
         int trappedwater=0;

         //loop

         for(int i=0;i<n;i++){
            //waterlevel
            int waterlevel = Math.min(rightmax[i],leftmax[i]);
            //trappedwater
            trappedwater+=waterlevel-height[i];
         }
         return trappedwater;

    }
    public static void main(String args[]){
        int height[]={2,1,4,2,0,2,4,6,0,4};
        System.out.println(rainwater(height));
    }
}