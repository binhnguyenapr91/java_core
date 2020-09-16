package me.toam.core.functionalInterface.consumer.transformLaptop;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class App {
    public static class Laptop {

        public Laptop(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setManufacture(String manufacture) {
            this.manufacture = manufacture;
        }

        public void print() {
            System.out.println("Name: " + this.name);
            System.out.println("Manufacture: " + this.manufacture);
            System.out.println("===============================");
        }

        private String name;
        private String manufacture;
    }

    public static void main(String[] args) {
        List<Laptop> laptops = getLaptops();

        System.out.println("Laptop list before get Consumer:");

        for (Laptop laptop: laptops) {
            laptop.print();
        }

        Consumer<Laptop> laptopConsumer = getLaptopConsumer();

        System.out.println("Laptop list after get Consumer:");
        for (Laptop laptop : laptops) {
            laptopConsumer.accept(laptop);
            laptop.print();
        }
    }

    private static List<Laptop> getLaptops() {
        List<Laptop> laptops = new ArrayList<>(3);
        laptops.add(new Laptop("macbook"));
        laptops.add(new Laptop("precision"));
        laptops.add(new Laptop("tequila"));
        return laptops;
    }

    private static Consumer<Laptop> getLaptopConsumer() {
        Consumer<Laptop> laptopConsumer = laptop ->  {
            switch (laptop.getName()) {
                case "macbook":
                    laptop.setManufacture("apple");
                    break;
                case "precision":
                    laptop.setManufacture("dell");
                    break;
                case "tequila":
                    laptop.setManufacture("msi");
            }
        };
        return laptopConsumer;
    }
}
