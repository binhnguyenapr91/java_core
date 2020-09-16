package me.toam.core.functionalInterface;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello Supplier";
        System.out.println(supplier.get());
    }
}
