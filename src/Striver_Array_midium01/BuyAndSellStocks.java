package Striver_Array_midium01;// Best time to buy and sell stocks
public class BuyAndSellStocks{
    static int buyShit(int[] num){
        int minimun=num[0];
        int profit=0;
        for (int i=0; i < num.length; i++) {
            int cost = num[i] - minimun;

            profit = Math.max(profit,cost);
            minimun = Math.min(minimun,num[i]);
        }
        return profit;
    }
    public static void main(String[] args){
        int[] arr = {7,1,5,3,6,4};
        System.out.println(buyShit(arr));
    }
}
