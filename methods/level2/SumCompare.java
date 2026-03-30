package com.gla.methods.level2;
import java.util.*;

public class SumCompare { public static int sumRecursive(int n) {
    if (n == 1) return 1;
    return n + sumRecursive(n - 1);
}

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int r1 = sumRecursive(n);
        int r2 = sumFormula(n);

        System.out.println("Recursive: " + r1);
        System.out.println("Formula: " + r2);

        if (r1 == r2)
            System.out.println("Both results are correct");
    }
}
