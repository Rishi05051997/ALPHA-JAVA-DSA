public class SelectionSort {

    public static void selection(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }

            //// now swapping to the starting
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        //// Selection Sort
        //// Pick the smallest ( from unsorted ), put it at the beginning

        int arr[] = { 4, 5, 2, 1, 3 };
        selectionSort(arr);
        printArr(arr);

    }
}
