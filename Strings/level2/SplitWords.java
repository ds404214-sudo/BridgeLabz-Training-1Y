package com.gla.Strings.level2;
import java.util.*;
public class SplitWords { static String[] splitWords(String str) {
    ArrayList<String> words = new ArrayList<>();
    String temp = "";

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch == ' ') {
            if (!temp.equals("")) {
                words.add(temp);
                temp = "";
            }
        } else {
            temp += ch;
        }
    }
    if (!temp.equals("")) words.add(temp);

    return words.toArray(new String[0]);
}

    static boolean compare(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] custom = splitWords(text);
        String[] builtin = text.split(" ");

        System.out.println(compare(custom, builtin));
    }
}
