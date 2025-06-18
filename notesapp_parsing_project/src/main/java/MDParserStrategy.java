package notesapp_parsing_project;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MDParserStrategy implements ParserStrategy{
    
    protected SegmentStrategy segmentStrategy;

    public MDParserStrategy(SegmentStrategy segmentStrategy){
        this.segmentStrategy = segmentStrategy;
    }

    @Override
    public parse(String filePath) throws IOException{
        String wholeFileString = Files.readString(filePath);
        List<String> fileSegments = this.segmentStrategy(String);
        //convert strings into text entry objects
    }
}