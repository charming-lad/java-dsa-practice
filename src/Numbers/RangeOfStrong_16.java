import java.util.Scanner;

public class RangeOfStrong_16{
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
        System.out.println("Enter starting Number");
        int start = sc.nextInt();
        System.out.println("Enter end Number");
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
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
