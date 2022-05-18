package math;

import org.junit.Assert;
import org.junit.Test;

import io.FileIO;
import static org.mockito.Mockito.*;

public class ArrayOperationsTest {

    ArrayOperations ao = new ArrayOperations();

    @Test
    public void test_findPrimesInFile() {

        FileIO io_mock = mock(FileIO.class);
        MyMath mm_mock = mock(MyMath.class);

        when(io_mock.readFile("path")).thenReturn(new int[] { 10, 9, 7, 3, 12, 4 });

        when(mm_mock.isPrime(10)).thenReturn(false);
        when(mm_mock.isPrime(9)).thenReturn(false);
        when(mm_mock.isPrime(7)).thenReturn(true);
        when(mm_mock.isPrime(3)).thenReturn(true);
        when(mm_mock.isPrime(12)).thenReturn(false);
        when(mm_mock.isPrime(4)).thenReturn(false);

        Assert.assertArrayEquals(new int[] { 7, 3 }, ao.findPrimesInFile(io_mock, "path", mm_mock));
    }
}
