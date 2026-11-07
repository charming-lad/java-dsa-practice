import java.util.Scanner;

public class RangeOfStrong {
    static int fact(int n) {
        int fact = 1;
        while (n > 0) {
            fact = fact * n;
            n--;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int num = i;
            int t = num;
            int sum = 0;
            while (num != 0) {
                int rev = num % 10;
                sum = sum + fact(rev);
                num = num / 10;
            }
            if (sum == t) {
                System.out.println(t + " Number is Strong");
            }
        }
        sc.close();
    }
}
