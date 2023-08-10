public class Practice {
    public static void oddOrEven(int n) {
        int bitMask = 1;

        if ((n & bitMask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;

        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    };

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearithBit(int n, int i) {
        int bitMask = ~(1 << i);

        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        // return clearithBit(n, i);
        // } else {
        // return setIthBit(n, i);
        // }

        n = clearithBit(n, i);
        int bitMask = newBit << i;

        return n | bitMask;
    }

    public static void main(String[] args) {
        // oddOrEven(7);
        // oddOrEven(8);
        // oddOrEven(12);
        // oddOrEven(9);

        // System.out.println(getIthBit(10, 2));
        // System.out.println(getIthBit(10, 3));

        // System.out.println(setIthBit(10, 2));

        // System.out.println(clearithBit(10, 1));

        System.out.println(updateIthBit(10, 2, 1));
    }
}
