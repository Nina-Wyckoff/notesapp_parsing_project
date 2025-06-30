package notesapp_parsing_project;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TextEntryTest {

    @Test
    void testTextEntryCreationTagged(){
        String content = "This is content";
        String tag = "This is a tag";
        TextEntry entry = new TextEntry(content,tag);

        assertEquals(content, entry.getContent(),"Content matches input content");
        assertEquals(tag, entry.getTag(), "Tag matches input tag");
    }

    @Test
    void testTextEntryCreationUntagged(){
        String content = "This is content";
        TextEntry entry = new TextEntry(content);

        assertEquals(content, entry.getContent(),"Content matches input content");
        assertEquals(null, entry.getTag(),"Tag matches null value");
    }

    @Test
    void testGetContent(){

    }

    @Test 
    void testGetTagUntagged(){

    }

    @Test
    void testGetTagTagged(){

    }

    @Test
    void testToString(){

    }
}