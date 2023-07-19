public class Practice {
    public static void kadane(int nums[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(currentSum, maxSum);

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        System.out.println("Max Sum: " + maxSum);
    }

    public static void main(String[] args) {
        ///// Max Sub Array Sum ( Brute Force )
        int arr[] = { 1, -2, 6, -1, 3 };
        kadane(arr);

    }
}
