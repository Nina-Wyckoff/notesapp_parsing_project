package notesapp_parsing_project;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.jupiter.api.Test;

import notesapp_parsing_project.TextEntry;

import static org.junit.jupiter.api.Assertions.*;

public class TextEntryTest {

    @Test
    void testTextEntryCreationTagged(){
        String content = "This is content";
        String tag = "This is a tag";
        TextEntry entry = new TextEntry(content,tag);

        assertEquals(content, entry.getContent(),"Tagged Constructor: Content matches input content");
        assertEquals(tag, entry.getTag(), "Tagged Constructor: Tag matches input tag");
    }

    @Test
    void testTextEntryCreationUntagged(){
        String content = "This is content";
        TextEntry entry = new TextEntry(content);

        assertEquals(content, entry.getContent(),"Untagged Constructor: Content matches input content");
        assertEquals(null, entry.getTag(),"Untagged Constructor: Tag matches null value");
    }

    @Test
    void testGetContent(){
        String content = "This is content";
        TextEntry entry = new TextEntry(content,"tag");

        assertEquals(content, entry.getContent(),"getContent(): Content matches input content");
    }

    @Test 
    void testGetTagUntagged(){

        TextEntry entry = new TextEntry("Content");

        assertEquals(null, entry.getTag(),"Untagged getTag(): Tag matches input correctly")
    }

    @Test
    void testGetTagTagged(){
        String testTag = "test tag";
        TextEntry entry = new TextEntry("Content",testTag);

        assertEquals(testTag, entry.getTag(),"Tagged getTag(): Tag matches input correctly")
    }

    @Test
    void testToStringTagged(){
        String content = "This is content";
        String tag = "This is a tag";
        TextEntry entryTagged = new TextEntry(content,tag);
        assertEquals("TextEntry{content='This is content', tag='This is a tag'}", entryTagged.toString(), "toString should format correctly with a tag.");
    }
}