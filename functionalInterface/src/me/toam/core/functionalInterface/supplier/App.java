package me.toam.core.functionalInterface.supplier;

import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {
        Supplier<Programming> programmingSupplier = Programming::new;
        Programming programming = programmingSupplier.get();

        Supplier<String> languageSupplier = Programming::getDefaultLanguage;

        programming.print();
        System.out.println(languageSupplier.get());
    }
}
