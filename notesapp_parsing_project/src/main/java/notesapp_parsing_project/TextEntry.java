package notesapp_parsing_project;

public class TextEntry{
    protected String content;
    protected String tag;

    public TextEntry(String content, String tag){
        this.content = content;
        this.tag = tag;
    }

    public TextEntry(String content){
        this.content = content;
        this.tag = null;
    }

    public String getContent() {
        return content;
    }

    public String getTag() {
        if (this.tag == null){
            return null
        }
        return this.tag;
    }

    @Override
    public String toString(){
        return ("TextEntry{" +
               "content='" + content + '\'' +
               ", tag='" + tag + '\'' +
               '}');
    }

    

}