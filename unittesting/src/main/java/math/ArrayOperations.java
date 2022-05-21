package math;

import java.io.File;
import java.util.ArrayList;

import io.FileIO;

/**
 * The ArrayOperations provides simple array operations
 *
 * @author dbouris
 * @version 1.0
 * @since 2022-05-18
 */
public class ArrayOperations {

    /**
     * Reads integers from a file and returns
     * an array containing the integers which are prime
     *
     * @param fileIo   a FileIO object
     * @param filepath the path of the file from which to read the numbers
     * @param myMath   a MyMath object
     * @return an ArrayList with the Prime numbers
     */

    public int[] findPrimesInFile(FileIO fileIo, String filepath, MyMath myMath) {
        int[] nums = fileIo.readFile(filepath);
        ArrayList<Integer> prime_nums = new ArrayList<Integer>();
        for (int num : nums) {
            if (myMath.isPrime(num)) {
                prime_nums.add(num);
            }
        }
        int[] primeArray = new int[prime_nums.size()];
        int i = 0;
        for (Integer num : prime_nums) {
            primeArray[i] = num;
            i = i +1;
        }
        return primeArray;
    }

}
