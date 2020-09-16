package me.toam.core.concurrency.threadsafety.shareresource;

public class App {
    public static int testMethod() {
        int threadSafeInt = 0;
        return threadSafeInt++;
    }

    public static void main(String[] args) {
        NotThreadSafe sharedInstance = new NotThreadSafe();
        new Thread(new MyRunnable(sharedInstance)).start();
        new Thread(new MyRunnable(sharedInstance)).start();
    }
}
