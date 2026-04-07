package com.gla.Strings.level1;
import java.util.Scanner;

public class StringIndexDemo {    static void generate(String str) {
    System.out.println(str.charAt(100));
}

    static void handle(String str) {
        try {
            System.out.println(str.charAt(100));
        } catch (Exception e) {
            System.out.println("Handled Exception");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // generate(str);
        handle(str);
    }

}
