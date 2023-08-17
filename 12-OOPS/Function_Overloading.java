public class Function_Overloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        int int_sum = c.sum(5, 10);

        float float_sum = c.sum(12.44f, 55.77f);

        System.out.println(int_sum);
        System.out.println(float_sum);

    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
