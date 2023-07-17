import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }
}
