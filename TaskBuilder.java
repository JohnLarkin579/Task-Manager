import java.io.File;

public class TaskBuilder {
    private static final String path = "/Users/larkin/Projects/Pet1/Task-Manager/ListOfTasks";
    private static File folder = new File(path);
    private static File[] folderOfPaths = folder.listFiles();
    private static String[] folderOfTitles = folder.list();

    public static File getFolder() {
        return folder;
    }

    public static File[] getFolderOfPaths() {
        return folderOfPaths;
    }

    public static String[] getFolderOfTitles() {
        return folderOfTitles;
    }
}
