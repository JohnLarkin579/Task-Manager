import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TaskReader {
    private static List<File> taskPathList = new ArrayList<>();
    private static List<String> taskTitleList = new ArrayList<>();

    public static List<File> getTaskPathList() {
        return taskPathList;
    }

    public static List<String> getTaskTitleList() {
        return taskTitleList;
    }

    //reading the task's path
    public static void loadTaskPath() {
        for (File file : TaskBuilder.getFolderOfPaths()) {
            taskPathList.add(file);
        }
    }

    public static void loadTaskTitle() {
        for (String file : TaskBuilder.getFolderOfTitles()) {
            taskTitleList.add(file);
        }
    }

    public static void printTasksTitle() {
        for (String title : taskTitleList) {
            System.out.println(title);
        }
    }
}
