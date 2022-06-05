package codeanalyzer;

import java.util.Map;

public class NullExporter implements MetricsExporter {

    @Override
    public void write(Map<String, Integer> metrics, String filepath) {
       throw new IllegalArgumentException("Unknown file type");
    }

}
    
