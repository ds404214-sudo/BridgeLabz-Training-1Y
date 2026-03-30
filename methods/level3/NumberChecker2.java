package com.gla.methods.level3;
import java.util.*;
public class NumberChecker2 { public static int[] getDigits(int n) {
    String s = String.valueOf(n);
    int[] arr = new int[s.length()];

    for (int i = 0; i < s.length(); i++) {
        arr[i] = s.charAt(i) - '0';
    }
    return arr;
}

    public static int sum(int[] arr) {
        int s = 0;
        for (int x : arr) s += x;
        return s;
    }

    public static double sumSquares(int[] arr) {
        double s = 0;
        for (int x : arr) s += Math.pow(x, 2);
        return s;
    }

    public static boolean isHarshad(int n, int[] digits) {
        return n % sum(digits) == 0;
    }

    public static int[][] frequency(int[] digits) {
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
        }

        for (int d : digits) {
            freq[d][1]++;
        }

        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] digits = getDigits(n);

        System.out.println("Sum: " + sum(digits));
        System.out.println("Sum of Squares: " + sumSquares(digits));
        System.out.println("Harshad: " + isHarshad(n, digits));

        int[][] freq = frequency(digits);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0)
                System.out.println(i + " -> " + freq[i][1]);
        }
    }
}
