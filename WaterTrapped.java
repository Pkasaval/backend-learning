package Array;

public class WaterTrapped {
    public static void main(String[] args) {
        // int numbers[] = {4,2,0,6,3,2,5};
        // amountOfWaterTrapped(numbers);
        int prices[] = { 7,1,5,3,6,4};
        buyAndSellStock(prices);
    }

    public static void amountOfWaterTrapped(int numbers[]){

        int leftMaxBoundary[] = new int[numbers.length];
        leftMaxBoundary[0] = numbers[0];
        for(int i=1; i<numbers.length;i++){
            leftMaxBoundary[i] = Math.max(numbers[i], leftMaxBoundary[i-1]);
        }

        int rightMaxBoundary[] = new int[numbers.length];
        int n = numbers.length;
        rightMaxBoundary[n-1] = numbers[n-1];
        for(int i=n-2; i>=0; i--){
            rightMaxBoundary[i] = Math.max(numbers[i],rightMaxBoundary[i+1]);
        }

        int WaterTrapped =0;
        for(int i=0; i<numbers.length;i++){
            int waterLevel = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);
            // if(waterLevel<0){
            //     waterLevel=0;
            // }
            WaterTrapped = WaterTrapped + (waterLevel-numbers[i]);
        }
        System.out.println(WaterTrapped);

    }

    public static void buyAndSellStock(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit = prices[i]-buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else{
               buyPrice= prices[i];
            }
        }
        System.out.println(maxProfit + "is");
    }
    
}
