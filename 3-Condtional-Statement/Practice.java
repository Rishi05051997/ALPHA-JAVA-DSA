import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        //// Question 1 : Write a Java program to get a number from the user and print
        //// whether it is positive or negative.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Please enter a number");
        // int num = sc.nextInt();
        // if(num > 0){
        // System.out.println("Entered number "+num+" is positive");
        // }else {
        // System.out.println("Entered number "+num+" is positive");
        // }

        //// Question 2 : Finish the following code so that it prints You have a fever
        //// if your temperature is above 100 and otherwise prints You don't have a
        //// fever
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Please enter a temparature");
        // float temp = sc.nextFloat();
        // if(temp > 100){
        // System.out.println("You have a fever");
        // }else {
        // System.out.println("You don't have a fever");
        // }

        //// Question 3 : Write a Java program to input week number(1-7) and print day
        //// of week name using switch case.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Please enter a week number");
        // int weekNum = sc.nextInt();
        // switch (weekNum) {
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // break;
        // case 7:
        // System.out.println("Sunday");
        // break;
        // default:
        // System.out.println("Invalid Input");
        // break;
        // }

        //// Question 5 : Write a Java program that takes a year from the user and print
        //// whether that year is a leap year or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the year: ");
        int year = sc.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));
        if (x && (y || z)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
