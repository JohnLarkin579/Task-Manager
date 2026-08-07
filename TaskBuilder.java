import java.io.File;

public class TaskBuilder {
    private static final String path = "/Users/larkin/Projects/Task-Manager/Task-Manager/ListOfTasks";
    static File folder = new File(path);
    static File[] folderOfPaths = folder.listFiles();
    static String[] folderOfTitles = folder.list();
}
