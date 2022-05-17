package math;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * The ArithmeticOperationsTest provides test cases
 * for both of the ArithmeticOperations Class methods
 * devide() and multiply().
 * 
 * @author dbouris
 * @version 1.0
 * @since 2022-05-14
 */

public class ArithmeticOperationsTest {

    ArithmeticOperations ao = new ArithmeticOperations();

    /**
     * test cases for the devide() method of the
     * ArithmeticOperations class
     */

    @Test
    public void test_devide_both_positive() {
        Assert.assertEquals(2.0, ao.divide(10.0, 5.0), 0.0);
    }

    @Test
    public void test_devide_both_negative() {
        Assert.assertEquals(4.0, ao.divide(-8.0, -2.0), 0.0);
    }

    @Test
    public void test_devide_one_positive() {
        Assert.assertEquals(-2.0, ao.divide(10.0, -5.0), 0.0);
    }

    @Test
    public void test_devide_zero_numerator() {
        Assert.assertEquals(0.0, ao.divide(0.0, 5.0), 0.0);
    }

    @Test(expected = ArithmeticException.class)
    public void test_devide_zero_denominator() {
        ao.divide(5.0, 0.0);
    }

    @Test(expected = ArithmeticException.class)
    public void test_devide_both_zero() {
        ao.divide(0.0, 0.0);
    }

    /**
     * test cases for the multiply() method of the
     * ArithmeticOperations class
     */

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void test_multiply_both_positive() {
        Assert.assertEquals(16, ao.multiply(4, 4));
    }

    @Test
    public void test_multiply_both_negative() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("x & y should be >= 0");
        ao.multiply(-2, -4);
    }

    @Test
    public void test_multiply_first_negative() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("x & y should be >= 0");
        ao.multiply(-2, 4);
    }

    @Test
    public void test_multiply_second_negative() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("x & y should be >= 0");
        ao.multiply(2, -4);
    }

    @Test
    public void test_multiply_first_zero() {
        Assert.assertEquals(0, ao.multiply(0, 100));
    }

    @Test
    public void test_multiply_second_zero() {
        Assert.assertEquals(0, ao.multiply(100, 0));
    }

    @Test
    public void test_multiply_both_zero() {
        Assert.assertEquals(0, ao.multiply(0, 0));
    }

    @Test
    public void test_multiply_first_MAXVALUE_with_1() {
        Assert.assertEquals(Integer.MAX_VALUE, ao.multiply(Integer.MAX_VALUE, 1));
    }

    @Test
    public void test_multiply_second_MAXVALUE_with_1() {
        Assert.assertEquals(Integer.MAX_VALUE, ao.multiply(1, Integer.MAX_VALUE));
    }

    @Test
    public void test_multiply_first_MAXVALUE() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("The product does not fit in an Integer variable");
        ao.multiply(Integer.MAX_VALUE, 5);
    }

    @Test
    public void test_multiply_second_MAXVALUE() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("The product does not fit in an Integer variable");
        ao.multiply(10, Integer.MAX_VALUE);
    }

}
