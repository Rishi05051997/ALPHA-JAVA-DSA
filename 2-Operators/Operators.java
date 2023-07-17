public class Operators {
    public static void main(String[] args) {
        //// Lecture 3 (Arithmetic Operators ( Binary/Unary ) In Java)
        //// Binary (+,-,*,/,%) ( 2 Operands )

        // int a = 10;
        // int b = 5;
        // int sum = a + b;
        // int sub = a - b;
        // int mul = a * b;
        // int div = a / b;
        // int remainder = a % b;
        // System.out.println(sum);
        // System.out.println(sub);
        // System.out.println(mul);
        // System.out.println(div);
        // System.out.println(remainder);

        //// Unary (++,--) ( 1 Operands )
        // int a = 5;
        // a++; // a = a + 1;
        // System.out.println(a);
        // a--; // a = a - 1;
        // System.out.println(a);
        //// Increment
        //// a. Pre Increment (++a) -->> First Increment & then used
        //// b. Post Increment (a++) -->> First used & then Increment

        //// a. Pre Increment (++a) -->> First Increment & then used
        //// For Ex.
        // int a = 10;
        // int b = ++a;
        // System.out.println(a); // due to ++a it will increase value of a to 11
        // System.out.println(b); // 11

        //// b. Post Increment (a++) -->> First used & then Increment
        // int c = 20;
        // int d = c++;
        // System.out.println(c); // Here the value of c will increme c = 21;
        // System.out.println(d); // 20

        //// Decrement
        //// a. Pre Decrement (--a) -->> First Decrement & then used
        //// a. Post Decrement (a--) -->> Fist used & then decrement

        //// For Ex.
        //// Pre Decrement
        // int e = 20;
        // int f = --e;
        // System.out.println(e); // 19
        // System.out.println(f); // 19

        //// Post Decrement
        // int g = 30;
        // int h = g--;
        // System.out.println(g); // 29
        // System.out.println(h); // 30

        //// Lecture 4 ( Relational Operators In Java )
        //// "==", "!=", ">", ">=", "<", "<="
        // int a = 10;
        // int b = 5;
        //// a == b it will return false
        //// a != b it will return true
        //// a > b it will return true
        //// a >= b it will return true
        //// a < b it will return false
        //// a <= b it will return false
        // System.out.println("a == b"+" = "+(a == b));
        // System.out.println("a != b"+" = "+(a != b));
        // System.out.println("a > b"+" = "+(a > b));
        // System.out.println("a >= b"+" = "+(a >= b));
        // System.out.println("a < b"+" = "+(a < b));
        // System.out.println("a <= b"+" = "+(a <= b));

        //// Lecture 5 ( Logical Operators In Java )
        //// && ( Logical AND ) ===>> If Both Statements True then only True
        //// || ( Logical OR ) ===>> If any of of the statement is True then only True
        //// ! ( Logical NOT ) ===>> True will become False & False will become True

        // System.out.println( ( 3 > 2 ) && ( 5 > 0 ) ); ///// true
        // System.out.println( (3 > 2) || (1 < 2)); //// true
        // System.out.println( !(3>2) ); //// !true = false

        //// Lecture 5 ( Assignment Operators In Java )
        //// "=", "+=", "-=", "*=", "/=", "%="
        // int A = 10;
        // int B = 5;
        // A = B;
        // System.out.println(A); // 5
        // System.out.println(B); // 5
        // A += B; //// A = A + B;
        // System.out.println(A); // 15
        // System.out.println(B); // 5
        // A -= B; //// A = A - B;
        // System.out.println(A); // 5
        // System.out.println(B); // 5
        // A *= B; //// A = A * B;
        // System.out.println(A); // 50
        // System.out.println(B); // 5
        // A /= B; //// A = A / B;
        // System.out.println(A); // 2
        // System.out.println(B); // 5
        // A %= B; //// A = A % B;
        // System.out.println(A); // 0
        // System.out.println(B); // 5

    }
}
