public class Practice {
    public static int getMaxSubArraySum(int nums[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                currentSum = 0;
                for (int k = start; k <= end; k++) {
                    currentSum += nums[k];
                }
                System.out.print(currentSum + ", ");
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        ///// Max Sub Array Sum ( Brute Force )
        int arr[] = { 1, -2, 6, -1, 3, 45 };
        System.out.println("Max Sum :" + getMaxSubArraySum(arr));

    }
}
