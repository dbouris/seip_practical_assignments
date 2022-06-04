package codeanalyzer;

public class MetricsExporterFactory {
    public MetricsExporter getMetricsExporter(String type){
        MetricsExporter exporter;
        if (type.equals("csv")) {
            exporter = new CsvExporter();
        } else if (type.equals("json")) {
            exporter = new JsonExporter();
        } else {
            return null;
        }
        return exporter;
		
    }
}
