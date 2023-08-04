public class StaircaseSearch {
    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            int cellValue = matrix[row][col];
            if (cellValue == key) {
                System.out.println("Found at (" + row + "," + col + ")");
                return true;
            } else if (key < cellValue) {
                ///// moving left direction
                col--;
            } else {
                //// moving bottom direction
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int sortedMatrixArr[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        int key = 33;
        staircaseSearch(sortedMatrixArr, key);
    }
}
