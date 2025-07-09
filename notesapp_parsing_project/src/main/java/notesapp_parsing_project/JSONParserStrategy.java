package notesapp_parsing_project;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JSONParserStrategy implements ParserStrategy{
    
    protected SegmentStrategy segmentStrategy;

    public JSONParserStrategy(SegmentStrategy segmentStrategy){
        this.segmentStrategy = segmentStrategy;
    }

    @Override
    public ArrayList<TextEntry> parse(String filePath) throws IOException{
        ArrayList<TextEntry> filler = new ArrayList<>();
        return filler;
    }
}