package com.gla.Wrapperclass.level1;

public class WrapperMethods {public static void main(String[] args) {
    int a = Integer.parseInt("123");
    double b = Double.parseDouble("3.14");
    boolean c = Boolean.parseBoolean("true");
    String binary = Integer.toBinaryString(10);
    boolean isDigit = Character.isDigit('5');
    char upper = Character.toUpperCase('a');

    System.out.println("Integer: " + a);
    System.out.println("Double: " + b);
    System.out.println("Boolean: " + c);
    System.out.println("Binary of 10: " + binary);
    System.out.println("Is '5' digit? " + isDigit);
    System.out.println("Uppercase of 'a': " + upper);
}
}
