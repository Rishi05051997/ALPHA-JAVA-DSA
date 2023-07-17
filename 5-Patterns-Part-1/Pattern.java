public class Pattern {
    public static void main(String[] args) {
        ///// Print Star Pattern
        ///// Nested Loops
        //// 1. outer loop -->> no of lines
        //// 2. inner loop -->> no of times "*"
        //// 3. What to Print

        //// *
        //// **
        //// ***
        //// ****
        // for (int lines = 1; lines <= 4; lines++) {
        // for (int star = 1; star <= lines; star++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        ///// Print Inverted Star Pattern
        ///// ****
        ///// ***
        ///// **
        ///// *
        ///// 1. No Of lines = 4
        ///// 2. No of Stars = 4 - (no of line) + 1
        // int n = 4;
        // for (int line = 1; line <= n; line++) {
        // for (int star = 1; star <= (n - line + 1); star++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        ///// Print Half Pyramid Pattern
        ///// 1
        ///// 12
        ///// 123
        ///// 1234
        for (int line = 1; line <= 4; line++) {
            for (int num = 1; num <= line; num++) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}