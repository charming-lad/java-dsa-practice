package Conversions;

import java.util.Scanner;

public class BinToDec_26 {
    public static void main(String[] args) {
        System.out.println("Enter binary Number");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long dec = 0;
        int count = 0;
        while (n > 0) {
            long r = n % 10;
            dec = dec + r * pow(2, count);
            n = n / 10;
            count++;
        }
        System.out.println("Decimal Equivalent = " + dec);
        sc.close();
    }

    static int pow(int n, int p) {
        int pw = 1;
        while (p > 0) {
            pw = pw * n;
            p--;
        }
        return pw;
    }
}
