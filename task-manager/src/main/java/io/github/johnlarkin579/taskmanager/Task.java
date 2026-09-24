package io.github.johnlarkin579.taskmanager;

import java.io.File;
import java.nio.file.Path;

/**
 * Task описывает задачу
 */
public class Task {
    private String title;
    private String text;
    private Path path = null;

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

    public Path getPath() {
        return path;
    }

    public Task(String title, String text) {
        this.title = title;
        this.text = text;
        this.path = Path.of(Folder.getInstance().getPath().toString() + File.separator + this.title + ".txt");
    }
}
