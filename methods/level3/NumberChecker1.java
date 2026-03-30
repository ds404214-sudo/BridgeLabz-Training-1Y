package com.gla.methods.level3;
import java.util.*;
public class NumberChecker1 {public static int countDigits(int n) {
    return String.valueOf(n).length();
}

    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] digits = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    public static boolean isDuck(int[] digits) {
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrong(int n, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == n;
    }

    public static int[] largestTwo(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > max1) {
                max2 = max1;
                max1 = d;
            } else if (d > max2 && d != max1) {
                max2 = d;
            }
        }
        return new int[]{max1, max2};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] digits = getDigits(n);

        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Duck: " + isDuck(digits));
        System.out.println("Armstrong: " + isArmstrong(n, digits));

        int[] res = largestTwo(digits);
        System.out.println("Largest: " + res[0] + ", Second Largest: " + res[1]);
    }

}
