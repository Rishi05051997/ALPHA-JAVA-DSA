public class Practice {
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'N')
                y++;
            else if (dir == 'S')
                y--;
            else if (dir == 'E')
                x++;
            else
                x--;
        }
        int X2 = (x * x);
        int Y2 = (y * y);

        return (float) Math.sqrt(X2 + Y2);
    }

    public static String substring(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static String getLargestString(String strArr[]) {
        String largest = strArr[0];

        for (int i = 0; i < strArr.length; i++) {
            if (largest.compareTo(strArr[i]) < 0) {
                largest = strArr[i];
            }
        }

        return largest;
    }

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        //// For making first letter of given string to capital one
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                ///// now we are adding empty space to sb
                sb.append(str.charAt(i));
                i++;
                //// once i is incremented then new string is starting now we are making first
                //// char to uppercase
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                //// now we are adding rest of the thing into sb as it is
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String strCompression(String str) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            Integer counter = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                counter++;
                i++;
            }

            sb.append(str.charAt(i));

            if (counter > 1) {
                sb.append(counter.toString());
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // System.out.println(isPalindrome("vrushabh"));
        String path = "WNEENESENNN";
        // System.out.println(getShortestPath(path));

        // String str = "Hello World";
        // System.out.println(substring(str, 0, 5));
        // str.substring(0, 5);

        // String fruits[] = { "apple", "mango", "banana" };
        // System.out.println(getLargestString(fruits));

        // StringBuilder sb = new StringBuilder("");

        // for (char ch = 'a'; ch <= 'z'; ch++) {
        // sb.append(ch);
        // }

        // System.out.println(sb);

        // String sen = "hi, i am vrushabh";
        // System.out.println(toUpperCase(sen));

        String comp = "aaabbccccdddddd";
        System.out.println(strCompression(comp));
    }
}
