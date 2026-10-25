/**
 * print1toN
 */
public class print1toN {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println("Printed numbers are");

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}