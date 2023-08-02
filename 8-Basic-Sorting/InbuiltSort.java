import java.util.*;

public class InbuiltSort {
    public static void printArray(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Integer arr[] = { 4, 7, 1, 3, 4, 2 };
        Arrays.sort(arr, Collections.reverseOrder());
        printArray(arr);
    }
}
