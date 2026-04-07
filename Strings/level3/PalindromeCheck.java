package com.gla.Strings.level3;
import java.util.*;
public @interface PalindromeCheck {static boolean method1(String s) {
    int l = 0, r = s.length() - 1;
    while (l < r) {
        if (s.charAt(l++) != s.charAt(r--)) return false;
    }
    return true;
}

    static boolean method2(String s, int l, int r) {
        if (l >= r) return true;
        if (s.charAt(l) != s.charAt(r)) return false;
        return method2(s, l + 1, r - 1);
    }

    static boolean method3(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return s.equals(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(method1(s));
        System.out.println(method2(s, 0, s.length() - 1));
        System.out.println(method3(s));
    }
}
