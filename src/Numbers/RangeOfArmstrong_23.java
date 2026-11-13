import java.util.*;

public class RangeOfArmstrong_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int start = sc.nextInt();
        System.out.println("Enter the second number");
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            boolean r = isArmstrong(i);
            if (r) {
                System.out.println(i + " is Armstrong");
            }
        }
        sc.close();
    }

    static int countDigit(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    static int pow(int n, int p) {
        int pw = 1;
        while (p > 0) {
            pw = pw * n;
            p--;
        }
        return pw;
    }

    static boolean isArmstrong(int x) {
        int nd = countDigit(x);
        int t = x;
        int sum = 0;
        while (t > 0) {
            int r = t % 10;
            sum = sum + pow(r, nd);
            t = t / 10;
        }
        if (sum == x) {
            return true;
        } else
            return false;
    }
}
