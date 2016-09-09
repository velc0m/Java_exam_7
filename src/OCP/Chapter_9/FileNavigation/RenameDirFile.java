package OCP.Chapter_9.FileNavigation;

import java.io.*;

/**
 * Created by LitVV on 09.09.2016.
 */
public class RenameDirFile {

    public static void main(String[] args) {

        File dir1 = new File("My First Directory");
        dir1.mkdir();
        File file1 = new File(dir1, "MyFirstFile.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Was directory 1 created - " + dir1.isDirectory());
        System.out.println("Was file 1 created - " + file1.isFile());

        try {
            FileReader reader = new FileReader(file1);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("--------------------------");
        //Make delete dir/file
        File dir2 = new File("My second directory");
        dir2.mkdir();

        File file2_1 = new File(dir2, "MySecondFile.txt");
        File file2_2 = new File(dir2, "MyThirdFile.txt");
        try {
            file2_1.createNewFile();
            file2_2.createNewFile();
            System.out.println("Delete file2 = " + file2_1.delete());
            System.out.println("Delete dir2 with file3 = " + dir2.delete());

            File renameFile = new File(dir2, "file.txt");
            System.out.println("Rename file 2 - " + file2_1.renameTo(renameFile));
            System.out.println("Rename file 3 - " + file2_2.renameTo(renameFile));

            renameFile.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
