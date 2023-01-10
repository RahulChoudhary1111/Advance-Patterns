import java.util.*;
public class buyandsellstocks{
    public static int maxprofit(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(buyprice < prices[i]){
                int profit = prices[i]-buyprice;
                maxxprofit=Math.max(maxxprofit,profit);
            }
            else{
                buyprice=prices[i];
            }
        }
        return maxxprofit;
    } 
    public static void main(String args[]){
        int prices[] = {8,7,6,5,4,3,2,1};
        System.out.println(maxprofit(prices));

    }
}