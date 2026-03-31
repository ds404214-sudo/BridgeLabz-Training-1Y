package com.gla.javaarray.level2;
import java.util.Scanner;
public class BMI2D {  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    double[][] data = new double[n][3];
    String[] status = new String[n];

    for (int i = 0; i < n; i++) {
        data[i][0] = sc.nextDouble(); // weight
        data[i][1] = sc.nextDouble(); // height

        if (data[i][0] <= 0 || data[i][1] <= 0) {
            System.out.println("Invalid input");
            i--;
        }
    }

    for (int i = 0; i < n; i++) {
        data[i][2] = data[i][0] / (data[i][1] * data[i][1]);

        if (data[i][2] < 18.5)
            status[i] = "Underweight";
        else if (data[i][2] < 25)
            status[i] = "Normal";
        else if (data[i][2] < 30)
            status[i] = "Overweight";
        else
            status[i] = "Obese";
    }

    for (int i = 0; i < n; i++) {
        System.out.println(data[i][0] + " " + data[i][1] + " " + data[i][2] + " " + status[i]);
    }
}
}
