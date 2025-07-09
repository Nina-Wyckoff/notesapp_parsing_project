package notesapp_parsing_project;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MDParserStrategy implements ParserStrategy {
    
    protected SegmentStrategy segmentStrategy;
    protected ArrayList<String> approvedTags;
    protected BufferedReader inputStream;

    public MDParserStrategy(SegmentStrategy segmentStrategy) {
        this.segmentStrategy = segmentStrategy;
        this.approvedTags = new ArrayList<String>();
        this.inputStream = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public ArrayList<TextEntry> parse(String filePath) throws IOException {


        BufferedReader reader = Files.newBufferedReader(Paths.get(filePath));
        try {
            List<String> fileSegments = this.segmentStrategy.performSegmentation(reader);
        } catch (Exception e) {
            // TODO: handle exception
        }
        reader.close();

        ArrayList<TextEntry> textEntries = new ArrayList<>();

        //loop through fileSegments
        for (String segment : fileSegments) {
            TextEntry entry = segmentToTextEntry(segment);
            if (entry != null) {
                textEntries.add(entry);
            }
        }
        
        return textEntries;

    }

    private TextEntry segmentToTextEntry(String segment) throws IOException {

        if (segment.isEmpty()) {          
            return null;
        }
        //conditional: parentheses at end of string
        //if no parentheses at the end, great! null tag, return text entry
        //otherwise, find last instance of ( character
       
        if (segment.endsWith(")")) {
            int tagStartIndex = segment.lastIndexOf("(") + 1;
            
            if (tagStartIndex != 0){
                String possibleTag = segment.substring(tagStartIndex,(segment.length()-1));

                //if tag exists in approved list, we make a tagged text entry object
                if(approvedTags.contains(possibleTag)) {
                    String content = segment.substring(0,tagStartIndex);
                    return new TextEntry(content,possibleTag);
                }

                //if not in approved list but less than 15 characters, prompt user
                //assumption behind this conditional: tags will be shorter than 15 characters
                if (possibleTag.length() < 15) {
                    
                    //prompt user for tag approval
                    //if tag approved, return text entry object with tag and content stripped of tag

                    if(getUserTagApproval(possibleTag)) {
                        String content = segment.substring(0,tagStartIndex);
                        return new TextEntry(content, possibleTag);
                    } 
                        
                }
            }
        } 
        //if no return statement has been activated, default to untagged text entry object
        return new TextEntry(segment);
        
    }

    private boolean getUserTagApproval(String possibleTag) throws IOException {
        //use input stream and prompt user for tag approval
        System.out.print("Type 'T' to approve the following as a tag or any other key to reject: " + possibleTag);
        String response = this.inputStream.readLine();
        
        //if so, add tag to approved tag list, return true
        if(response != null && response.toUpperCase().contentEquals("T")) {
            approvedTags.add(possibleTag);
            return true;
        }

        return false;
    }
}