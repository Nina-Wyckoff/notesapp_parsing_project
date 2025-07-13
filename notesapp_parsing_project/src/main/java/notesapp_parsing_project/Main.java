package notesapp_parsing_project;

import java.util.ArrayList;

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
            ArrayList<TextEntry> textEntries = parser.parse(path);
        } catch (Exception e) {
            System.out.println("Exception caught");
        }

        /* Next steps:
        So I've made amazing progress-- great!
        Im able to create an array of text entries
        So i need to use the debugger to get a looksie
        After that i need to focus on coding a Notefile-- whatever that will be
        somewhere to put this array data structure
        but probably with other fields like title 
        parser might need to pass through the title!
        either from file name or top of note

        lets see if i can then design some interface ot interact with the data structure
        probably methods in the note file class

        then of course i need to be able to save a ntoe file to json
        and then i need to make sure i can load in a json file (JSONParserStrategy.java)
        and THEN i need ot code my other segmentation strategies

        i also need to run my test suite and make more
        */
    }
}
