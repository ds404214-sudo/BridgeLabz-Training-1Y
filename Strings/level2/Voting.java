package com.gla.Strings.level2;
import java.util.*;
public class Voting {static int[] getAges(int n) {
    Random r = new Random();
    int[] ages = new int[n];
    for (int i = 0; i < n; i++) {
        ages[i] = 10 + r.nextInt(90);
    }
    return ages;
}

    public static void main(String[] args) {
        int[] ages = getAges(10);

        for (int age : ages) {
            boolean canVote = age >= 18;
            System.out.println(age + " -> " + canVote);
        }

    }
