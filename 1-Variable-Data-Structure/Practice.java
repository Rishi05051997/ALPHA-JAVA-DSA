import java.util.Scanner;

public class Practice {
    public static void main(String [] args) {
        //// 1. Average of three numbers
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter three numbers");
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // int num3 = sc.nextInt();
        // float av = (float)((num1+num2+num3)/3);
        // System.out.println(av);

        //// 2. Taking Input Side Of Square & print area of square
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Side Of Square");
        // float side = sc.nextFloat();
        // float area = side * side;
        // System.out.println("The area of square "+side+" is "+area);

        //// Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill. (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost of pencil");
        float pencilCost = sc.nextFloat();
        System.out.println("Enter cost of pen");
        float penCost = sc.nextFloat();
        System.out.println("Enter cost of eraser");
        float eraserCost = sc.nextFloat();
        float totalCost = (pencilCost + penCost + eraserCost) + ((pencilCost + penCost + eraserCost)* 0.18f);
        System.out.println("The total cost with 18% GST tax is "+totalCost);
    }
}
