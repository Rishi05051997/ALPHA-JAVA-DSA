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

    /**
     * Pairs in an Array
     * For ex.
     * int arr[] = {2,4,6,8};
     * //// below one we are finding all possible pairs of the given array
     * (2,4) (2,6) (2,8) (2,10)
     * (4,6) (4,8) (4,10)
     * (6,8) (6,10)
     * (8,10)
     * 
     * //// Here we are using nested loops
     * Time Complexity: O(n^2)
     */

    public static void printPairs(int nums[]) {
        int totalPairs = 0;
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i]; ///// 2, 4, 6, 10
            for (int j = i + 1; j < nums.length; j++) {
                System.out.print("(" + current + "," + nums[j] + ") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: " + totalPairs);
    }

    /**
     * Print Subarrays
     * ---- a "continuous" part of an array
     * 
     * For ex.
     * int arr[] = {2,4,6,8,10}
     * 2: {2},{2,4}, {2,4,6}, {2,4,6}, {2,4,6,10}
     * 4: {4},{4,6}, {4,6,8}, {4,6,8,10}
     * 8: {8},{8,10}
     * 10:{10}
     * 
     * //// Nested Loops
     * Time Complexity: O(n^2)
     * Output:
     * { 2, }
     *
     * Sum: 2
     * { 2, 4, }
     * 
     * Sum: 6
     * { 2, 4, 6, }
     * 
     * Sum: 12
     * { 2, 4, 6, 8, }
     * 
     * Sum: 20
     * { 2, 4, 6, 8, 10, }
     * 
     * Sum: 30
     * { 4, }
     * 
     * Sum: 4
     * { 4, 6, }
     * 
     * Sum: 10
     * { 4, 6, 8, }
     * 
     * Sum: 18
     * { 4, 6, 8, 10, }
     * 
     * Sum: 28
     * { 6, }
     * 
     * Sum: 6
     * { 6, 8, }
     * 
     * Sum: 14
     * { 6, 8, 10, }
     * 
     * Sum: 24
     * { 8, }
     * 
     * Sum: 8
     * { 8, 10, }
     * 
     * Sum: 18
     * { 10, }
     * 
     * Sum: 10
     * Total Sub Arrays: 15
     */

    public static void printSubArrays(int nums[]) {
        int totalSubArrays = 0;
        for (int i = 0; i < nums.length; i++) {
            int start = i; //// 2,4,6,8,10
            for (int j = i; j < nums.length; j++) {
                int end = j;
                int sumOfSubArr = 0;
                System.out.print("{ ");
                for (int k = start; k <= end; k++) {
                    sumOfSubArr += nums[k];
                    System.out.print(nums[k] + ", "); //// Subarray
                }
                System.out.println(" }");
                totalSubArrays++;
                System.out.println();
                System.out.println("Sum: " + sumOfSubArr);
            }
        }
        System.out.println("Total Sub Arrays: " + totalSubArrays);
    }

    /**
     * Max Subarray Sum ( Brute Force )
     * 
     * For Ex.
     * int arr[] = {1,-2,6,-1};
     * Sub Arrays are:
     * {1} {1,-2} {1,-2,6} {1,-2,6,-1, 3}
     * {-2} {-2,6} {-2,6} {-2,6,-1, 3}
     * {6} {6,-1, 3}
     * {-1, 3}
     * {3}
     * 
     * Time Complexity: O(n^3)
     * Output: 8
     */
    public static void getMaxSubArraySumBruteForce(int nums[]) {
        int currentSum = 0;
        int maxSumVal = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                currentSum = 0;
                for (int k = start; k <= end; k++) {
                    //// Subarray Sum
                    currentSum += nums[k];
                }
                System.out.print(currentSum + " ");
                //// Current sum is greater than max sum value then we are assigning current sum
                //// value into max sum
                if (currentSum > maxSumVal) {
                    maxSumVal = currentSum;
                }
            }
        }
        System.out.println();
        System.out.println("Max Sum: " + maxSumVal);
    }

    /**
     * Max Sub Array Sum
     * --- Prefix Sum Array Approach ( More Optimized Approach )
     * Prefix Array Formula: prefix[i-1] + arr[i]
     * Formula : prefix[end] - prefix[start-1]
     * 
     * Time Complexity : O(n^2)
     */
    public static int getMaxSubArraySumPrefixSumApproach(int nums[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        //// calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = start; j < nums.length; j++) {
                int end = j;
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Max Sum: " + maxSum);
        return maxSum;
    }

    /**
     * Max Subarray Sum
     * ---- Kadane's Algorithm
     * Time Complexity: O(n)
     */

    public static int getMaxSubArraySumUsingKadenAlgorithm(int nums[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            ;
            maxSum = Math.max(currentSum, maxSum);
        }
        System.out.println("Max Sub Array Sum: " + maxSum);
        return maxSum;
    }

    public static void main(String[] args) {
        //// List : It is a list of elemenets of the "same" type placed in a
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

        // int normalArr[] = { 2, 4, 6, 8 };
        // reverse(normalArr);
        // for (int i = 0; i < normalArr.length; i++) {
        // System.out.print(normalArr[i] + " ");
        // }

        /**
         * Pairs in an Array
         * For ex.
         * int arr[] = {2,4,6,8};
         * //// below one we are finding all possible pairs of the given array
         * (2,4) (2,6) (2,8) (2,10)
         * (4,6) (4,8) (4,10)
         * (6,8) (6,10)
         * (8,10)
         * 
         * //// Here we are using nested loops
         * 
         * Formula For Calculating total no of pairs in an array
         * total pairs = n(n-1)/2; where n = no of elements in an array
         * Time Complexity: O(n^2)
         */

        // int arrForPairs[] = { 2, 4, 6, 8, 10 };
        // printPairs(arrForPairs);

        /**
         * Print Subarrays
         * ---- a "continuous" part of an array
         * 
         * For ex.
         * int arr[] = {2,4,6,8,10}
         * 2: {2},{2,4}, {2,4,6}, {2,4,6}, {2,4,6,10}
         * 4: {4},{4,6}, {4,6,8}, {4,6,8,10}
         * 8: {8},{8,10}
         * 10:{10}
         * 
         * //// Nested Loops
         * Time Complexity: O(n^2)
         */

        // int arrForSubArrays[] = { 2, 4, 6, 8, 10 };

        // printSubArrays(arrForSubArrays);

        /**
         * Max Subarray Sum ( brute Force )
         * 
         * For Ex.
         * int arr[] = {1,-2,6,-1};
         * Sub Arrays are:
         * {1} {1,-2} {1,-2,6} {1,-2,6,-1}
         * {-2} {-2,6} {-2,6} {-2,6,-1}
         * {6} {6-1}
         * {1}
         */

        // int maxSubArraySum[] = { 1, -2, 6, -1, 3 };
        // getMaxSubArraySumBruteForce(maxSubArraySum);

        /**
         * Max Sub Array Sum
         * --- Prefix Sum Array Approach ( More Optimized Approach )
         * Prefix Array Formula: prefix[i-1] + arr[i]
         * Formula : prefix[end] - prefix[start-1]
         */

        // int prefixArrMaxSumArr[] = { 1, -2, 6, -1, 3 };

        // getMaxSubArraySumPrefixSumApproach(prefixArrMaxSumArr);

        /**
         * Max Subarray Sum
         * ---- Kadane's Algorithm
         * Time Complexity: O(n)
         */

        int kadaneArr[] = { -1, -2, -4, -6 };

        getMaxSubArraySumUsingKadenAlgorithm(kadaneArr);

    }
}
