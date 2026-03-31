package com.gla.javaarray.level2;
import java.util.Scanner;

public class Student2D {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    double[][] marks = new double[n][3];
    double[] percent = new double[n];
    String[] grade = new String[n];

    for (int i = 0; i < n; i++) {
        marks[i][0] = sc.nextDouble();
        marks[i][1] = sc.nextDouble();
        marks[i][2] = sc.nextDouble();
    }

    for (int i = 0; i < n; i++) {
        percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

        if (percent[i] >= 90)
            grade[i] = "A";
        else if (percent[i] >= 75)
            grade[i] = "B";
        else if (percent[i] >= 50)
            grade[i] = "C";
        else
            grade[i] = "Fail";
    }

    for (int i = 0; i < n; i++) {
        System.out.println(percent[i] + " " + grade[i]);
    }
}
}
