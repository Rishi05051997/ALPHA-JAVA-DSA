import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        //// Lecture - 1 ( Condtionals Statements )
        //// if,else
        //// else if
        //// ternary operator
        //// switch

        //// if,else statements
        //// if(condition){
        ////     // your code
        //// }else {

        //// }

        //// For Ex.
        //// () == Paranthesis
        //// {} == curly braces
        // int age = 25;
        // if(age >= 18){
        //     System.out.println("Hurray!, You can avail Driving license, Voter Id :)");
        // }
        // if(age > 13 && age < 18){
        //     System.out.println("Teeneger");
        // }
        // else {
        //     System.out.println("Sorry! you are not eligible :(");
        // }

        //// Question Print the largest of 2 numbers
        // int A = 1;
        // int B = 3;

        // if(A>B){
        //     System.out.println(A);
        // }else {
        //     System.out.println(B);
        // }

        //// Question Print If a number is "odd" or "even"
        // int number = 1;
        // if(number%2==0){
        //     System.out.println("Even");
        // }else {
        //     System.out.println("Odd");
        // }

        //// else if statements
        //// if(condtion1){

        //// }else if(condtion2){

        //// }else {

        //// }
        
        //// For ex.
        // int age = 26;
        // if(age >= 18){
        //     System.out.println("Adult");
        // }else if(age >= 13 && age < 18){
        //     System.out.println("Teeneger");
        // }else {
        //     System.out.println("Not Adult");
        // }

        //// Question - Income Tax Calculator
        //// income < 5L
        //// 0% tax
        //// income between 5 - 10L
        //// 20% tax
        //// income > 10L
        //// 30% tax

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Please Enter your income");
        // int income = sc.nextInt();
        // float tax = 0;

        // if(income < 500000){
        //     tax = 0;
        // }else if(income > 500000 && income < 1000000){
        //     tax = (float)(income * 0.2f);
        // }else {
        //     tax = (float)(income * 0.3f);
        // }

        // System.out.println("Your tax is "+tax);
        
        //// Question - Print the largest of 3
        // int A = 100;
        // int B = 30;
        // int C = 600;

        // if(A >= B && A >= C){
        //     System.out.println("A");
        // }else if(B >= C){
        //     System.out.println("B");
        // }else {
        //     System.out.println("C");
        // }

        //// Ternary Operator
        //// variable = condition ? statement1 : statement2
        //// For Ex.
        // boolean larger = (5<3) ? true : false;
        // System.out.println(larger);
        
        // String isOddEven = ((5%2)==0) ? "Even" :"Odd";
        // System.out.println(isOddEven);

        //// Question - Check if a student will pass or fail
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your marks");
        // int marks = sc.nextInt();

        // String reportCard = (marks >= 33) ? "Pass" : "Fail";

        // System.out.println(reportCard);

        //// Switch Statements
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your a button between 1-3");
        // int button = sc.nextInt();
        // switch (button) {
        //     case 1:
        //         System.out.println("Samosa");
        //         break;
        //     case 2:
        //         System.out.println("Burger");
        //         break;
        //     case 3:
        //         System.out.println("Mango Shake");
        //     default:
        //         System.out.println("Invalid Input");
        //         break;
        // }

        //// Question - Calculator
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();
        System.out.println("Enter operation");
        String ch = sc.next();
        switch (ch) {
            case "a":
                System.out.println(num1+num2);
                break;
            case "s":
                System.out.println(num1-num2);
                break;
            case "m":
                System.out.println(num1*num2);
                break;
            case "d":
                System.out.println(num1/num2);
            default:
                System.out.println("inValid Operation Input");
                break;
        }













        
    }
}
