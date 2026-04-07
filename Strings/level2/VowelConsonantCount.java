package com.gla.Strings.level2;
import java.util.*;
public class VowelConsonantCount {static boolean isVowel(char ch) {
    ch = Character.toLowerCase(ch);
    return "aeiou".indexOf(ch) != -1;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int v = 0, c = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) v++;
                else c++;
            }
        }

        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
    }

}
