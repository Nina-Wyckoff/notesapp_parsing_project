package notesapp_parsing_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import notesapp_parsing_project.SegmentStrategy;

//might rename class, this is designed to process files where
//each line is expected ot be a new item
//blank lines are seen as inconsequential as segmenting goes
//an example .md file this is meant for is Names I Like.md
//i need a contructor for this obv

public class SingleLineSegmentStrategy implements SegmentStrategy{

    public ArrayList<String> performSegmentation(BufferedReader reader) {        
        //make a loop reading lines
        try {
            ArrayList<String> fileSegments = new ArrayList<>();
            String nextLine = reader.readLine();
            
            while (nextLine != null) {
                //unless line is blank, add to array list
                
                String strippedLine = nextLine.strip();
                
                if (!strippedLine.contentEquals("")){
                    fileSegments.add(strippedLine);
                }
                
                nextLine = reader.readLine();
            }
            return fileSegments;
            //return array list
        } catch (Exception e) {
            return null;
        }
        
    }
}