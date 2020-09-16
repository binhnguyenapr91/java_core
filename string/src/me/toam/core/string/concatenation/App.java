package me.toam.core.string.concatenation;

public class App {
    public static void main(String[] args) {
        // Concatenation
        String s1 = "1";
        String s2 = "2";
        // Ex1
        System.out.println(s1+s2);
        System.out.println(1 + 2);
        System.out.println(1 + 2 + "c");
        System.out.println("a" + "b" + 3);

        // Ex2
        int one = 1;
        String two = "2";

        System.out.println(one + two + 3 + 4);

        System.out.println(3 + 4 + one + two);

        // Ex3

        String s3 = "Hello";
        s3 += " Word ";
        s3 += 999;

        System.out.println(s3);
    }
}
