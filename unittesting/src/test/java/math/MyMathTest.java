package math;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * The MyMathTest provides test cases
 * for the exceptions thrown from the factorial and
 * the isPrime method.
 * 
 * @author dbouris
 * @version 1.0
 * @since 2022-05-14
 */

public class MyMathTest {

    MyMath mm = new MyMath();

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void test_factorial_negative() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("n should be >= 0 and <= 12");
        mm.factorial(-4);
    }


    @Test
    public void test_factorial_outOfPositiveBound() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("n should be >= 0 and <= 12");
        mm.factorial(17);
    }

    @Test
    public void test_factorial_UpperBound() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("n should be >= 0 and <= 12");
        mm.factorial(13);
    }

    @Test
    public void test_factorial_LowerBound() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("n should be >= 0 and <= 12");
        mm.factorial(-1);
    }

    @Test
    public void test_isPrime_outOfBounds() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("n should be >=2");
        mm.isPrime(1);
    }
}
