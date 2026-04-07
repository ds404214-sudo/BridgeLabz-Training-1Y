package com.gla.Strings.level3;

public class FrequencyUnique {static char[] unique(String str) {
    String res = "";
    for (int i = 0; i < str.length(); i++) {
        if (res.indexOf(str.charAt(i)) == -1)
            res += str.charAt(i);
    }
    return res.toCharArray();
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] u = unique(str);

        for (char c : u) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (c == str.charAt(i)) count++;
            }
            System.out.println(c + " -> " + count);
        }
    }
}
