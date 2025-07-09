package notesapp_parsing_project;

import notesapp_parsing_project.MDParserStrategy;
import notesapp_parsing_project.SingleLineSegmentStrategy;
import notesapp_parsing_project.UnspacedSegmentStrategy;

public class App 
{
    public static void main( String[] args )
    {
        MDParserStrategy parser = new MDParserStrategy(SingleLineSegmentStrategy);
    }
}
