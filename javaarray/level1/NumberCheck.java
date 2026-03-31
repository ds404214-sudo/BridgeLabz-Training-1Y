package com.gla.javaarray.level1;
import java.util.Scanner;

public class NumberCheck {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];

    for (int i = 0; i < 5; i++) {
        System.out.print("Enter number: ");
        arr[i] = sc.nextInt();
    }

    for (int num : arr) {
        if (num > 0) {
            if (num % 2 == 0)
                System.out.println(num + " is Positive Even");
            else
                System.out.println(num + " is Positive Odd");
        } else if (num < 0) {
            System.out.println(num + " is Negative");
        } else {
            System.out.println("Zero");
        }
    }

    if (arr[0] == arr[4])
        System.out.println("First and last are equal");
    else if (arr[0] > arr[4])
        System.out.println("First is greater");
    else
        System.out.println("Last is greater");
}
}
