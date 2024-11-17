/*
 * Develop a project 
 * - with a method to take two integers as arguments,
 *  divide first arugments by seconf arguments, retruns result.
 * 
 * - if caller passes -ve number,
 *   throw exeception IllegalArgumentException 
 *   with an error message Do not pass -ve numbers 
 * 
 * - if caller passes 0 as frist arugments,
 *   thows exception IllegalStateExecption
 *   with an error message Do not pass zero 
 * 
 * - if caller passes 0 as Second arugments,
 *   thows exception ArithemeticException
 *   with an error message Do not pass zero   
 */

class Division {
    static int div(int p, int q) throws IllegalArgumentException, IllegalStateException, ArithmeticException {
        if (p < 0 || q < 0)
            throw new IllegalArgumentException("Do not pass -ve numbers");

        if (p == 0)
            throw new IllegalStateException("Do not pass zero");

        if (q == 0)
            throw new ArithmeticException("Do not pass zero");
        return q;
    }
}

public class Test5 {
    public static void main(String[] args) {
        try {
            // int res = Division.div(10, 2);
            // int res = Division.div(-10, 2);
            // int res = Division.div(10, -2);
            int res = Division.div(0, 2);

            System.out.println("Result: " + res);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

}
