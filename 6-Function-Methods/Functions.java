import java.util.Scanner;

public class Functions {
    /// Function Syntax
    // returnType name(){
    // body
    // return statement;
    // }
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;
    }

    //// Function With Parameters
    // returnType name(type param1, type param2){
    // //// body
    // return statement;
    // }

    //// Function to find sum of two numbers
    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void printName(String name) {
        System.out.println(name);
        return;
    }

    //// while function declearation we passed parameters or formal parameters to
    //// the function

    //// while function inovocation/calling we passed arguments or actual parameters
    //// to
    //// the function

    //// Java always calls by value
    //// call by value means what ever the parameters which are passing to the swap
    //// function while function defination that parameters value change does not
    //// affect outside scope of that function that is related to that function
    //// scope only if we print a & b inside the function then that values of a & b
    //// will get change and if we print the arguments which are passing to the swap
    //// function after function invocation then the values will remain same
    //// Function to swap two values of variables
    public static void swap(int a, int b) {
        //// Swapping
        int temp = a;
        a = b;
        b = temp;

        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
    };

    //// Function To Find Product of a & b
    public static int product(int a, int b) {
        return a * b;
    }

    //// Function to Find Factorial of number
    public static int fact(int num) {
        int fact = 1;
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
        } else {
            return 1;
        }
        return fact;
        // if (num <= 0) {
        // return 1;
        // }
        // return num * fact(num - 1);
    }

    //// Function to Find Binomial Coefficient
    //// Binomial Coefficient = (n!)/(r!)*(n-r)!
    public static float binCoeff(int n, int r) {
        int nFact = fact(n);
        int rFact = fact(r);
        int n_rFact = fact(n - r);
        float binCoeffient = (nFact) / ((rFact) * (n_rFact));
        return binCoeffient;
    }

    ///// Types Of Methods In case Of Java
    ///// User Defined Methods ( for Ex. fact() )
    ///// Inbuilt Methods ( For Ex. Math Object -->> pow(), sqrt(), max(), Scanner
    ///// class)

    ///// Function Overloading
    ///// Multiple functions with same name but different parameters
    ///// Function overlading is possible by two ways
    ///// 1. Function Name is same but we passed different no of parameters

    //// Function to calculate of sum of 2 numbers
    // public static int sum(int num1, int num2) {
    // return num1 + num2;
    // };

    //// Function to calculate of sum of 3 numbers
    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    //// Here function overloading happens as function overloading means function
    //// name is same but function parameters are different For Ex. on line no 101
    //// we
    //// passed 2 parameters to the sum function & on line no 106 we passed 3
    //// paramters to the sum function

    ///// 2. Function Name is Same but different Data types as parameters
    public static int sum(int num1, int num2) {
        return num1 + num2;
    };

    public static float sum(float a, float b) {
        return a + b;
    }

    //// For Ex. To Check if a number is Prime or not
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) { ///// completely dividing
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }

    //// For Ex. Print all Primes in a Range
    public static void printAllPrimes(int n) {
        if (n == 2) {
            System.out.println("2 is a Prime number");
        } else {
            for (int i = 2; i <= (n); i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    ///// For Ex. Convert From Binary to Decimal
    public static int binToDecimal(int binNum) {
        int pow = 0;
        int dec = 0;
        while (binNum > 0) {
            int last_digit = binNum % 10;
            dec = (dec + (last_digit * (int) Math.pow(2, pow)));
            binNum = binNum / 10;
            pow++;
        }
        return dec;
        //// what we are doing here
        //// For Ex. we have 1101
        //// first we are calculating last digit of given binary number
        //// we are calculating decimal number = decimal number + ( last digit *
        //// 2^(power))
        //// then we are removing last digit from binary number by binary number =
        //// binary
        //// number / 10;
        //// then we are increasing power for next iteration
        //// (0)10 -->> (0)2
        //// (1)10 -->> (01)2
        //// (2)10 -->> (10)2
        //// (3)10 -->> (11)2
        //// (4)10 -->> (100)2
        //// (5)10 -->> (101)2
        //// (6)10 -->> (110)2
        //// (7)10 -->> (111)2
        //// (8)10 -->> (1000)2
    }

    ///// For Ex. Convert From Decimal to Binary
    public static void decimalToBinary(int decNum) {
        int myNum = decNum;
        int binNum = 0;
        int pow = 0;
        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = (binNum + (rem * (int) Math.pow(10, pow)));
            pow++;
            decNum = decNum / 2;
        }
        System.out.println("Binary of " + myNum + " = " + binNum);
    }

    //// Scope In Java
    //// Block Scope
    //// {
    //// Block Of Code
    //// }
    public static void main(String[] args) {
        // printHelloWorld();// Function Invocation

        // printName("Hello World"); // While Function Invocation we passed arguments or
        // actual parameters to
        // the function
        // printName("Good Morning, Vrushabh");

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a, b); //// Arguments / Actual Parameters
        // System.out.println("Sum is : " + sum);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a num");
        // int a = sc.nextInt();
        // System.out.println("Enter b num");
        // int b = sc.nextInt();

        // int sum = sum(a, b);

        // System.out.println("The sum of " + a + " and " + b + " is " + sum);

        /// Call by Value in Java
        /// Java always calls by value
        /// Swap Variables
        // int a = 5;
        // int b = 10;
        // swap(a, b);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a num");
        // int a = sc.nextInt();
        // System.out.println("Enter b num");
        // int b = sc.nextInt();

        // int product = product(a, b);
        // System.out.println(a + " * " + b + " = " + product);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a num");
        // int a = sc.nextInt();
        // int fact = fact(a);

        // System.out.println("The factorial of " + a + " is " + fact);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter n");
        // int n = sc.nextInt();
        // System.out.println("Enter r");
        // int r = sc.nextInt();

        // float bCoff = binCoeff(n, r);

        // System.out.println("The Binomial coefficient: " + bCoff);

        // System.out.println(sum(5, 10));
        // System.out.println(sum(3, 4, 6));

        // System.out.println(sum(1, 2));
        // System.out.println(sum(2.77f, 6.77f));

        // System.out.println(isPrime(5));

        // printAllPrimes(100);

        // System.out.println(binToDecimal(1101));
        decimalToBinary(5);
    }
}
