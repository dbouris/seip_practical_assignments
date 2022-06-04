package codeanalyzer;

import java.io.IOException;
import java.util.Map;

public interface MetricsExporter {
    
    void write(Map<String, Integer> metrics, String filepath);
}
