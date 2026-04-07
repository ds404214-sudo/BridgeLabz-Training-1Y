package com.gla.Strings.level1;
import java.util.Scanner;
public class IllegalArgDemo {static void generate(String str) {
    System.out.println(str.substring(5, 2));
}

    static void handle(String str) {
        try {
            System.out.println(str.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // generate(str);
        handle(str);
    }

}
