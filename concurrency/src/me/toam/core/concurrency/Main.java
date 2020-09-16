package me.toam.core.concurrency;

public class Main {

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        myThread1.start();

        MyThread myThread2 = new MyThread();
        myThread2.start();

        Runnable myRunnable = () -> System.out.println("Runnable: " + Thread.currentThread().getName() + " is running!");
        myRunnable.run();
    }
}
