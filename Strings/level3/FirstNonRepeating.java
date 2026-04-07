package com.gla.Strings.level3;
import java.util.*;
public class FirstNonRepeating { static char findChar(String str) {
    int[] freq = new int[256];

    for (int i = 0; i < str.length(); i++) {
        freq[str.charAt(i)]++;
    }

    for (int i = 0; i < str.length(); i++) {
        if (freq[str.charAt(i)] == 1) {
            return str.charAt(i);
        }
    }
    return '#';
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(findChar(str));
    }
}
