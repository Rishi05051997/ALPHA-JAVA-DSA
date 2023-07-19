public class Practice {
    public static int getMaxSubArraySumUsingPrefixArrayApproach(int nums[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int prefix[] = new int[nums.length];

        //// creating prefix array
        prefix[0] = nums[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for (int i = 0; i < prefix.length; i++) {
            int start = i;
            for (int j = 0; j < prefix.length; j++) {
                int end = j;
                //// calculate sum
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("max sum: " + maxSum);
        return maxSum;
    }

    public static void main(String[] args) {
        ///// Max Sub Array Sum ( Brute Force )
        int arr[] = { 1, -2, 6, -1, 3 };
        getMaxSubArraySumUsingPrefixArrayApproach(arr);

    }
}
