package me.toam.core.generics.simpleGenerics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: Binh Nguyen
 *
 * Sep 16, 2020
 */
 
public class SimpleGenericsApp {
    public static void main(String[] args) {
//Without Generics
        List newList = new LinkedList();
        newList.add(1);
        newList.add(2);
//        newList.add('3');
        newList.add(4);
        newList.add(5);

        Iterator itr = newList.iterator();

        while (itr.hasNext()){
//Without using Generics, app will have ClassCastException in run-time
            Integer holder = (Integer) itr.next();
            System.out.println(holder);
        }

//Using Generics
        List<Integer> newList2 = new LinkedList<>();
        newList2.add(6);
        newList2.add(7);
        newList2.add(8);
//With using Generics, app will have error in compile-time
//        newList2.add("9");
        newList2.add(10);

        Iterator<Integer> itr2 = newList2.iterator();
        while (itr2.hasNext()){
//No need to cast object of Iterator
            Integer holder = itr2.next();
            System.out.println(holder);
        }

    }
}
