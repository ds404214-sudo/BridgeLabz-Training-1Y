package com.gla.Wrapperclass.level2;
import java.util.*;
public class RatingsAnalyzer { public static void main(String[] args) {
    int[] arr = {4, 5, 3};
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, null, 4));

    ArrayList<Integer> combined = new ArrayList<>();

    for (int val : arr) {
        combined.add(val); // boxing
    }

    for (Integer val : list) {
        if (Objects.nonNull(val)) {
            combined.add(val);
        }
    }

    int sum = 0;
    for (int val : combined) {
        sum += val;
    }

    double avg = (double) sum / combined.size();
    System.out.println("Average rating: " + avg);
}
}
