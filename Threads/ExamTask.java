package com.gla.Threads;

public class ExamTask { extends Thread {
    String task;
    int delay;

    ExamTask(String task, int delay) {
        this.task = task;
        this.delay = delay;
    }

    public void run() {
        System.out.println(task + " State: " + getState());
        try {
            Thread.sleep(delay);
        } catch (Exception e) {}
        System.out.println(task + " Completed");
    }

    public static void main(String[] args) {
        ExamTask entry = new ExamTask("Entry Monitoring", 2000);
        ExamTask paper = new ExamTask("Question Paper", 5000);
        ExamTask attendance = new ExamTask("Attendance", 10000);
        ExamTask collect = new ExamTask("Collection", 15000);

        paper.setPriority(10);
        attendance.setPriority(8);
        collect.setPriority(7);
        entry.setPriority(5);

        entry.start();
        paper.start();
        attendance.start();
        collect.start();
    }
}
