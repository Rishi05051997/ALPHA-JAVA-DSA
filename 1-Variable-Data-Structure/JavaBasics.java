import java.math.BigInteger;
import java.util.Scanner;

public class JavaBasics {

  public static void main(String[] args) {
    // Lecture 1
    // System.out.print("Hello world\n");
    // System.out.println("Hello world");
    // System.out.println("Hello world");
    // for (int i = 0; i < args.length; i++) {
    // System.out.println(args[i]);
    // }

    // Lecture 2
    // System.out.println("*****");
    // System.out.println("***");
    // System.out.println("**");
    // System.out.println("*");

    // Lecture 3 (Variables In Java)
    // int a = 10;
    // int b = 5;
    // int c = 2 * (a + b);
    // String name = "Vrushabh Dhatrak";
    // System.out.println(c);
    // System.out.println(name);

    // a = 50;
    // System.out.println(a);

    //// Lecture 4 (Data Types In Java)
    //// Primitive
    //// byte, short, char, boolean, int, long, float, double
    //// Non Primitive
    //// String, Array, Class, Object, Interface
    // byte b = 8;
    // System.out.println(b);
    // char ch = 'a';
    // System.out.println(ch);
    // boolean isValid = false;
    // System.out.println(isValid);
    // float price = 10.5f;
    // System.out.println(price);
    // int number = 25;
    // System.out.println(number);
    //// long -->> If we want to store big integer value
    // long amt = 300000000;
    //// double -->> If we want to store big float value
    // double r = 2.129393939;
    // short n = 240;
    //// ******************
    //// byte = 1byte
    //// 1 byte = 8 bits
    //// 1 short = 2 bytes
    //// 1 char = 2 bytes
    //// 1 boolean = 1 byte
    //// 1 int = 4 bytes
    //// 1 long = 8 bytes
    //// 1 float = 4 bytes
    //// 1 double = 8 bytes
    //// *****************

    // Lecture 7 (Sum of a & b)
    // code to calculate sum
    // int a = 10;
    // int b = 5;

    // int sum = a + b;
    // System.out.println(sum);

    // Lecture 8 ( Comments In Java )
    // Hi there!

    /*
     * Hi there!
     */

    // Lecture 9 ( Input in Java )
    // next -->> String (it will store string only upto first space)
    // nextLine -->> String (it will store whole entered string)
    // nextInt
    // nextByte
    // nextFloat
    // nextDouble
    // nextBoolean
    // nextShort
    // nextLong
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a num");
    // int num = sc.nextInt();
    // System.out.println(num);

    // System.out.println("Enter your Name"); // for ex. Vrushabh Dhatrak
    // String name = sc.next();
    // System.out.println(name); // Vrushabh
    // String fullName = sc.nextLine();
    // System.out.println(fullName); // Vrushabh Dhatrak

    // System.out.println("Enter a number");
    // int num = sc.nextInt();
    // System.out.println(num);

    // System.out.println("Enter a price");
    // float price = sc.nextFloat();
    // System.out.println(price);

    // System.out.println("Are you single ?");
    // boolean isSingle = sc.nextBoolean();
    // System.out.println(isSingle);

    // Lecture 10 ( Take a & b as Input & print their Sum )
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a number 1");
    // int num1 = sc.nextInt();
    // System.out.println("Enter a number 2");
    // int num2 = sc.nextInt();
    // int sum = num1 + num2;
    // System.out.println(num1+"+"+num2+"="+sum);

    // Lecture 10 ( Take a & b as Input & print their product )
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter number 1");
    // int num1 = sc.nextInt();
    // System.out.println("Enter number 2");
    // int num2 = sc.nextInt();
    // int product = num1 * num2;
    // System.out.println(num1+"*"+num2+"="+product);

    // Lecture 10 ( Take radius of circle as Input & print their area )
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter radius of circle");
    // float radius = sc.nextFloat();
    // float area = 3.14f * radius * radius; // a = (pie) * r^2
    // System.out.println("Area of Circle having radius "+radius+" is "+area);

    //// Lecture 10 ( Type Conversion In Java )
    //// Conversion happens when:
    //// a. type compatible
    //// b. destination type > source type

    //// byte -> short -> int -> float -> long -> double
    // int a = 25;
    // long b = a; // this will work becoz long (8 bytes) > int (4 bytes) // it is
    //// also called "Widening conversion" or "Implicit Conversion"

    // For Ex.
    // Scanner sc = new Scanner(System.in);
    // float num = sc.nextInt(); // as float > int (destination > source)

    // "Narrowing conversion" or "Explicit conversion"
    // Scanner sc = new Scanner(System.in);
    // int num = (int) sc.nextFloat(); // here did type casting
    // long a = 25;
    // int b = a; // this will not work as we need to do here type casting
    // int b = (int)a; // it is also called norrowing conversion or explicit
    // conversion
    // System.out.println(b);

    // char ch = 'a';
    // int num = (int) ch;
    // System.out.println(num);

    //// Lecture 11 ( Type Promotion In Expressions )
    //// 1. Java automatically promotes each byte, short, or char operand to int
    //// when evaluating an expression
    //// for Ex.
    // char a = 'a'; // 97
    // short b = 50; // 50
    // int sum = a + b; // in case of byte, shor, char promoted automatically to int
    // System.out.println(sum); // 97 + 50 = 147
    //// For Ex.
    // char a = 'a';
    // char b = 'b';
    // System.out.println((int)(b)); // 97
    // System.out.println((int)(a)); // 98
    // System.out.println(((int)b)-((int)a)); // 98 - 97 = 1

    //// 2. If one operand is long, float or double the whole expression is promoted
    //// to double
    //// For Ex.
    // float f = 45.67f;
    // double d = 55.78;
    // long l = 89000000;

    // double sum = l + d + f;
    // System.out.println(sum);

    //// For Ex.
    // byte b = 5;
    // byte a = (byte)(b * 2);
    // System.out.println(a);
  }
}
