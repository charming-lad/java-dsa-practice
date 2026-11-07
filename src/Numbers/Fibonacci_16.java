import java.util.*;

public class Fibonacci_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        while (n != 0) {
            int psum = 0;
            int sum = 1;
            for (int i = 1; i <= n; i++) {
                sum = sum + psum;
                psum = sum;
            }
            System.out.println("Value of " + n + " fibbonacci series is " + sum);
        }
        sc.close();
    }
}
