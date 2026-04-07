package com.gla.Strings.level2;
import java.util.*;
public class WordLength2D {static String[] split(String str) {
    return str.split(" ");
}

    static String[][] getData(String[] words) {
        String[][] res = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            res[i][0] = words[i];
            res[i][1] = String.valueOf(words[i].length());
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] data = getData(split(text));

        for (String[] row : data) {
            System.out.println(row[0] + " -> " + Integer.parseInt(row[1]));
        }
    }
}
