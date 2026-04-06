package com.gla.Wrapperclass.level1;

public class WrapperToPrimitive {public static void main(String[] args) {
    Double d = 45.67;

    double primitiveDouble = d;   // auto-unboxing
    int primitiveInt = (int) primitiveDouble; // casting

    System.out.println("Double value: " + primitiveDouble);
    System.out.println("Integer value: " + primitiveInt);
}
}
