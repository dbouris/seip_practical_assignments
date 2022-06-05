package codeanalyzer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class NullExporterTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    //create an empty map
    Map<String, Integer> metrics = new HashMap<>();
    MetricsExporter nexp = new NullExporter();
    
    @Test
	public void testWriteFileWithUknownFIleType() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Unknown file type");
		nexp.write(metrics, "filepath");
	}
}
