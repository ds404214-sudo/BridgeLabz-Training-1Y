package com.gla.methods.level3;
import java.util.*;
public class NumberChecker3 {public static int[] getDigits(int n) {
    String s = String.valueOf(n);
    int[] arr = new int[s.length()];

    for (int i = 0; i < s.length(); i++) {
        arr[i] = s.charAt(i) - '0';
    }
    return arr;
}

    public static int[] reverse(int[] arr) {
        int[] rev = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    public static boolean isEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean isPalindrome(int[] arr) {
        return isEqual(arr, reverse(arr));
    }

    public static boolean isDuck(int[] arr) {
        for (int x : arr) {
            if (x == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] digits = getDigits(n);

        System.out.println("Palindrome: " + isPalindrome(digits));
        System.out.println("Duck Number: " + isDuck(digits));
    }
}
