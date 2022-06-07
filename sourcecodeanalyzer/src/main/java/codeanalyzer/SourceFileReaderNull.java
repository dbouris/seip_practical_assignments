package codeanalyzer;

import java.io.IOException;
import java.util.List;

/**
 * The class is used when there is no known reader.
 * 
 * @author dbouris
 *
 */
public class SourceFileReaderNull implements SourceFileReader {

    @Override
    public List<String> readFileIntoList(String filepath) throws IOException {
        System.err.println("Unknown reader");
        return null;
    }

    @Override
    public String readFileIntoString(String filepath) throws IOException {
        System.err.println("Unknown reader");
        return null;
    }

}
    
