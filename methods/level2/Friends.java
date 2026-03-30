package com.gla.methods.level2;
import java.util.*;
public class Friends { public static int findYoungest(int[] age) {
    return Math.min(age[0], Math.min(age[1], age[2]));
}

    public static int findTallest(int[] height) {
        return Math.max(height[0], Math.max(height[1], height[2]));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] age = new int[3];
        int[] height = new int[3];

        for (int i = 0; i < 3; i++) age[i] = sc.nextInt();
        for (int i = 0; i < 3; i++) height[i] = sc.nextInt();

        System.out.println("Youngest: " + findYoungest(age));
        System.out.println("Tallest: " + findTallest(height));
    }
}
