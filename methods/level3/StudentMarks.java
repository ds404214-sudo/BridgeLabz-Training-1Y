package com.gla.methods.level3;
import java.util.*;


public class StudentMarks { public static int[][] generateMarks(int n) {
    int[][] marks = new int[n][3];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < 3; j++) {
            marks[i][j] = (int)(Math.random() * 90) + 10;
        }
    }
    return marks;
}

    public static double[][] calculate(int[][] m) {
        double[][] res = new double[m.length][3]; // total, avg, %

        for (int i = 0; i < m.length; i++) {
            int total = m[i][0] + m[i][1] + m[i][2];
            double avg = total / 3.0;
            double per = (total / 300.0) * 100;

            res[i][0] = total;
            res[i][1] = Math.round(avg * 100.0) / 100.0;
            res[i][2] = Math.round(per * 100.0) / 100.0;
        }
        return res;
    }

    public static void display(int[][] m, double[][] r) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%");

        for (int i = 0; i < m.length; i++) {
            System.out.println(
                    m[i][0] + "\t" + m[i][1] + "\t" + m[i][2] + "\t" +
                            r[i][0] + "\t" + r[i][1] + "\t" + r[i][2]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] marks = generateMarks(n);
        double[][] res = calculate(marks);

        display(marks, res);
    }
}
