import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        //// Loops In Java
        //// for repaeating any kind of work for definite period of time then we used
        //// loops
        //// Types Of Loops
        //// 1. while loop
        //// 2. for loop
        //// 3. do while loop

        //// 1. while loop
        // while(condition){
        // // do something
        // }

        // int counter = 1;
        // while (counter <= 5) {
        // System.out.println("Hello World!");
        // counter++;
        // }

        ///// For Ex. Print Number from 1 to 10
        // int counter = 1;
        // while (counter <= 10) {
        // System.out.println(counter);
        // counter++;
        // }

        ///// For ex. Print Number from 1 to n
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int n = sc.nextInt();
        // int counter = 1;
        // while (counter <= n) {
        // System.out.print(counter + " ");
        // counter++;
        // }
        // System.out.println();

        ///// For Ex. Print Sum Of First "n" Natural numbers
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int sum = 0;
        // int n = sc.nextInt();
        // int i = 1;
        // while (i <= n) {
        // sum += i;
        // i++;
        // }
        // System.out.println("The sum of first " + n + " natural numbers are " + sum);

        ///// 2. For Loop
        ///// for(initilization; condition; updation){
        ///// //// do something
        ///// }

        // for (int i = 1; i <= 10; i++) {
        // System.out.print(i + " ");
        // }

        //// For Ex Print
        //// * * * * --->> Line 1
        //// * * * * --->> Line 2
        //// * * * * --->> Line 3
        //// * * * * --->> Line 4

        // for (int line = 1; line <= 4; line++) {
        // System.out.println("*****");
        // }

        // int line = 1;
        // while (line <= 4) {
        // System.out.println("****");
        // line++;
        // }

        ///// For Ex. Print "Reverse" of a number
        ///// For ex. 10899 -->> 99801

        // int number = 987654, reverse = 0;
        // while (number != 0) {
        // int lastDigit = number % 10;
        // reverse = reverse * 10 + lastDigit;
        // number = number / 10;
        // }
        // System.out.println("The reverse of the given number is: " + reverse);

        ///// 3. do-while loop
        //// do{
        //// //// do something
        //// }while(condition);

        // int counter = 1;
        // do {
        // System.out.println("Hello World");
        // counter++;
        // } while (counter <= 5);

        ///// Break Statement -->> to exit the loop
        // for (int i = 1; i <= 5; i++) {
        // if (i == 3) {
        // break;
        // }
        // System.out.println(i);
        // }
        // System.out.println("I am out of the loop");

        ///// For Ex. Keep entering numbers till user enters a multiple of 10
        // Scanner sc = new Scanner(System.in);

        // do {
        // System.out.println("Enter a number");
        // int enteredNum = sc.nextInt();
        // System.out.println(enteredNum);
        // if (enteredNum % 10 == 0) {
        // break;
        // }
        // } while (true);

        ///// Continue Statement -->> To Skip an iteration
        // for (int i = 1; i <= 5; i++) {
        // if (i == 3) {
        // continue;
        // }
        // System.out.println(i);
        // }

        //// For Ex. Display all numbers entered by user except multiple of 10
        // Scanner sc = new Scanner(System.in);
        // do {
        // System.out.println("Enter number:");
        // int n = sc.nextInt();
        // if (n % 10 == 0) {
        // continue;
        // }
        // System.out.println("number was " + n);
        // } while (true);

        ///// For Ex. Check if a number is prime or not
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // if (n == 2) {
        // System.out.println("Prime");
        // } else {
        // boolean isPrime = true;
        // for (int i = 2; i <= Math.sqrt(n); i++) {
        // if (n % i == 0) {
        // isPrime = false;
        // }
        // }

        // if (isPrime) {
        // System.out.println("Prime");
        // } else {
        // System.out.println("Not Prime");
        // }
        // }

    }
}
