import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Start {
    private static final String MENU = "----------------Action selector----------------\n(A)dd task, (D)elete file, (R)ead text, (E)xit:";
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        if (TaskBuilder.getFolderOfPaths() != null) {
            TaskReader.loadTaskPath();
        }
        if (TaskBuilder.getFolderOfTitles() != null) {
            TaskReader.loadTaskTitle();
        }

        System.out.println(MENU);

        while (true) {
            String message = userInput.nextLine();

            if ("e".equals(message.toLowerCase())) {
                return;
            }

            else if ("d".equals(message.toLowerCase())) {
                System.out.print("Write file name to delete -> ");
                String title = userInput.nextLine();
                TaskManager.deleteTask(title);
            }

            else if ("a".equals(message.toLowerCase())) {
                TaskManager.addTask();
            }

            else if ("r".equals(message.toLowerCase())) {
                /*
                очистить список
                прочитать содержимое папки
                вывести на экран список
                 */
                TaskReader.loadTaskPath();
                TaskReader.loadTaskTitle();
                TaskReader.printTasksTitle();
            }

            else {
                System.out.println("Invalid input!");
            }

            System.out.println(MENU);

        }


    }
}
