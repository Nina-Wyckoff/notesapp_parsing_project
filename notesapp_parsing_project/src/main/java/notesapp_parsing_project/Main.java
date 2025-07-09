package notesapp_parsing_project;

import notesapp_parsing_project.MDParserStrategy;
import notesapp_parsing_project.SingleLineSegmentStrategy;
import notesapp_parsing_project.UnspacedSegmentStrategy;

public class Main 
{
    public static void main( String[] args )
    {
        SegmentStrategy segmentStrategy = new SingleLineSegmentStrategy();
        MDParserStrategy parser = new MDParserStrategy(segmentStrategy);
        String path = "/Users/ninawyckoff/Desktop/Notes_App_Archive_Jun_2025/iCloud/Notes/Names I like.md";
        try {
            parser.parse(path);
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}
