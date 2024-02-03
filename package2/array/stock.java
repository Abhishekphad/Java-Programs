package package2.array;
import java.util.*;
public class stock {
    public static int stockprice(int[] prices){
        int profit=0;
        int buy= prices[0];
        for(int i=1;i<prices.length;i++){
            if(buy<profit){
                profit+=(buy-prices[i]);
            }else{
                buy=prices[i];
            }
        }
        return profit;
    }  
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(stockprice(prices));
    }
}
