package io;

import java.io.File;

import org.junit.*;
import org.junit.rules.ExpectedException;

public class FileIOTest {

    public static String resourcesPath = "src/test/resources";
    FileIO fio = new FileIO();
    ClassLoader classLoader = getClass().getClassLoader();

    @Test
    public void test_readfile_normal() {
        int[] expectedNumbers = new int[]{
            10, 14, 12, 18, 16, 22, 20
        };
        String resourceName = "normal_file.txt";
        File file = new File(classLoader.getResource(resourceName).getFile());
        String filePath = file.getAbsolutePath();
        Assert.assertArrayEquals(expectedNumbers, fio.readFile(filePath));
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void test_readfile_not_existing() {
        String resourceName = "non_existing_file.txt";
        String filePath = resourcesPath.concat(resourceName);
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Input file does not exist");
        fio.readFile(filePath);
    }

    @Test
    public void test_readfile_empty() {
        String resourceName = "empty_file.txt";
        File file = new File(classLoader.getResource(resourceName).getFile());
        String filePath = file.getAbsolutePath();
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Given file is empty");
        fio.readFile(filePath);
    }
}
