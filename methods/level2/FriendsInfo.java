package com.gla.methods.level2;
import java.util.*;
public class FriendsInfo {public static int findYoungestIndex(int[] ages) {
    int minIndex = 0;

    for (int i = 1; i < ages.length; i++) {
        if (ages[i] < ages[minIndex]) {
            minIndex = i;
        }
    }
    return minIndex;
}

    public static int findTallestIndex(int[] heights) {
        int maxIndex = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Input ages
        System.out.println("Enter ages:");
        for (int i = 0; i < 3; i++) {
            System.out.print(names[i] + ": ");
            ages[i] = sc.nextInt();
        }

        // Input heights
        System.out.println("Enter heights:");
        for (int i = 0; i < 3; i++) {
            System.out.print(names[i] + ": ");
            heights[i] = sc.nextInt();
        }

        int youngestIndex = findYoungestIndex(ages);
        int tallestIndex = findTallestIndex(heights);

        System.out.println("Youngest Friend: " + names[youngestIndex] +
                " (Age: " + ages[youngestIndex] + ")");

        System.out.println("Tallest Friend: " + names[tallestIndex] +
                " (Height: " + heights[tallestIndex] + ")");
    }
}
