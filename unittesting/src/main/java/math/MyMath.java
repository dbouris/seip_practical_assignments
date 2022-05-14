package math;

/**
 * The MyMath provides a collection of
 * mathematical calculations like the factorial
 * 
 * @author dbouris
 * @version 1.0
 * @since 2022-05-14
 */

public class MyMath {

    /**
     * Calculates the factorial of a number using the
     * recursive algorithmic method.
     * 
     * @param n an integer number
     * @return the factorial of number n
     * @exception IllegalArgumentException when <b>n</b> is negative or > 12
     */
    public int factorial(int n) {
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException("n should be >= 0 and <= 12");
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}