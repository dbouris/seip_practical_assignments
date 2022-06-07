package codeanalyzer;

import java.io.IOException;

/**
 * The class is used when there is no known analyzer.
 * 
 * @author agkortzis
 *
 */

public class SourceCodeAnalyzerNull implements SourceCodeAnalyzer {

    @Override
    public int calculateLOC(String filepath) throws IOException {
        System.err.println("Unknown analyzer");
        return 0;
    }

    @Override
    public int calculateNOM(String filepath) throws IOException {
        System.err.println("Unknown analyzer");
        return 0;
    }

    @Override
    public int calculateNOC(String filepath) throws IOException {
        System.err.println("Unknown analyzer");
        return 0;
    }

}
