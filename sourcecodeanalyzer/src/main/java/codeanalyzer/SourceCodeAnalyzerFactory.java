package codeanalyzer;

public class SourceCodeAnalyzerFactory {
    public SourceCodeAnalyzer getSourceCodeAnalyzer(String sourceCodeAnalyzerType, SourceFileReader reader){
        SourceCodeAnalyzer analyzer;
        if (sourceCodeAnalyzerType.equals("regex")){
            analyzer = new SourceCodeAnalyzerRegex(reader);
        } else if (sourceCodeAnalyzerType.equals("strcomp")){
            analyzer = new SourceCodeAnalyzerString(reader);
        }else {
            analyzer = new SourceCodeAnalyzerNull();
        }
        return analyzer;
    }
        
}
