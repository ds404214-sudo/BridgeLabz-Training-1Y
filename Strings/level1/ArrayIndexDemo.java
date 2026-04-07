package com.gla.Strings.level1;

public class ArrayIndexDemo { static void generate() {
    int[] arr = {1, 2, 3};
    System.out.println(arr[10]);
}

    static void handle() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[10]);
        } catch (Exception e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        // generate();
        handle();
    }
}
