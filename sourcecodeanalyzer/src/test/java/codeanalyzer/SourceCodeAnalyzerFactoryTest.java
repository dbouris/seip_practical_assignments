package codeanalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SourceCodeAnalyzerFactoryTest {
    
    // test the SourceCodeAnalyzerFactory class for the regex type and local reader
    @Test
    public void testSourceCodeAnalyzerFactoryRegex() {
        SourceCodeAnalyzerFactory sfac = new SourceCodeAnalyzerFactory();
        SourceCodeAnalyzer sca = sfac.getSourceCodeAnalyzer("regex", new SourceFileReaderLocal());
        assertEquals(sca.getClass(), SourceCodeAnalyzerRegex.class);
    }

    // test the SourceCodeAnalyzerFactory class for the strcomp type and local reader
    @Test
    public void testSourceCodeAnalyzerFactoryStrcomp() {
        SourceCodeAnalyzerFactory sfac = new SourceCodeAnalyzerFactory();
        SourceCodeAnalyzer sca = sfac.getSourceCodeAnalyzer("strcomp", new SourceFileReaderLocal());
        assertEquals(sca.getClass(), SourceCodeAnalyzerString.class);
    }

    // test the SourceCodeAnalyzerFactory class for a non existing type and local reader
    @Test
    public void testSourceCodeAnalyzerFactoryNonExisting() {
        SourceCodeAnalyzerFactory sfac = new SourceCodeAnalyzerFactory();
        SourceCodeAnalyzer sca = sfac.getSourceCodeAnalyzer("nonExisting", new SourceFileReaderLocal());
        assertEquals(sca.getClass(), SourceCodeAnalyzerNull.class);
    }

    // test the SourceCodeAnalyzerFactory class for the regex type and web reader
    @Test
    public void testSourceCodeAnalyzerFactoryRegexWeb() {
        SourceCodeAnalyzerFactory sfac = new SourceCodeAnalyzerFactory();
        SourceCodeAnalyzer sca = sfac.getSourceCodeAnalyzer("regex", new SourceFileReaderWeb());
        assertEquals(sca.getClass(), SourceCodeAnalyzerRegex.class);
    }

    // test the SourceCodeAnalyzerFactory class for the strcomp type and web reader
    @Test
    public void testSourceCodeAnalyzerFactoryStrcompWeb() {
        SourceCodeAnalyzerFactory sfac = new SourceCodeAnalyzerFactory();
        SourceCodeAnalyzer sca = sfac.getSourceCodeAnalyzer("strcomp", new SourceFileReaderWeb());
        assertEquals(sca.getClass(), SourceCodeAnalyzerString.class);
    }

    // test the SourceCodeAnalyzerFactory class for a non existing type and web reader
    @Test
    public void testSourceCodeAnalyzerFactoryNonExistingWeb() {
        SourceCodeAnalyzerFactory sfac = new SourceCodeAnalyzerFactory();
        SourceCodeAnalyzer sca = sfac.getSourceCodeAnalyzer("nonExisting", new SourceFileReaderWeb());
        assertEquals(sca.getClass(), SourceCodeAnalyzerNull.class);
    }

}
