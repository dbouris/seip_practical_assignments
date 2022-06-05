package codeanalyzer;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

import codeanalyzer.SourceFileReader;

public class SourceFileReaderNullTest {

    private static List<String> expectedList;
	private static String expectedString;
	private final static String TYPE_WEB = "web";
	private final static String TYPE_LOCAL = "local";
	private final static String TEST_CLASS_LOCAL = "src/test/resources/TestClass.java";
	private final static String TEST_CLASS_WEB ="https://drive.google.com/uc?export=download&id=1z51FZXqPyun4oeB7ERFlOgfcoDfLLLhg";
	
	@BeforeClass
	public static void setUp() throws IOException {
		expectedList = Files.readAllLines(new File(TEST_CLASS_LOCAL).toPath(), Charset.defaultCharset());
		expectedString = String.join("\n", expectedList) + "\n"; // transforms a list into a String (with 'new line' as delimiter) 
	}

    @Test
    public void testReadFileIntoListNull() throws IOException {
		//give a none existing type to cause a null List return
		SourceFileReaderNull sfr = new SourceFileReaderNull();
		List<String> actualList = sfr.readFileIntoList("any-filepath");
		
		assertNull(actualList);
	}
	
	@Test
	public void testReadFileIntoStringNull() throws IOException {
		//give a none existing type to cause a null String return
		SourceFileReaderNull sfr = new SourceFileReaderNull();
		String actualString = sfr.readFileIntoString("any-filepath");
		
		assertNull(actualString);
	}
}
