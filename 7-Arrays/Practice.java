public class Practice {
    public static void bestTimeToBuyAndSellStock(int nums[]) {
        int buyPrice = Integer.MAX_VALUE;
        int overallProfit = 0;
        for (int i = 0; i < nums.length; i++) {
            if (buyPrice < nums[i]) {
                int profit = nums[i] - buyPrice;
                overallProfit = Math.max(overallProfit, profit);
            } else {
                buyPrice = nums[i];
            }
        }
        System.out.println(overallProfit);
    }

    public static void main(String[] args) {
        int nums[] = { 7, 1, 5, 3, 6, 4 };
        bestTimeToBuyAndSellStock(nums);
    }
}
