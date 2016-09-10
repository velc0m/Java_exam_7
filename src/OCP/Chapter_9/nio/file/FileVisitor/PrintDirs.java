package OCP.Chapter_9.nio.file.FileVisitor;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class PrintDirs extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Pre - " + dir);
        String name = dir.getFileName().toString();
        if (name.equals("CUI")) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("File - " + file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Post - " + dir);
        return FileVisitResult.CONTINUE;
    }

    public static void main(String[] args) throws IOException {
        PrintDirs dirs = new PrintDirs();
        Files.walkFileTree(Paths.get("C:", "Intel"), dirs);
    }
}


