package codeanalyzer.exporters;

import java.util.Map;

/**
 * This class is used when there is no known exporter.
 * 
 * @author dbouris
 *
 */

public class NullExporter implements MetricsExporter {

    @Override
    public void write(Map<String, Integer> metrics, String filepath) {
        throw new IllegalArgumentException("Unknown file type");
    }

}
