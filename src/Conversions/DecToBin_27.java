package Conversions;

import java.util.Scanner;

public class DecToBin_27 {
    public static void main(String[] args) {
        System.out.println("Enter Decimal Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String bin = "";
        while (n > 0) {
            int r = n % 2;
            bin = r + bin;
            n = n / 2;
        }
        System.out.println("Binary Equivalent = " + bin);
        sc.close();
    }
}
