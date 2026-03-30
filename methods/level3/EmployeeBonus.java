package com.gla.methods.level3;
import java.util.*;

public class EmployeeBonus { public static double[][] generateData(int n) {
    double[][] data = new double[n][2]; // [salary, years]

    for (int i = 0; i < n; i++) {
        data[i][0] = (int)(Math.random() * 90000) + 10000; // salary
        data[i][1] = (int)(Math.random() * 10) + 1; // years
    }
    return data;
}

    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[data.length][3]; // old, new, bonus

        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            double years = data[i][1];

            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;

            result[i][0] = salary;
            result[i][1] = newSalary;
            result[i][2] = bonus;
        }
        return result;
    }

    public static void display(double[][] res) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.println("Old\tNew\tBonus");

        for (double[] r : res) {
            System.out.println(r[0] + "\t" + r[1] + "\t" + r[2]);

            totalOld += r[0];
            totalNew += r[1];
            totalBonus += r[2];
        }

        System.out.println("Total Old: " + totalOld);
        System.out.println("Total New: " + totalNew);
        System.out.println("Total Bonus: " + totalBonus);
    }

    public static void main(String[] args) {
        double[][] data = generateData(10);
        double[][] res = calculateBonus(data);
        display(res);
    }
}
