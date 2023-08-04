public class SpiralMatrix {

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

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        printSpiral(matrix);
    }
}
