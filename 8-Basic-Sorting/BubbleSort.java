public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        int length = arr.length - 1;
        int turn, j, temp;
        boolean swapped;
        for (turn = 0; turn < length; turn++) {
            swapped = false;
            for (j = 0; j < length - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    ///// swapping for moving larger element to the end
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            //// if no two elements were swapped then it is considerd as a sorted array
            if (swapped == false)
                break;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        bubbleSort(arr);
        printArr(arr);
    }
}
