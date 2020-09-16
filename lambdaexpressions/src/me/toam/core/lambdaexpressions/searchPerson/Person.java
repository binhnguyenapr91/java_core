package me.toam.core.lambdaexpressions.searchPerson;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

/**
 * @author: Binh Nguyen Thai
 *
 * Sep 21, 2020
 */
 
public class Person {
    public enum  Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void printPerson() {
        System.out.format("Name: %-15s | Age: %2d" , this.name, this.getAge());
        System.out.println();
    }

    public int getAge() {
        Period period = Period.between(this.getBirthday(),LocalDate.now());
        return period.getYears();
    }
}
