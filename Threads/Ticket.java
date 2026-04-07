package com.gla.Threads;

public class Ticket {extends Thread {
    int id;
    String type;
    int priority;

    Ticket(int id, String type, int priority) {
        this.id = id;
        this.type = type;
        this.priority = priority;
        setPriority(priority);
    }

    public void run() {
        int time = 1 + (int)(Math.random() * 5);

        System.out.println("Ticket " + id + " (" + type + ") START by "
                + getName() + " Priority: " + getPriority());

        try { Thread.sleep(time * 1000); } catch (Exception e) {}

        System.out.println("Ticket " + id + " COMPLETED");
    }

    public static void main(String[] args) {
        String[] types = {"Critical", "Feature", "Query", "Feedback"};
        int[] pr = {10, 4, 2, 1};

        for (int i = 1; i <= 10; i++) {
            int idx = (int)(Math.random() * 4);
            new Ticket(i, types[idx], pr[idx]).start();
        }
    }

}
