import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        StringBuilder log = new StringBuilder();

        List<String> listDir = new ArrayList<>();
        List<String> listFiles = new ArrayList<>();
        listDir.add("D://Games/src");
        listDir.add("D://Games/res");
        listDir.add("D://Games/savegames");
        listDir.add("D://Games/temp");
        listDir.add("D://Games/src/main");
        listDir.add("D://Games/src/test");
        listFiles.add("D://Games/src/main/Main.java");
        listFiles.add("D://Games/src/main/Utils.java");
        listDir.add("D://Games/res/drawables");
        listDir.add("D://Games/res/vectors");
        listDir.add("D://Games/res/icons");
        listFiles.add("D://Games/temp/temp.txt");

        for (String i : listDir
        ) {
            makeDir(i, log);
        }
        for (String i : listFiles
        ) {
            createFile(i, log);
        }

        writeLog("D://Games/temp/temp.txt", log);

    }

    private static void makeDir(String pathDir, StringBuilder sb) {
        if (new File(pathDir).mkdir()) {
            sb.append("Каталог " + pathDir + " создан\n");
        }
    }

    private static void createFile(String pathFile, StringBuilder sb) {
        try {
            if (new File(pathFile).createNewFile()) {
                sb.append("Файл " + pathFile + " создан\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void writeLog(String pathFileLog, StringBuilder sb) {
        try (FileWriter writer = new FileWriter(pathFileLog)) {
            writer.write(sb.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}