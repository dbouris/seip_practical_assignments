package codeanalyzer.analyzers;

import java.io.IOException;

public interface SourceCodeAnalyzer {

    int calculateLOC(String filepath) throws IOException;
    int calculateNOM(String filepath) throws IOException;
    int calculateNOC(String filepath) throws IOException;
    
}
