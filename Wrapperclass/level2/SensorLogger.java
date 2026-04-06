package com.gla.Wrapperclass.level2;

public class SensorLogger {    public static void logTemperature(Double temp) {
    if (temp != null) {
        System.out.println("Temperature: " + temp);
    }
}

    public static void main(String[] args) {
        double t1 = 25.5;
        Double t2 = 30.2;

        logTemperature(t1); // auto-boxing
        logTemperature(t2);

        Double stored = t1; // boxing
        double value = stored; // unboxing

        System.out.println("Stored: " + stored);
        System.out.println("Value: " + value);
    }

}
