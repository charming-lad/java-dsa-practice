import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int i;
        int n = sc.nextInt();
        if (n == 1)
            System.out.println("Prime number starts from 2");
        for (i = 2; i < n; i++) {
            if (n % i == 0)
                System.out.println("Not prime");
        }
        if (n == i)
            System.out.println("Prime");
        sc.close();
    }
}
