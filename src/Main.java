import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    static StringBuilder log = new StringBuilder();

    public static void main(String[] args) {

        File file1 = new File("D://Games/src");
        makeDir(file1);
        File file2 = new File("D://Games/res");
        makeDir(file2);
        File file3 = new File("D://Games/savegames");
        makeDir(file3);
        File file4 = new File("D://Games/temp");
        makeDir(file4);
        File file5 = new File("D://Games/src/main");
        makeDir(file5);
        File file6 = new File("D://Games/src/test");
        makeDir(file6);
        File file7 = new File("D://Games/src/main/Main.java");
        createFile(file7);
        File file8 = new File("D://Games/src/main/Utils.java");
        createFile(file8);
        File file9 = new File("D://Games/res/drawables");
        makeDir(file9);
        File file10 = new File("D://Games/res/vectors");
        makeDir(file10);
        File file11 = new File("D://Games/res/icons");
        makeDir(file11);
        File file12 = new File("D://Games/temp/temp.txt");
        createFile(file12);

        try (FileWriter writer = new FileWriter("D://Games/temp/temp.txt")) {
            writer.write(log.toString());
            System.out.println(log.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void makeDir(File file) {
        if (file.mkdir()) {
            log.append("Каталог " + file.getName() + " создан\n");
        }
    }

    static void createFile(File file) {
        try {
            if (file.createNewFile()) {
                log.append("Файл " + file.getName() + " создан\n");
            }
        } catch (IOException ex) {
            System.out.println(log.toString());
        }
    }
}