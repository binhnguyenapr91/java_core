package me.toam.core.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class Student {
    String name;
    int mark;

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("binh",5));
        students.add(new Student("dat",10));
        students.add(new Student("tu",2));
        students.add(new Student("duong",4));
        students.add(new Student("thanh",4));
        students.add(new Student("dieu",9));
// Stream
        List<String> search = students.stream()
                .filter(s -> {
                    System.out.print(" Filting student: " + s.getName());
                    System.out.println(" - In thread: " + Thread.currentThread().getId());
                    return (s.getMark() <= 5);
                })
                .sorted(new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        System.out.println("Compare:" + o1.getName() + " vs " + o2.getName());
                        if (o1.getMark() > o2.getMark()) {
                            return 1;
                        }
                        return -1;
                    }
                })
                .map(student -> {
                    System.out.println("Mapping student: " + student.getName());
                    System.out.println(" - In thread: " + Thread.currentThread().getId());

                    return student.getName();
                })
                .collect(Collectors.toList());

        System.out.println(search);
// Consumer
        Consumer<String> c1 = s -> System.out.println(s + "DHOME");
        c1.accept("HELLO ");
// Supplier
        Supplier<Double> s1 = () -> Math.random();
        System.out.println(s1.get());
// Predicate
        Predicate<String> startPredicate = str -> str.startsWith("d");

        List<String> search1 = students.stream()
                .filter(s -> startPredicate.test(s.name))
                .map(student -> student.getName())
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(search1);
// Function
        Function<String, Integer> f1 = str -> str.length();

        List<Integer> result = students.stream()
                .map(s -> f1.apply(s.name))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
