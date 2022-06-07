package codeanalyzer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * The class is used call all the methods of the sourcecodeanalyzer 
 * library and export the results.
 * 
 * @author dbouris
 *
 */

public class CodeAnalyzer {
    public void generateMetrics(String JavaSourceCodeInputFile, String sourceCodeAnalyzerType,
            String SourceCodeLocationType, String OutputFilePath, String OutputFileType) throws IOException {
        
                // get the reader object
                SourceFileReaderFactory sourceFileReaderFactory = new SourceFileReaderFactory();
                SourceFileReader sourceFileReader = sourceFileReaderFactory.getSourceFileReader(SourceCodeLocationType);
                
                //get the analyzer object
                SourceCodeAnalyzerFactory sourceCodeAnalyzerFactory = new SourceCodeAnalyzerFactory();
                SourceCodeAnalyzer sourceCodeAnalyzer = sourceCodeAnalyzerFactory.getSourceCodeAnalyzer(sourceCodeAnalyzerType, sourceFileReader);

                //get the metrics and save them in a Map Object
                int loc = sourceCodeAnalyzer.calculateLOC(JavaSourceCodeInputFile);
                int nom = sourceCodeAnalyzer.calculateNOM(JavaSourceCodeInputFile);
                int noc = sourceCodeAnalyzer.calculateNOC(JavaSourceCodeInputFile);

                Map<String, Integer> metrics = new HashMap<>();
                metrics.put("loc", loc);
                metrics.put("nom", nom);
                metrics.put("noc", noc);

                //get the exporter object
                MetricsExporterFactory metricsExporterFactory = new MetricsExporterFactory();
                MetricsExporter metricsExporter = metricsExporterFactory.getMetricsExporter(OutputFileType);

                //create the file
                metricsExporter.write(metrics, OutputFilePath);
                
                
                
                


    }

}
