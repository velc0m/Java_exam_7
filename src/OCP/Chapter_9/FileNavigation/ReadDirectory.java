package OCP.Chapter_9.FileNavigation;

import java.io.File;
import java.io.IOException;

/**
 * Created by LitVV on 09.09.2016.
 */
public class ReadDirectory {

    public static void main(String[] args) {

        File dir = new File("Apple");
        dir.mkdir();

        File file1 = new File(dir, "Iphope7.txt");
        File file2 = new File(dir, "Manual.pdf");
        File file3 = new File(dir, "USA New York.log");

        try {
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Read Directory
        String[] files = new String[100];
        File search = new File("Apple");
        files = search.list();

        for (String file : files) {
            System.out.println("Found " + file);
        }
    }
}
