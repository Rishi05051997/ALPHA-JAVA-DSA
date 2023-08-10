public class Bit {
    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    };

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;

        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;

        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        //// Binary AND
        // System.out.println(5 & 6);
        // ///// Binary OR
        // System.out.println(5 | 6);
        // ///// Binary XOR
        // System.out.println(5 ^ 6);
        // //// Binary NOT or 1's complement
        // System.out.println(~5);
        // //// Binary Left Shift
        // System.out.println(5 << 2);
        // //// Binary Right Shift
        // System.out.println(6 >> 1);

        // oddOrEven(8);

        // System.out.println(getIthBit(10, 2));

        // System.out.println(setIthBit(10, 2));

        // System.out.println(clearIthBit(10, 1));

        System.out.println(updateIthBit(10, 2, 1));
    }
}
