package me.toam.core.lambdaexpressions.searchPerson;
/**
 * @author: Binh Nguyen Thai
 *
 * Sep 22, 2020
 */
 
public class CheckPersonEligibleForSelectiveService implements CheckPerson{
    @Override
    public boolean checkAgeRange(Person person) {
        return person.getAge() <= 27 && person.getAge() > 20;
    }
}
