package me.toam.core.concurrency.threadsafety.shareresource;

public class MyRunnable implements Runnable{
    NotThreadSafe instance = null;

    public MyRunnable(NotThreadSafe instance) {
        this.instance = instance;
    }

    @Override
    public void run() {
        System.out.println(this.instance.add("Thread: " + Thread.currentThread().getName()));
    }
}
