package OCP.Chapter_9.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by LitVV on 09.09.2016.
 */
public class PathClass {

    public static void main(String[] args) {

        //Absolute
        Path p_dir = Paths.get("E:","Java Exam 7 Test", "Apple");
        //Path p_dir = FileSystems.getDefault().getPath("D:","Java Exam 7", "Apple");

        //Relative
        Path p_dir_2 = Paths.get("My Directory/start");
        //url
        //Path p_url = Paths.get(URI.create("http://www.tut.by"));

        Path file = Paths.get("My Directory/start", "test.txt");


        //Converting
        File file1 = new File("a_file.txt");
        Path path = Paths.get("b_file.txt");

        Path file1_convert = file1.toPath();
        File path_convert = path.toFile();

        try {
            System.out.println("absolute dir is " + Files.exists(p_dir));
            System.out.println("relative dir is " + Files.exists(p_dir_2));
            System.out.println("file is " + Files.exists(file));

            Files.createDirectories(p_dir);
            Files.createDirectories(p_dir_2);
            Files.createFile(file);

            System.out.println("absolute dir is " + Files.exists(p_dir));
            System.out.println("relative dir is " + Files.exists(p_dir_2));
            System.out.println("file is " + Files.exists(file));

            Files.delete(file);
            System.out.println("file is " + Files.exists(file));

        } catch (IOException e) {
            e.printStackTrace();
        }

        //Delete, copy, remove
        try {
            Path file_for_copy = Paths.get("My Directory/start", "ttt.txt");
            Files.copy(file, file_for_copy);
            Files.delete(file_for_copy);
            Files.move(file, file_for_copy);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
