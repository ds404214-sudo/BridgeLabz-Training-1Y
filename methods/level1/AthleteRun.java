package com.gla.methods.level1;
import java.util.Scanner;
public class AthleteRun { public static double calculateRounds(double a, double b, double c) {
    double perimeter = a + b + c;
    return 5000 / perimeter; // 5km = 5000m
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 sides: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println("Rounds needed: " + calculateRounds(a, b, c));
    }
}
