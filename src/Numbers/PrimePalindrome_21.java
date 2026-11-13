import java.util.Scanner;

public class PrimePalindrome_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int t = n;
        int rev = 0;
        int i;
        while (n != 0) {
            rev = (rev * 10) + (n % 10);
            n = n / 10;
        }
        if (rev == t) {
            for (i = 2; i < rev; i++) {
                if (rev % i == 0) {
                    System.out.println("Not a Prime Palindrome");
                    break;
                }
            }
            if (rev == i) {
                System.out.println("A Prime Palindrome");
            }
        } else
            System.out.println("Not a Prime Palindrome");
        sc.close();
    }
}
