package codeanalyzer;

import java.util.Map;

public interface MetricsExporter {
    
    void write(Map<String, Integer> metrics, String filepath);
}
