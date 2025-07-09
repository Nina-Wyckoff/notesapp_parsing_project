package notesapp_parsing_project;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class JSONParserStrategy implements ParserStrategy{
    
    protected SegmentStrategy segmentStrategy;

    public JSONParserStrategy(SegmentStrategy segmentStrategy){
        this.segmentStrategy = segmentStrategy;
    }

    @Override
    public parse(String filePath) throws IOException{

    }
}