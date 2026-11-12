
import java.util.*;

public class GCD_20 {

    static int gcd(int m, int n) {

        if (m == 0)
            return n;

        if (n == 0)
            return m;

        if (m < n)
            return gcd(n, m);

        return gcd(n, m % n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int p = sc.nextInt();

        System.out.println("Enter second number");
        int q = sc.nextInt();

        int a = gcd(Math.abs(p), Math.abs(q));

        System.out.println(a);

        sc.close();
    }
}
