package notesapp_parsing_project;

import java.util.ArrayList;

//must take in string and return a list of strings, as of now 
//may return a custom type of segments (text entry?) that has some sort of tag storage
//^though that may be out of bounds of segment strategy
public interface SegmentStrategy {

    public ArrayList<String> performSegmentation(String fullText);
}