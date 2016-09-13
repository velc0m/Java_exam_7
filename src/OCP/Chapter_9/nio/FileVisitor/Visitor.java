package OCP.Chapter_9.nio.FileVisitor;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Visitor extends SimpleFileVisitor<Path>{

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (file.getFileName().endsWith(".txt")) {
            Files.delete(file);
        }
        return FileVisitResult.CONTINUE;
    }

    public static void main(String[] args) throws IOException {
        Visitor visitor = new Visitor();
        Files.walkFileTree(Paths.get("C:", "Intel"), visitor);
    }
}
