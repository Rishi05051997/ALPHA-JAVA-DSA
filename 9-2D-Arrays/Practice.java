import java.util.Scanner;

public class Practice {

    public static boolean searchingInSortedMatrixArray(int matrix[][], int key) {

        // ///// using Brute Force Approach O(n^2)
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix.length; j++) {
        // if (matrix[i][j] == key) {
        // System.out.println("Found at: (" + i + "," + j + ")");
        // return true;
        // }
        // }
        // }

        /////// Using Staircase Search
        int row = 0, col = matrix[0].length - 1;
        while (row <= matrix.length && col >= 0) {
            int cellValue = matrix[row][col];
            if (cellValue == key) {
                System.out.println("key Found at (" + row + "," + col + ")");
                return true;
            } else if (key < cellValue) {
                //// moving left direction
                col--;
            } else {
                //// moving bottom direction
                row++;
            }
        }
        System.out.println("Key not found!");
        return false;
    }

    public static void diagonalSum(int matrix[][]) {
        int sum = 0;
        int n = matrix.length;

        //// less optimized O(n^2)
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix.length; j++) {
        // if (i == j) {
        // sum += matrix[i][j];
        // } else if ((i + j) == n - 1) {
        // sum += matrix[i][j];
        // }
        // }
        // }

        //// more optimized

        for (int i = 0; i < matrix.length; i++) {
            //// for Primary Diagoanl Sum
            sum += matrix[i][i];

            //// for secondary diagonal sum
            int j = n - 1 - i;
            if (i != j) {
                sum += matrix[i][j];
            }
        }

        System.out.println("Sum: " + sum);
    }

    public static void printSpiral(int matrix[][]) {
        int startRow = 0, startColumn = 0;
        int endRow = matrix.length - 1, endColumn = matrix[0].length - 1;

        while ((startRow <= endRow) && (startColumn <= endColumn)) {
            //// print Top Boundary
            //// --- In case of Top boundarty start row is fixed but columns are varry
            for (int j = startColumn; j <= endColumn; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            //// print Right Boundary
            //// --- In case of right boundary end column is fixed, but rows are varry
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endColumn] + " ");
            }

            //// print Bottom Boundary
            //// ---- In case of bottoms boundary end row is fixed, but columns are varry
            //// from end to start
            for (int j = endColumn - 1; j >= startColumn; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            //// print left boundary
            //// ---- In case of left boundary, start columns is fixed but rows are varry
            //// from bottom to top
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startColumn == endColumn) {
                    break;
                }
                System.out.print(matrix[i][startColumn] + " ");
            }
            startRow++;
            endRow--;
            startColumn++;
            endColumn--;
        }
    }

    public static boolean search(int matrix[][], int key) {
        int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        int n = matrix.length, m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
                ;

                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }
                ;
                if (matrix[i][j] == key) {
                    System.out.println("Found at: " + "( " + i + "," + j + " )");
                }

            }
        }
        System.out.println("Largest: " + largest + " " + "Smallest: " + smallest);
        // System.out.println("Not Found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        // int n = matrix.length, m = matrix[0].length;
        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < n; i++) { //// this is for rows
        // for (int j = 0; j < m; j++) { //// this is for columns
        // matrix[i][j] = sc.nextInt();
        // }
        // }

        // for (int i = 0; i < n; i++) { //// this is for rows
        // for (int j = 0; j < m; j++) { //// this is for columns
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }

        // int key = 77;
        // search(matrix, key);

        int sMatrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        // printSpiral(sMatrix);

        int diagoanalMatrix[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };
        // diagonalSum(sMatrix);

        int sortedMatrixArr[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        int key = 33;

        searchingInSortedMatrixArray(sortedMatrixArr, key);
    }
}
