package codeanalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import codeanalyzer.exporters.CsvExporter;
import codeanalyzer.exporters.JsonExporter;
import codeanalyzer.exporters.MetricsExporter;
import codeanalyzer.exporters.MetricsExporterFactory;

public class MetricsExporterFactoryTest {
    
    // test the MetricsExporterFactory class for the csv type
    @Test
    public void testMetricsExporterFactoryCsv() {
        MetricsExporterFactory mef = new MetricsExporterFactory();
        MetricsExporter me = mef.getMetricsExporter("csv");
        assertEquals(me.getClass(), CsvExporter.class);
    }

    // test the MetricsExporterFactory class for the json type
    @Test
    public void testMetricsExporterFactoryJson() {
        MetricsExporterFactory mef = new MetricsExporterFactory();
        MetricsExporter me = mef.getMetricsExporter("json");
        assertEquals(me.getClass(), JsonExporter.class);
    }
}
