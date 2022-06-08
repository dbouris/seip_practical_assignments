package codeanalyzer;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import codeanalyzer.analyzers.SourceCodeAnalyzer;
import codeanalyzer.analyzers.SourceCodeAnalyzerString;
import codeanalyzer.readers.SourceFileReader;
import codeanalyzer.readers.SourceFileReaderLocal;

public class SourceCodeAnalyzerStringTest {
    private final static String TEST_CLASS = "src/test/resources/TestClass.java";

    private SourceFileReader scf = new SourceFileReaderLocal();
    private SourceCodeAnalyzer scas = new SourceCodeAnalyzerString(scf);

    @Test
	public void testCalculateStrCompLOC() throws IOException {
		assertEquals(7, scas.calculateLOC(TEST_CLASS));
	}

    @Test
	public void testCalculateStrCompNOM() throws IOException {
		assertEquals(3, scas.calculateNOM(TEST_CLASS));
	}

    @Test
	public void testCalculateStrCompNOC() throws IOException {
		assertEquals(3, scas.calculateNOC(TEST_CLASS));
	}
}
