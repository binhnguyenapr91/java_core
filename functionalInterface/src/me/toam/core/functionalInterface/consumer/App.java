package me.toam.core.functionalInterface.consumer;

import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("Hello Consumer");


        Consumer<String> consumer1 = name -> System.out.println("Hello " + name);
        consumer1.accept("Binh Nguyen");

        Consumer<Integer> consumer2 = Age::print;
        consumer2.accept(30);
    }
}
