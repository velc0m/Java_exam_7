package OCP.Chapter_9.nio.path;

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
        Path p_dir = Paths.get("E:","Cars", "BMW", "Series 7");
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

            Files.createDirectories(p_dir_2);
            Files.createFile(file);

            System.out.println("absolute dir is " + Files.exists(p_dir));
            System.out.println("relative dir is " + Files.exists(p_dir_2));
            System.out.println("file is " + Files.exists(file));

            /*Files.delete(file);
            System.out.println("file is " + Files.exists(file));*/

        } catch (IOException e) {
            e.printStackTrace();
        }

        //Delete, copy, remove
        try {
            Path file_for_copy = Paths.get("My Directory/start", "ttt.txt");
            Files.copy(file, file_for_copy);
            Files.delete(file_for_copy);
            Files.move(file, file_for_copy);
            Files.delete(file_for_copy);

        } catch (IOException e) {
            e.printStackTrace();
        }

        //Get information about Path
        System.out.println("-----P a t h-----");
        System.out.println("Name dir - " + p_dir.getFileName());
        System.out.println("Name dir one from root- " + p_dir.getName(0));
        System.out.println("Name dir next - " + p_dir.getName(1));
        System.out.println("Name dir last - " + p_dir.getName(2));

        System.out.println("Number of the element in paths include root - " + p_dir.getNameCount());
        System.out.println("Parent or the dir - " + p_dir.getParent());
        System.out.println("Root og the dir - " + p_dir.getRoot());
        System.out.println("Sub Path from 0 to 2 - " + p_dir.subpath(0,2));
        System.out.println("String representation or the path - " + p_dir.toString());

        //Iteration through Path
        System.out.println("-----I T E R A T I O N-----");
        int space = 1;
        Path longPath = Paths.get("E:", "Cars", "BMW", "Series 7", "Owner", "Vitali.txt");
        for (Path path1 : longPath) {
            System.out.format("%" + space + "s%s%n", "", path1);
            space += 2;
        }

        //Normalize the Path
        System.out.println("-----N O R M A L I Z E-----");
        Path norm_path = Paths.get("/a/./b/./c");
        System.out.println("Origin path - " + norm_path);
        System.out.println("Normalize path -  " + norm_path.normalize());
        System.out.println("Origin path - " + Paths.get("/a/b/c/.."));
        System.out.println("Normalize path -  " + Paths.get("/a/b/c/..").normalize());
        System.out.println("Origin path - " + Paths.get("../a/b/c"));
        System.out.println("Normalize path -  " + Paths.get("../a/b/c").normalize());

        //Resolve vs relativize path
        System.out.println("-----R E S O L V E-----");
        Path longPath1 = Paths.get("E:", "Cars", "BMW", "Series 7", "Owner");
        Path fileForResolve = Paths.get("ResolveFiles", "rFile.txt");
        Path res = longPath1.resolve(fileForResolve);
        System.out.println("Result - " + res);

        Path relativize = longPath1.relativize(res);
        System.out.println("relativize - " + relativize);


    }
}
