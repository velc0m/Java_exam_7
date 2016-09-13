package OCP.Chapter_9.nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by LitVV on 12.09.2016.
 */
public class dirStream {

    public static void main(String[] args) {

        Path dirA = Paths.get("E:/Dir_A");
        Path dirB = Paths.get("E:/Dir_A", "Dir_B");
        Path dirC = Paths.get("E:/Dir_A", "Dir_B/Dir_C");
        try {
            DirectoryStream<Path> directoryStreamA = Files.newDirectoryStream(dirA);
            DirectoryStream<Path> directoryStreamB = Files.newDirectoryStream(dirB, "B_2*");
            for (Path path : directoryStreamA) {
                System.out.println(path.getFileName());
            }
            System.out.println("-----------");
            for (Path path : directoryStreamB) {
                System.out.println(path.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
