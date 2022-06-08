package codeanalyzer.analyzers;

import codeanalyzer.readers.SourceFileReader;

/**
 * The class is used to return the correct exporter analyzer
 * object based on the type and reader.
 * 
 * @author dbouris
 *
 */

public class SourceCodeAnalyzerFactory {
    public SourceCodeAnalyzer getSourceCodeAnalyzer(String sourceCodeAnalyzerType, SourceFileReader reader) {
        SourceCodeAnalyzer analyzer;
        if (sourceCodeAnalyzerType.equals("regex")) {
            analyzer = new SourceCodeAnalyzerRegex(reader);
        } else if (sourceCodeAnalyzerType.equals("strcomp")) {
            analyzer = new SourceCodeAnalyzerString(reader);
        } else {
            analyzer = new SourceCodeAnalyzerNull();
        }
        return analyzer;
    }

}
