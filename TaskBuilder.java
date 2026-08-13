import java.io.File;

public class TaskBuilder {
    private static final String path = "/Users/larkin/Projects/Pet1/Task-Manager/ListOfTasks";
    private static File folder = new File(path);
    private static File[] folderOfPaths;
    private static String[] folderOfTitles;

    public static void refresh() {
        folderOfPaths = folder.listFiles();
        folderOfTitles = folder.list();
    }
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
