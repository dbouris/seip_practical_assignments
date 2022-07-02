package codeanalyzer;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import codeanalyzer.analyzers.SourceCodeAnalyzerNull;

public class SourceCodeAnalyzerNullTest {
    
    // create the SourceCodeAnalyzerNull object
    SourceCodeAnalyzerNull sca = new SourceCodeAnalyzerNull();

    @Test
    public void testCalculateLOC() {
        // test the calculateLOC method
        try {
            assertEquals(0, sca.calculateLOC(""));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCalculateNOM() {
        // test the calculateNOM method
        try {
            assertEquals(0, sca.calculateNOM(""));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCalculateNOC() {
        // test the calculateNOC method
        try {
            assertEquals(0, sca.calculateNOC(""));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
