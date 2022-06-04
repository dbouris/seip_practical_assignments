package codeanalyzer;

public class SourceFileReaderFactory {
    public SourceFileReader getSourceFileReader(String FileType){
        if(FileType.equals("web")){
            return new SourceFileReaderWeb();
        }
        else if(FileType.equals("local")){
            return new SourceFileReaderLocal();
        }
        else{
            return new SourceFileReaderNull();
        }
    }
}
