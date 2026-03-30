package com.gla.methods.level3;
import java.util.*;
public class FactorsAdvanced { public static int[] getFactors(int n) {
    int count = 0;

    for (int i = 1; i <= n; i++) {
        if (n % i == 0) count++;
    }

    int[] arr = new int[count];
    int j = 0;

    for (int i = 1; i <= n; i++) {
        if (n % i == 0) arr[j++] = i;
    }
    return arr;
}

    public static int greatestFactor(int[] arr) {
        return arr[arr.length - 1]; // last element is largest
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int x : arr) s += x;
        return s;
    }

    public static int product(int[] arr) {
        int p = 1;
        for (int x : arr) p *= x;
        return p;
    }

    public static double productOfCubes(int[] arr) {
        double p = 1;
        for (int x : arr) p *= Math.pow(x, 3);
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] f = getFactors(n);

        System.out.println(Arrays.toString(f));
        System.out.println("Greatest: " + greatestFactor(f));
        System.out.println("Sum: " + sum(f));
        System.out.println("Product: " + product(f));
        System.out.println("Product of Cubes: " + productOfCubes(f));
    }
}
