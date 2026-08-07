import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TaskReader extends TaskBuilder {
    private static List<File> taskPathList = new ArrayList<>();
    private static List<String> taskTitleList = new ArrayList<>();

    //reading the task's path
    public static void loadTaskPath() {
        for (File file : folderOfPaths) {
            taskPathList.add(file);
        }
    }

    public static void loadTaskTitle() {
        for (String file : folderOfTitles) {
            taskTitleList.add(file);
        }
    }

    public static void printTasksTitle() {
        for (String title : taskTitleList) {
            System.out.println(title);
        }
    }
}
