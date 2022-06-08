package codeanalyzer;


import java.util.HashMap;
import java.util.Map;


import org.junit.Test;

import codeanalyzer.exporters.JsonExporter;
import codeanalyzer.exporters.MetricsExporter;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.doCallRealMethod;

public class JsonExporterTest {

    @Test
	public void testWriteJson() {
		MetricsExporter mockedExporter = mock(JsonExporter.class);
		// create an empty metrics content
		Map<String, Integer> metrics = new HashMap<>();
		String outputFilepath = "whatever-path";
		
		//this is a demo of how a mocked object can call a real method (partial mocking)
		doCallRealMethod().when(mockedExporter).write(metrics, outputFilepath);
		mockedExporter.write(metrics, outputFilepath);
		//just verify that the method was executed/called
		verify(mockedExporter).write(metrics, outputFilepath);
	}

}