package codeanalyzer;

/**
 * This is a Factory class that returns the correct exporter
 * based on the type.
 * 
 * @author dbouris
 *
 */

public class MetricsExporterFactory {
    public MetricsExporter getMetricsExporter(String type) {
        MetricsExporter exporter;
        if (type.equals("csv")) {
            exporter = new CsvExporter();
        } else if (type.equals("json")) {
            exporter = new JsonExporter();
        } else {
            exporter = new NullExporter();
        }
        return exporter;

    }
}
