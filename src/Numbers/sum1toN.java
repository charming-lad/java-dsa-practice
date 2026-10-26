public class sum1toN {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("sum is");
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        sc.close();
    }
}
