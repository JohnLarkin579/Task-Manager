import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        if (TaskBuilder.getFolderOfPaths() != null) {
            TaskReader.loadTaskPath();
        }
        if (TaskBuilder.getFolderOfTitles() != null) {
            TaskReader.loadTaskTitle();
        }

        System.out.print("Choose action: add / remove / read / exit-> ");

        while (true) {
            String message = userInput.nextLine();

            if (message.equals("exit")) {
                return;
            }

            else if (message.equals("add")) {
                System.out.print("Add title -> ");
                String title = userInput.nextLine();

                System.out.print("Write text -> ");
                String text = userInput.nextLine();

                new Task(title, text);
            }

            else if (message.equals("read")) {
                TaskReader.printTasksTitle();
            }

            else if (message.equals("remove")) {
                TaskReader.printTasksTitle();
                System.out.print("Delete file -> ");
                Path path = Path.of(TaskBuilder.getFolder().toString() + File.separator + userInput.nextLine());
                try {
                    Files.delete(path);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                TaskReader.getTaskPathList().clear();
                TaskReader.getTaskTitleList().clear();
                TaskReader.getTaskTitleList();
                TaskReader.loadTaskTitle();
            }

            System.out.print("Choose action: add / remove / read / exit-> ");

        }


    }
}
