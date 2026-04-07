package com.gla.Threads;

public class BankAccount { implements Runnable {
    String name;
    String type;

    BankAccount(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " (" + type + ") checking balance | Priority: "
                    + Thread.currentThread().getPriority());
            try {
                Thread.sleep(2000);
            } catch (Exception e) {}
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new BankAccount("User1", "Premium"));
        Thread t2 = new Thread(new BankAccount("User2", "Regular"));
        Thread t3 = new Thread(new BankAccount("User3", "Basic"));

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
    }
}
