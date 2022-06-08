package codeanalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import codeanalyzer.readers.SourceFileReader;
import codeanalyzer.readers.SourceFileReaderFactory;
import codeanalyzer.readers.SourceFileReaderLocal;
import codeanalyzer.readers.SourceFileReaderNull;
import codeanalyzer.readers.SourceFileReaderWeb;

public class SourceFileReaderFactoryTest {

    // test the SourceFileReaderFactory class for the local file reader
    @Test
    public void testSourceFileReaderFactoryLocal() {
        SourceFileReaderFactory sfrf = new SourceFileReaderFactory();
        SourceFileReader sfr = sfrf.getSourceFileReader("local");
        assertEquals(sfr.getClass(), SourceFileReaderLocal.class);

    }

    // test the SourceFileReaderFactory class for the web file reader
    @Test
    public void testSourceFileReaderFactoryWeb() {
        SourceFileReaderFactory sfrf = new SourceFileReaderFactory();
        SourceFileReader sfr = sfrf.getSourceFileReader("web");
        assertEquals(sfr.getClass(), SourceFileReaderWeb.class);

    }

    // test the SourceFileReaderFactory class for a non existing reader
    @Test
    public void testSourceFileReaderFactoryNonExisting() {
        SourceFileReaderFactory sfrf = new SourceFileReaderFactory();
        SourceFileReader sfr = sfrf.getSourceFileReader("nonExisting");
        assertEquals(sfr.getClass(), SourceFileReaderNull.class);

    }

}
