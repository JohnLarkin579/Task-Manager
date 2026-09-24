package io.github.johnlarkin579.taskmanager;

import java.util.Scanner;

public class Start {
    private static final String MENU = "----------------Action selector----------------\n(A)dd task, (D)elete file, (R)ead text, (E)xit:";
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        if (TaskReader.getArrayOfTitles().length > 0) {
            TaskReader.loadTitleList();
        }

        System.out.println(MENU);

        while (true) {
            String message = userInput.nextLine();

            if ("e".equals(message.toLowerCase())) {
                return;
            }

            else if ("d".equals(message.toLowerCase())) {
                TaskManager.showTask();
                System.out.print("Write file name to delete -> ");
                String title = userInput.nextLine();
                TaskManager.deleteTask(title);
            }

            else if ("a".equals(message.toLowerCase())) {
                TaskManager.addTask();
            }

            else if ("r".equals(message.toLowerCase())) {
                TaskManager.showTask();
            }

            else {
                System.out.println("Invalid input!");
            }

            System.out.println(MENU);

        }


    }
}
