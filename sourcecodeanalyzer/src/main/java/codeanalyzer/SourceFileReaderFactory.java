package codeanalyzer;

/**
 * The class is used to return the correct reader object based on the FileType.
 * 
 * @author dbouris
 *
 */

public class SourceFileReaderFactory {
    public SourceFileReader getSourceFileReader(String FileType) {
        if (FileType.equals("web")) {
            return new SourceFileReaderWeb();
        } else if (FileType.equals("local")) {
            return new SourceFileReaderLocal();
        } else {
            return new SourceFileReaderNull();
        }
    }
}
