package codeanalyzer;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class SourceCodeAnalyzerRegexTest {
    
    private final static String TEST_CLASS = "src/test/resources/TestClass.java";

    private SourceFileReader scf = new SourceFileReaderLocal();
    private SourceCodeAnalyzer scar = new SourceCodeAnalyzerRegex(scf);


    @Test
	public void testCalculateRegexLOC() throws IOException {
		assertEquals(21, scar.calculateLOC(TEST_CLASS));
	}

    @Test
	public void testCalculateRegexNOM() throws IOException {
		assertEquals(3, scar.calculateNOM(TEST_CLASS));
	}

    @Test
	public void testCalculateRegexNOC() throws IOException {
		assertEquals(3, scar.calculateNOC(TEST_CLASS));
	}
}
