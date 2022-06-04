package codeanalyzer;

import java.io.IOException;

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
    
