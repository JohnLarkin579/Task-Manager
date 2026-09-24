import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Используется для прочтения списка файлов во время работы программы
 */
public class TaskReader {
    private static final Path path = Folder.getInstance().getPath();
    private static File file = new File(path.toString());

    private static String[] arrayOfTitles = file.list();
    private static List<String> titleList = new ArrayList<>();


    public static String[] getArrayOfTitles() {
        return arrayOfTitles;
    }

    public static void setArrayOfTitles(String[] arrayOfTitles) {
        TaskReader.arrayOfTitles = arrayOfTitles;
    }

    public static List<String> getTitleList() {
        return titleList;
    }

    public static void setTitleList(List<String> titleList) {
        TaskReader.titleList = titleList;
    }

    public static File getFile() {
        return file;
    }

    public static void setFile(File file) {
        TaskReader.file = file;
    }

    public static void loadTitleList() {
        refresh();
        if (arrayOfTitles.length > 0) {
            titleList.clear();
            for (String title : arrayOfTitles) {
                titleList.add(title);
            }
        }
    }

    public static void printTitleList() {
        refresh();
        for (String title : arrayOfTitles) {
            System.out.println(title);
        }
    }

    private static void refresh() {
        arrayOfTitles = file.list();
    }
}
