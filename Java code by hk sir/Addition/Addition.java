/*
 Develop a program to add two numbers and display result.
 if the passed number are negative ,throw exception illegal argument exception with the error message 
 do not pass negative numbers..
 if the passed numbers are postive , then only add those two numbers and return result.
 */

public class Addition {
    static int add(int a, int b) throws IllegalArgumentException {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Do Not Pass -ve numbers");
        } else {
            return a + b;
        }
    }

}
