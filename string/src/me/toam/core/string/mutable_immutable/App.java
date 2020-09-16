package me.toam.core.string.mutable_immutable;

public class App {
    public static void main(String[] args) {
        MutableString mutableString = new MutableString("Hello");
        // Get current s value object
        System.out.println( mutableString.getS() + ": " + mutableString.getS().hashCode());

        // Set new value to s
        mutableString.setS("Hello Java");
        mutableString.getS().concat(" World");
        System.out.println( mutableString.getS() + ": " + mutableString.getS().hashCode());

        // Is s after set new value the same object with constructed s?

        mutableString.setS("Another s value");
        System.out.println( mutableString.getS() + ": " + mutableString.getS().hashCode());
        
        ImmutableString immutableString = new ImmutableString("Foo");
        // Get current s value object
        System.out.println( immutableString.getS() + ": " + immutableString.getS().hashCode());
        // Try to change value of s
        immutableString.getS().concat("Bazz");
        System.out.println( immutableString.getS() + ": " + immutableString.getS().hashCode());


    }
}
