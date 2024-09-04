/*
 * Develop a project to read a person age as input for generating voter card if
 * age is less than 18 or greater than 100 throw exeception not eligible for
 * voting
 * else age is greater than 18 or less than 100 display msg collect voter card
 * from e-seva after 1 months..
 */

public class Voter_registration_office {

    static void registerforvoting(int age) throws IllegalAccessException {
        if (age < 18 || age > 100)
            throw new IllegalAccessException("you are not eligible for voting");
        System.out.println("Succesfully registered as voter card");
        System.out.println("Collect your card from e-seva after 1 months");

    }

}