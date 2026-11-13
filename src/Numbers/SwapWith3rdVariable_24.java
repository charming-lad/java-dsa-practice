import java.util.*;

public class SwapWith3rdVariable_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int i = sc.nextInt();
        System.out.println("Enter second number");
        int j = sc.nextInt();
        int k;
        k = i;
        i = j;
        j = k;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
