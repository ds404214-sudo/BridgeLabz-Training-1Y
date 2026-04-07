package com.gla.Strings.level2;
import java.util.*;
public class CharType { static String check(char ch) {
    if (Character.isLetter(ch)) {
        ch = Character.toLowerCase(ch);
        return "aeiou".indexOf(ch) != -1 ? "Vowel" : "Consonant";
    }
    return "Not Letter";
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (char ch : str.toCharArray()) {
            System.out.println(ch + " -> " + check(ch));
        }
}
