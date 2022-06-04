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

    /**
     * Checks whether a number is prime or not.
     * 
     * @param n an integer number
     * @return bollean true/false
     * @exception IllegalArgumentException when <b>n</b> is < 2
     */

    public boolean isPrime(int n) {
        if (n < 2) {
            throw new IllegalArgumentException("n should be >=2");
        } else {
            for (int i = 2; i < n; i++)
                if (n % i == 0)
                    return false;
        }
        return true;
    }

}
