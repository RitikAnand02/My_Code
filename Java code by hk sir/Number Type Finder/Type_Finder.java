/*
 Develop a program to read one no from the programeer, find the number type if number is even 
no add 20 to the passed number returm number. if no is odd throws exception with erroe msg " pass only even number".
 */

public class Type_Finder {

    static int evenOdd(int num) throws IllegalAccessException {
        if (num % 2 != 0)
            throw new IllegalAccessException("Pass only Even number");
        return num + 20;

    }

}
