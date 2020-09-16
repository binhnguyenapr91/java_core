package me.toam.core.lambdaexpressions.searchPerson;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static me.toam.core.lambdaexpressions.searchPerson.Person.Sex.MALE;

/**
 * @author: Binh Nguyen Thai
 *
 * Sep 21, 2020
 */
 
public class SearchPersonApp {
    public static void printPersons(List<Person> roster, CheckPerson checkPerson) {
        for (Person p : roster) {
            if (checkPerson.checkAgeRange(p)) {
                p.printPerson();
            }
        }
    }

    public static void main(String[] args) {
        List<Person> roster = new ArrayList<>();
        roster.add(new Person("BinhNguyen", LocalDate.of(1991,04,26), MALE, "binh@email.com"));
        roster.add(new Person("NguyenNguyen", LocalDate.of(1995,05,15), MALE, "nguyen@email.com"));
        roster.add(new Person("TienNguyen", LocalDate.of(1999,01,06), MALE, "tien@email.com"));

        System.out.println("===");
        System.out.println("Using interface implementation");
        printPersons(roster, new CheckPersonEligibleForSelectiveService());

        System.out.println("===");
        System.out.println("Using anonymous class");
        printPersons(roster, new CheckPerson() {
            public boolean checkAgeRange (Person person){
                return person.getGender() == MALE && person.getAge() >= 28;
            }
        });

        System.out.println("===");
        System.out.println("Using Lambda Expression");
        printPersons(roster,  person -> person.getGender() == MALE && person.getAge() >= 24);
    }
}
