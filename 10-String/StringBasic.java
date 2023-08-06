import java.util.Scanner;

public class StringBasic {
    public static void printAllLettersInString(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                //// not a palindrome
                return false;
            }
        }
        ;

        return true;
    }

    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            //// North
            if (direction == 'N') {
                y++;
            }
            //// South
            else if (direction == 'S') {
                y--;
            }
            //// East
            else if (direction == 'E') {
                x++;
            }
            //// West
            else if (direction == 'W') {
                x--;
            }
        }
        int x2_x1_square = (x * x);
        int y2_y1_square = (y * y);
        float displacement = (float) Math.sqrt(x2_x1_square + y2_y1_square);
        return displacement;
    }

    public static String getSubString(String str, int si, int ei) {
        String subStr = "";
        for (int i = si; i < ei; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }

    public static String getLargestString(String fruits[]) {
        String largest = fruits[0];

        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }

        return largest;
    }

    public static String getEachCharToUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        ///// this is for making first letter to upper case
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                /// below one for empty space
                sb.append(str.charAt(i));
                i++;
                /// below one for making first letter after empty space to be capital
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                //// below one for making rest of the part without empty string as it is
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }

    public static String strCompression(String str) {
        String newStr = "";
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            Integer counter = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                counter++;
                i++;
            }
            sb.append(str.charAt(i));
            // newStr += str.charAt(i);
            if (counter > 1) {
                sb.append(counter.toString());
                // newStr += counter.toString();
            }
        }

        // return newStr;
        return sb.toString();
    }

    public static void main(String[] args) {
        // char arr[] = { 'a', 'b', 'c', 'd' };
        // String str = "abcd";
        // String str2 = new String("xyz");

        //// Strings are IMMUTABLE

        // Scanner sc = new Scanner(System.in);

        // System.out.println("String entered:" + sc.nextLine());

        //// length() -->> will return length of given string
        // String fullName = "";
        // System.out.println(fullName.length());

        //// concatination() --->> to join two or more strings
        // String firstName = "Vrushabh";
        // String lastName = "Dhatrak";

        // fullName = firstName + " " + lastName;

        // System.out.println(fullName);

        // char charr = firstName.charAt(0);

        // System.out.println(charr);

        // printAllLettersInString(fullName);

        // System.out.println(isPalindrome("noon"));

        // String path = "WNEENESENNN";
        // System.out.println(getShortestPath(path));

        ///// String Compare Function
        // String s1 = "Tony";
        // String s2 = "Tony";
        // String s3 = new String("Tony");

        // if (s1 == s2) {
        // System.out.println("String are equal");
        // } else {
        // System.out.println("Not equal");
        // }

        // if (s1 == s3) {
        // System.out.println("String are equal");
        // } else {
        // System.out.println("Not equal");
        // }

        // if (s1.equals(s3)) {
        // System.out.println("Equal");
        // } else {
        // System.out.println("Not Equal");
        // }

        ///// String Substring function
        String str = "Hello World";
        // System.out.println(str.substring(0, 5));
        // System.out.println(getSubString(str, 0, 4));

        // String fruits[] = { "apple", "mango", "banana" };
        // System.out.println(getLargestString(fruits));

        // StringBuilder sb = new StringBuilder("");
        // for (char ch = 'a'; ch <= 'z'; ch++) {
        // sb.append(ch);
        // }

        // System.out.println(sb);

        // String sentence = "hi, i am vrushabh";
        // System.out.println(getEachCharToUpperCase(sentence));

        String comp = "aaabbcccdd";
        System.out.println(strCompression(comp));

    }
}
