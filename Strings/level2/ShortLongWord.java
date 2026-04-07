package com.gla.Strings.level2;
import java.util.*;
public enum ShortLongWord {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] words = sc.nextLine().split(" ");

    String min = words[0], max = words[0];

    for (String w : words) {
        if (w.length() < min.length()) min = w;
        if (w.length() > max.length()) max = w;
    }

    System.out.println("Shortest: " + min);
    System.out.println("Longest: " + max);
}

}
