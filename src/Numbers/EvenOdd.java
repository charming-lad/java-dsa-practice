public class EvenOdd {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even Number");
        } else
            System.out.println("Odd Number");
        sc.close();
    }
}
