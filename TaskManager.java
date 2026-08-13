import javax.imageio.IIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Управляет задачами: удаление, создание,
 */
public abstract class TaskManager {

    /**
     * Добавление файла и проверка корректности названия
     */
    public static void addTask() {
        Scanner userInput = new Scanner(System.in);
        String title = null;
        String text = null;
        System.out.print("Write a file name -> ");
        title = userInput.nextLine();
        System.out.println();

        while (title == null || title.equals("")) {
            System.out.print("Write the correct file name -> ");
            title = userInput.nextLine();
            System.out.println();
        }

        System.out.print("Write text -> ");
        text = userInput.nextLine();
        System.out.println();

        while(text == null || text.equals("")) {
            System.out.print("File can't be empty! Try again -> ");
            text = userInput.nextLine();
            System.out.println();
        }

        Task task = new Task(title, text);

        try {
            Files.writeString(task.getPath(), task.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteTask(String title) {
        Folder.getInstance().deleteFile(title);
    }

    public void showTask() {

    }
}
