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
            thisTag = entry.getTag();

            if (!tagToEntryMap.containsKey(thisTag)) {
                tagToEntryMap.put(thisTag, new ArrayList<String>())                
            } 
            ArrayList<String> listReference = tagToEntryMap.get(thisTag);
            listReference.add(entry.getContent());
                
            }
        }
    
        /*
        * processArray() creates a hashmap of lists in which the key is a tag and the list is of content strings that have that key
        * there is a key in the hashmap that is null for untagged items
        *
        *textEntry.getTag()
        */

    }

    private int updateNumberOfEntries() {
        //this method updates the number of entries total if size of textEntries input is no longer accurate
        //this  returned integer is useful for randomization
        //the method works by calling get size on each arrayList of content and 
        //calculating the total
    }

    public String getTitle() {
        
        return title;
    }

    public String getAllTags() {
        //generates a string representation of a list of all tags, 
        //the keys from the hash map
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