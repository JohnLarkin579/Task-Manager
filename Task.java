import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task {
    private String title;
    private String text;
    private String filePath = "/Users/larkin/Projects/Pet1/Task-Manager/ListOfTasks";

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

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Task(String title, String text) {
        this.title = title;
        this.text = text;

        this.setFilePath(this.getFilePath() + File.separator + title);
        try (FileWriter file = new FileWriter(this.getFilePath())) {
            file.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
