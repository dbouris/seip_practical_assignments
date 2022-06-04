package codeanalyzer;

import java.io.IOException;
import java.util.Map;

public interface MetricsExporter {
    
    void write(String outputType, Map<String, Integer> metrics, String filepath);
}
