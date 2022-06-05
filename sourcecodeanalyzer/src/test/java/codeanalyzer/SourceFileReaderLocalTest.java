package codeanalyzer;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class SourceFileReaderLocalTest {
    
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
	public void testReadFileIntoListLocal() throws IOException {
		//read a locally stored file into a List

        //create a SourceFileReaderFactory object
        SourceFileReaderFactory sfrf = new SourceFileReaderFactory();
        SourceFileReader sfr = sfrf.getSourceFileReader(TYPE_LOCAL);

		List<String> actualList = sfr.readFileIntoList(TEST_CLASS_LOCAL);
		
		String[] expecteds = expectedList.stream().toArray(String[]::new);
		String[] actuals = actualList.stream().toArray(String[]::new);
		
		assertArrayEquals(expecteds, actuals);
	}

    @Test
	public void testReadFileIntoStringLocal() throws IOException {
		//read a locally stored file into a String

        //create a SourceFileReaderFactory object
        SourceFileReaderFactory sfrf = new SourceFileReaderFactory();
        SourceFileReader sfr = sfrf.getSourceFileReader(TYPE_LOCAL);
		String actuals = sfr.readFileIntoString(TEST_CLASS_LOCAL);
				
		assertEquals(expectedString, actuals);
	}
}
