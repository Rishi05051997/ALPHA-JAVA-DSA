public class Practice {
    public static int getLargest(int nums[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
            }

            if (smallest > nums[i]) {
                smallest = nums[i];
            }

        }
        System.out.println("Smallest: " + smallest);
        return largest;
    }

    public static void main(String[] args) {

        int nums[] = { 44, 55, 12, 4, 777, 89, 56, 1, 89272 };
        System.out.println("Largest: " + getLargest(nums));

    }
}
