public class Practice {
    public static void printSubArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                int sumOfSubArr = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(nums[k] + " ");
                    sumOfSubArr += nums[k];
                }
                System.out.print(" Sum: " + sumOfSubArr);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        //// Binary Search
        //// Array should be sorted
        int arrayForPairs[] = { 2, 4, 6, 8, 10 };
        printSubArray(arrayForPairs);
    }
}
