package Conversions;

import java.util.Scanner;

public class OctToDec_28 {
    public static void main(String[] args) {
        System.out.println("Enter Octal Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dec = 0;
        int count = 0;
        while (n > 0) {
            int r = n % 10;
            dec = dec + r * pow(8, count);
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
