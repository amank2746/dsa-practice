package com.code.math;

import java.util.Scanner;

public class CountDigit {

    public static int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            count = count + 1;
            n = n / 10;
        }
        return count;
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int N = sc.nextInt();

        int digit= countDigit(N);
        System.out.println("Number of digit " + digit);

    }

}
//tim ecomplexity = o(log10 n+1)
//space complexity = 0(1)