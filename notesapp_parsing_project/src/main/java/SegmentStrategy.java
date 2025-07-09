package notesapp_parsing_project;

import java.io.BufferedReader;
import java.util.ArrayList;

//must take in string and return a list of strings, as of now 
//make sure to trim() segment strings and check they arent empty

public interface SegmentStrategy {

    public ArrayList<String> performSegmentation(BufferedReader reader);
}