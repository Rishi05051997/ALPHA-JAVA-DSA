public class Questions {
    public static int getKeyCounter(int matrix[][], int key) {
        int counter = 0;
        ///// using brute force
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    counter++;
                }
            }
        }
        System.out.println("Counter: " + counter);
        return counter;
    }

    public static int getSumOfSelectedRow(int matrix[][], int rowNum) {
        int sum = 0;
        for (int j = 0; j < matrix.length; j++) {
            sum += matrix[rowNum][j];
        }
        System.out.println("Sum: " + sum);
        return sum;
    }

    public static void transeposeArrFun(int matrix[][]) {
        int matrixRow = matrix.length;
        int matrixCol = matrix[0].length;

        int[][] transpose = new int[matrixCol][matrixRow];
        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixCol; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        printMatrix(transpose);
    }

    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ///// Print the number of 7's that rae in the 2d array
        int arr_1[][] = {
                { 4, 7, 8 },
                { 8, 8, 7 },
                { 8, 9, 2 }
        };

        int key = 8;
        // getKeyCounter(arr_1, key);

        int arr_2[][] = {
                { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 }
        };

        int rowNum = 1;
        // getSumOfSelectedRow(arr_2, rowNum);

        int transposeArr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        transeposeArrFun(transposeArr);
    }
}
