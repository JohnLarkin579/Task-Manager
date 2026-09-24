package io.github.johnlarkin579.taskmanager;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Класс по патерну Singleton для работы с файлами
 */
public class Folder {
    private static final Folder INSTANCE = new Folder();
    private static Path path = Path.of("Task-Manager/ListOfTasks");

    private Folder() {}

    public static Folder getInstance() {
        return INSTANCE;
    }

    public Path getPath() {
        return path;
    }

    /**
     * Создает файл с именем title с расширением .txt
     * @param title задает имя файла
     * @throws IOException если файл уже существует
     */
    public void createFile(String title) {
        try {
            Files.createFile(Path.of(getInstance().getPath() + title + ".txt"));
        } catch (IOException e) {
            System.out.println("File exists");
        }
    }

    /**
     * Удаляет файл с именем - title с расширением .txt
     * @param title задет имя файла
     * @throws IOException если файл не существует
     */
    public void deleteFile(String title) {
        try {
            Files.delete(Path.of(getPath() + File.separator + title + ".txt"));
        } catch (IOException e) {
            System.out.println("File not exists");
        }
    }
}
