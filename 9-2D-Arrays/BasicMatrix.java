public class BasicMatrix {
    public static void printSpiralMatrix(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            //// Top startRow Fixed
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            //// Right endCol fixed
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            //// Bottom endRow fixed
            for (int j = endCol - 1; j >= startCol; j--) {
                System.out.print(matrix[endRow][j] + " ");
            }

            //// Right startCol fixed
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    public static void diagonalSum(int matrix[][]) {
        int sum = 0;
        int n = matrix.length;
        //// using brute force
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // if (i == j) {
        // sum += matrix[i][j];
        // } else if (((i + j) == (n - 1)) && (i != j)) {
        // sum += matrix[i][j];
        // }
        // }
        // }

        //// using more optimized
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];

            int j = n - 1 - i;

            if (i != j) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum: " + sum);
    }

    ///// Searching in Sorted Array
    public static boolean searchInSortedArray(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && row >= 0) {
            int cellValue = matrix[row][col];
            if (cellValue == key) {
                System.out.println("FOund at (" + row + "," + col + ")");
                return true;
            } else if (key < cellValue) {
                col--;
            } else {
                row++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        // printSpiralMatrix(matrix);
        // diagonalSum(matrix);

        int sortedMatrixArr[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        int key = 33;
        searchInSortedArray(sortedMatrixArr, key);
    }
}