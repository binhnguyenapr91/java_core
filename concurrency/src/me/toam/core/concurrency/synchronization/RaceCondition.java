package me.toam.core.concurrency.synchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class RaceCondition {
    public int count = 0;
    public void increment(){
        count = count++;
    }

    public void process(){
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        IntStream.range(0,1000).forEach(i -> executorService.submit(this::increment));

        executorService.shutdown();

        System.out.println(count);
    }
}
