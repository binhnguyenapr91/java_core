package me.toam.core.concurrency;

public class MyThread extends Thread{
    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getId() + " is running!");
    }
}
