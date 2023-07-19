public class Practice {
    public static void printPairs(int nums[]) {
        int tp = 0;
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i]; //// 2, 4, 6, 8, 10
            for (int j = i + 1; j < nums.length; j++) {
                System.out.print("(" + current + "," + nums[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: " + tp);
    }

    public static void main(String[] args) {
        //// Binary Search
        //// Array should be sorted
        int arrayForPairs[] = { 2, 4, 6, 10, 12, 14 };
        printPairs(arrayForPairs);
    }
}
