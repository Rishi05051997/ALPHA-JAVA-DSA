public class Practice {
    public static int binarySearch(int nums[], int key) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == key) {
                return mid;
            } else if (nums[mid] < key) { //// right
                start = mid + 1;
            } else { //// left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //// Binary Search
        //// Array should be sorted
        int nums[] = { 2, 4, 6, 8, 10 };
        int jey = 89;
        System.out.println("Key founf at index: " + binarySearch(nums, jey));

    }
}
