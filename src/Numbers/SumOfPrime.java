import java.util.*;

public class SumOfPrime {
    public static boolean isPrime(int num) {
        if (num == 1)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (isPrime(i))
                sum += i;
        }

        System.out.println("Sum of prime = " + sum);
        sc.close();
    }
}
