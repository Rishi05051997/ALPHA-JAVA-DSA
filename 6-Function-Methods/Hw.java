public class Hw {
    ///// Question 1 : Write a Java method to compute the average of three numbers..
    public static float average(int num1, int num2, int num3) {
        float avg = (num1 + num2 + num3) / 3;
        return avg;
    }

    //// Question 2 : Write a method named isEven that accepts an int argument. The
    //// method
    //// should return true if the argument is even, or false otherwise. Also write
    //// a program to test your
    //// method.

    public static boolean isEven(int n) {
        if (n > 0 && n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //// Question 3 : Write a Java program to check if a number is a palindrome in
    //// Java? ( 121 is a
    //// palindrome, 321 is not)
    //// A number is called a palindrome if the number is equal to the reverse of a
    //// number e.g., 121 is a
    //// palindrome because the reverse of 121 is 121 itself. On the other hand, 321
    //// is not a
    //// palindrome because the reverse of 321 is 123, which is not equal to 321.

    public static void isPalindrome(int n) {
        String reverse = "";
        String givenStr = Integer.toString(n);
        while (n > 0) {
            int last_digit = n % 10;
            reverse += last_digit;
            n = n / 10;
        }
        System.out.println(reverse);
        System.out.println(givenStr);
        if (reverse.equals(givenStr)) {
            System.out.println("Palindorme");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    //// Write a Java method to compute the sum of the digits in an integer.
    //// (Hint : Approach this question in the following way :
    //// a. Take a variable sum = 0
    //// b. Find the last digit of the number
    //// c. Add it to the sum
    //// d. Repeat a & b until the number becomes 0

    public static int sumOfEachDigitOfInt(int n) {
        int sum = 0;
        while (n > 0) {
            int last_digit = n % 10;
            sum += last_digit;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        // System.out.println(average(12, 45, 77));
        // System.out.println(isEven(3));
        // System.out.println(isEven(-3));
        // System.out.println(isEven(8));

        // isPalindrome(863);
        System.out.println(sumOfEachDigitOfInt(12345));
    }
}
