package com.gla.methods.level2;
import java.util.*;

public class RandomNumbers {public static int[] generate4DigitRandomArray(int size) {
    int[] arr = new int[size];

    for (int i = 0; i < size; i++) {
        arr[i] = (int)(Math.random() * 9000) + 1000;
    }
    return arr;
}

    public static double[] stats(int[] arr) {
        int sum = 0, min = arr[0], max = arr[0];

        for (int x : arr) {
            sum += x;
            min = Math.min(min, x);
            max = Math.max(max, x);
        }

        return new double[]{(double)sum/arr.length, min, max};
    }
}
