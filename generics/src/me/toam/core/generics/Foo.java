package me.toam.core.generics;

/**
 * @author: Binh Nguyen
 * Mar 24, 2021
 */

public class Foo {
    private String name = "Binh";

    {
        System.out.println("Initial Block");
        System.out.println("Name: " + name);
    }

    public Foo() {
        name = "Nguyen";
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        System.out.println("Name: " + foo.name);
    }
}
