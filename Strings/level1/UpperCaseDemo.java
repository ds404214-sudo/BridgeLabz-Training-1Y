package com.gla.Strings.level1;
import java.util.Scanner;
public class UpperCaseDemo { static String toUpper(String str) {
    String result = "";
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch >= 'a' && ch <= 'z') {
            ch = (char)(ch - 32);
        }
        result += ch;
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
        String text = sc.nextLine();

        String manual = toUpper(text);
        String builtin = text.toUpperCase();

        System.out.println(compare(manual, builtin));
    }
}
