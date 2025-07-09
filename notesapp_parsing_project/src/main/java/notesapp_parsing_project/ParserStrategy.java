package notesapp_parsing_project;

import java.io.IOException;
import java.util.ArrayList;

public interface ParserStrategy{
    public ArrayList<TextEntry> parse(String filePath) throws IOException;
}