import java.util.*;

public class RangeOfFibonacci_18 {
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return (n - 1) + (n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting range number");
        int start = sc.nextInt();
        System.out.println("Enter ending range number");
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            int f = fib(i);
            System.out.println(f);
        }
        sc.close();
    }
}