package com.gla.javaarray.level2;
import java.util.Scanner;

public class StudentGrade { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    double[] phy = new double[n];
    double[] chem = new double[n];
    double[] math = new double[n];
    double[] percent = new double[n];
    String[] grade = new String[n];

    for (int i = 0; i < n; i++) {
        phy[i] = sc.nextDouble();
        chem[i] = sc.nextDouble();
        math[i] = sc.nextDouble();

        if (phy[i] < 0 || chem[i] < 0 || math[i] < 0) {
            System.out.println("Invalid input");
            i--;
        }
    }

    for (int i = 0; i < n; i++) {
        percent[i] = (phy[i] + chem[i] + math[i]) / 3;

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
