package com.gla.Strings.level1;
import java.util.Scanner;
public class SubstringDemo {static String mySubstring(String str, int start, int end) {
    String result = "";
    for (int i = start; i < end; i++) {
        result += str.charAt(i);
    }
    return result;
}

    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String s1 = mySubstring(str, start, end);
        String s2 = str.substring(start, end);

        System.out.println(compare(s1, s2));
    }
}
