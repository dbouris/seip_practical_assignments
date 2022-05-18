package math;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * The MyMathFactorialParametrized provides a paremetrized
 * test case for the factorial method testing numbers 0,1,2,12
 * 
 * @author dbouris
 * @version 1.0
 * @since 2022-05-14
 */

@RunWith(Parameterized.class)
public class MyMathisPrimeParametrized {

    @Parameter(value = 0)
    public int n;
    @Parameter(value = 1)
    public boolean result;

    MyMath mm = new MyMath();

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { { 2, true }, { 5, true }, { 10, false }, { 53, true }, { 100, false } };
        return Arrays.asList(data);
    }

    @Test
    public void test_isPrime() {
        Assert.assertEquals(result, mm.isPrime(n));
    }

}
