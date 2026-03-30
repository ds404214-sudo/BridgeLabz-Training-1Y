package com.gla.methods.level2;
import java.util.*;

public class Quadratic { public static double[] roots(double a, double b, double c) {
    double d = b*b - 4*a*c; // correct

    if (d > 0) {
        return new double[]{
                (-b + Math.sqrt(d)) / (2*a),
                (-b - Math.sqrt(d)) / (2*a)
        };
    } else if (d == 0) {
        return new double[]{-b / (2*a)};
    } else {
        return new double[]{};
    }
}
}
