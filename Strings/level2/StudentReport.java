package com.gla.Strings.level2;
import java.util.*;
public class StudentReport { static String grade(double per) {
    if (per >= 90) return "A";
    if (per >= 75) return "B";
    if (per >= 50) return "C";
    return "D";
}

    public static void main(String[] args) {
        Random r = new Random();
        int n = 5;

        for (int i = 0; i < n; i++) {
            int p = r.nextInt(100);
            int c = r.nextInt(100);
            int m = r.nextInt(100);

            int total = p + c + m;
            double per = total / 3.0;

            System.out.println(p + " " + c + " " + m +
                    " -> " + per + "% Grade: " + grade(per));
        }
    }
}
