package com.gla.Strings.level1;
import java.util.Scanner;

public enum NumberFormatDemo {
    static void generate(String text) {
        int num = Integer.parseInt(text);
        System.out.println(num);
    }

    static void handle(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        // generate(text);
        handle(text);
    }
}
