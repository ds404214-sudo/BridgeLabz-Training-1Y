package com.gla.Threads;

public class Device {implements Runnable {
    String name;
    int delay;

    Device(String name, int delay) {
        this.name = name;
        this.delay = delay;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " running at " + System.currentTimeMillis());
            try {
                Thread.sleep(delay);
            } catch (Exception e) {}
        }
    }

    public static void main(String[] args) {
        Thread temp = new Thread(new Device("Temperature", 5000));
        Thread cam = new Thread(new Device("Security Camera", 3000));
        Thread light = new Thread(new Device("Light", 4000));
        Thread door = new Thread(new Device("Door", 6000));

        cam.setPriority(10);
        temp.setPriority(7);
        light.setPriority(5);
        door.setPriority(5);

        temp.start(); cam.start(); light.start(); door.start();
    }

}
