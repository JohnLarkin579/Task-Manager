import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        TaskReader.loadTaskPath();
        TaskReader.loadTaskTitle();

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

            System.out.print("Choose action: add / remove / read / exit-> ");

        }


    }
}
