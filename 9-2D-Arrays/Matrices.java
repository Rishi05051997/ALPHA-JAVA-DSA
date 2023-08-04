import java.util.Scanner;

public class Matrices {
    public static boolean search(int matrix[][], int key) {
        int n = matrix.length, m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found at: (" + i + "," + j + ")");
                    return true;
                }
            }
            System.out.println();
        }
        return false;
    }

    public static void getLargestAndSmallest(int matrix[][]) {
        int n = matrix.length, m = matrix[0].length;
        int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }
            }
        }

        System.out.println("Largest: " + largest + " " + "Smallest: " + smallest);
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // int key = 55;
        // if (search(matrix, key)) {
        // System.out.println("Yes it's there :)");
        // } else {
        // System.out.println("Sorry :(");
        // }

        getLargestAndSmallest(matrix);
    }
}
