import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

package notesapp_parsing_project;

/*  Note file thoughts:

 * the constructor takes in a title (must change mdparser to extract that) OR user just inputs
 * 
 * i think there should be a separated method or file where the user is prompted
 * ^so its not super annoying to switch interfaces
 *
 * possible later improvements: 
 * - giving each entry a unique id
 * - more sophisticated randomization
*/

public class NoteFile {

    private String title;
    private int numberOfEntries;
    private Map<String,ArrayList<String>> tagToEntryMap;


    public Notefile(ArrayList<TextEntry> textEntries,String title) {        
        this.title = title;
        this.numberOfEntries = textEntries.size();
        this.tagToEntryMap = processArray(textEntries);

    }

    private Map<String,ArrayList<String>> processArray(ArrayList<TextEntry> textEntries) {        
        Map<String,ArrayList> tagToEntryMap = new HashMap<>();
        for (TextEntry entry: textEntries) {
            String thisTag = entry.getTag();
            if (!tagToEntryMap.containsKey(thisTag)) {
                tagToEntryMap.put(thisTag, new ArrayList<String>())                
            } 
            ArrayList<String> listReference = tagToEntryMap.get(thisTag);
            listReference.add(entry.getContent());
                
            
            return tagToEntryMap;
        }

    }

    private int updateNumberOfEntries() {        
        int counter = 0;
        for (ArrayList<String> array : this.tagToEntryMap.values()){
            for (String contentString : array) {
                counter++;
            }
        }
        return counter;   
    }

    public String getTitle() {        
        return title;
    }

    public String getAllTags() {
        String tagsString = this.tagToEntryMap.keySet().toString();
        return tagsString;
    }

    public void combineTags(String tagKept, String tagAbsorbed) {
        /*with the former parameter being the name kept (like for sur and sir)
        *this method takes the arrayList associated with tagAbsorbed and 
        *adds it to the ArrayList associated with tagKept
        *and then of course deletes the tagAbsorbed key value pair
        */
    }

    public void renameTag(String currentTagName, String newTagName) {

    }

    public String getRandomEntries(int quantity, String tag) {
        //if no second argument then no tag filter is used
    }


    public void saveToJSON(String path) {
        //saves note file to json format, if no argument then keeps in current directory
    }
        
    



}