package com.gla.Strings.level3;
import java.util.*;
public class FrequencyASCII {static void freq(String str) {
    int[] f = new int[256];

    for (int i = 0; i < str.length(); i++) {
        f[str.charAt(i)]++;
    }

    for (int i = 0; i < 256; i++) {
        if (f[i] > 0) {
            System.out.println((char)i + " -> " + f[i]);
        }
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        freq(sc.nextLine());
    }
}
