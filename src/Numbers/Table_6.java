import java.util.*;

public class Table_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for table presentation");
        int n = sc.nextInt();
        int result;
        for (int i = 1; i <= 10; i++) {
            result = n * i;
            System.out.println(n + "*" + i + "=" + result);
        }
        sc.close();
    }
}
