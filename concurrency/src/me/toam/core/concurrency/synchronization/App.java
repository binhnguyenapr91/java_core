package me.toam.core.concurrency.synchronization;

public class App {

    public static void main(String[] args) {
        RaceCondition raceCondition = new RaceCondition();
        raceCondition.process();
    }
}
