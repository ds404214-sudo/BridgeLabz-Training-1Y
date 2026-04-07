package com.gla.Strings.level3;
import java.util.*;
public class UniqueChars { static char[] unique(String str) {
    char[] temp = new char[str.length()];
    int k = 0;

    for (int i = 0; i < str.length(); i++) {
        boolean isUnique = true;
        for (int j = 0; j < i; j++) {
            if (str.charAt(i) == str.charAt(j)) {
                isUnique = false;
                break;
            }
        }
        if (isUnique) temp[k++] = str.charAt(i);
    }

    return Arrays.copyOf(temp, k);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(Arrays.toString(unique(str)));
    }
}
