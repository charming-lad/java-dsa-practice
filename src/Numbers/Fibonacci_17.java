import java.util.*;

public class Fibonacci_17 {
    static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int m = sc.nextInt();
        int f = fib(m);
        System.out.println("Fibonacci Number for " + m + " is " + f);
        sc.close();
    }
}
