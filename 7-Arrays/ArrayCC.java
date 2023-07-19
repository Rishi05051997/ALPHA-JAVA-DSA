import java.util.Scanner;

public class ArrayCC {
    public static void updateArray(int marks[], int nonChangable) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
        nonChangable = 7;
    }

    /***
     * Linear Search
     * ----- Find the "index" of element in a given array
     */
    public static int findIdx(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int findIdx(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == key) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Largest Number
     * ---- Find the "largest" number in a given array
     */
    public static int getLargest(int nums[]) {
        int largest = Integer.MIN_VALUE; //// - infinity
        int smallest = Integer.MAX_VALUE; //// - infinity
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
            if (smallest > nums[i]) {
                smallest = nums[i];
            }
        }
        System.out.println("Smallest Value: " + smallest);
        return largest;
    }

    /**
     * Binary Search
     * ---- prerequisite - Sorted Array
     */
    public static int binarySearch(int nums[], int key) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            //// comparison
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

    /**
     * Reverse An Array
     */
    public static void reverse(int nums[]) {
        int first = 0, last = nums.length - 1;

        while (first < last) {
            //// swap
            int temp = nums[last];
            nums[last] = nums[first];
            nums[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        //// List : It us a list of elemenets of the "same" type placed in a
        //// "contiguous" memory location.
        /**
         * Operations in Arrays
         * Create
         * Input
         * Output
         * Update
         */

        /**
         * Creating An Array
         * Syntax:
         * dataType arrayName[] = new dataType[size];
         * 
         * int marks[] = new int[50];
         * 
         * int numbers[] = { 1, 2, 3 };
         * 
         * int moreNumbers[] = { 4, 5, 6 };
         * 
         * String fruits[] = { "apple", "mango", "orange" };
         */
        // int marks[] = new int[49];
        // System.out.println("Length Of Array: " + marks.length);
        // Scanner sc = new Scanner(System.in);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("Physics " + marks[0]);
        // System.out.println("Chemistry " + marks[1]);
        // System.out.println("Maths " + marks[2]);
        // System.out.println();
        // System.out.println();
        ///// Updating Value in an array
        // marks[2] = 100;
        // marks[1] = marks[1] + 4;
        // System.out.println("Chemistry " + marks[1]);
        // System.out.println("Maths " + marks[2]);

        // int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        // System.out.println("Percentage: " + percentage + "%");

        /**
         * Passing Arrays as an Argument to the Function
         * --- We always pass arrays " by referance"
         */

        // int marks[] = { 97, 98, 99 };
        // int nonChangable = 5;
        // updateArray(marks, nonChangable);
        // for (int i = 0; i < marks.length; i++) {
        // System.out.print(marks[i] + " ");
        // }
        // System.out.println();
        // System.out.println(nonChangable);

        /***
         * Linear Search
         * ----- Find the "index" of element in a given array
         * Time Complexity : O(n)
         */
        // int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        // int key = 100;
        // int index = findIdx(numbers, key);
        // if (index == -1) {
        // System.out.println("No found");
        // } else {
        // System.out.println("Key is at index: " + index);
        // }

        // String menu[] = { "Dosa", "Chole Bhature", "Samosa" };
        // String key = "Samosa";
        // int index = findIdx(menu, key);
        // if (index == -1) {
        // System.out.println("No found");
        // } else {
        // System.out.println("Key is at index: " + index);
        // }

        /**
         * Largest Number
         * ---- Find the "largest" number in a given array
         */
        // int nums[] = { 77, 87, 12, 66, 90, 123, 145, 77 };
        // int largest = getLargest(nums);
        // System.out.println("Largest Value: " + largest);

        /**
         * Binary Search
         * ---- prerequisite - Sorted Array
         * Time Complexity : O (log n)
         */

        // int sortedNum[] = { 2, 4, 6, 8, 19, 12, 14, 16 };
        // int key = 6;

        // System.out.println("index for key at: " + binarySearch(sortedNum, key));

        /**
         * Reverse An Array
         * Time Complexity : O(n)
         * Space Complexity : O(1)
         */

        int normalArr[] = { 2, 4, 6, 8 };
        reverse(normalArr);
        for (int i = 0; i < normalArr.length; i++) {
            System.out.print(normalArr[i] + " ");
        }

    }
}
