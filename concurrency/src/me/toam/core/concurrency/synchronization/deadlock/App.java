package me.toam.core.concurrency.synchronization.deadlock;

public class App {
    public static void main(String[] args) {
        final String string1 = "foo";
        final String string2 = "baz";

        Thread t1 = new Thread() {
            public void run(){
                synchronized(string1){
                    System.out.println("Thread 1: Locked String 1");
                    try{ Thread.sleep(100);} catch(Exception e) {}
                    synchronized(string2){
                        System.out.println("Thread 1: Locked String 2");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run(){
                synchronized(string1){
                    System.out.println("Thread 2: Locked String 1");
                    try{ Thread.sleep(100);} catch(Exception e) {}
                    synchronized(string2){
                        System.out.println("Thread 2: Locked String 2");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
