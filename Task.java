import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task {
    private String title;
    private String text;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public Task(String title, String text) {
        this.title = title;
        this.text = text;


        try (FileWriter file = new FileWriter(Folder.getInstance().getPath() + title)) {
            file.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
