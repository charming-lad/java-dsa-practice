package Conversions;

import java.util.Scanner;

public class DecToOct_29 {
    public static void main(String[] args) {
        System.out.println("Enter Decimal Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String bin = "";
        while (n > 0) {
            int r = n % 8;
            bin = r + bin;
            n = n / 8;
        }
        System.out.println("Octal Equivalent = " + bin);
        sc.close();
    }
}
