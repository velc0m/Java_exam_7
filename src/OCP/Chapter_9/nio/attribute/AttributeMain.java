package OCP.Chapter_9.nio.attribute;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class AttributeMain {

    public static void main(String[] args) throws IOException {

        Calendar calendar = Calendar.getInstance();
        calendar.set(2013, Calendar.JANUARY, 1);

        Date januaryFirst = calendar.getTime();

        //old way
        File dir = new File("C:/tempDel");
        dir.mkdir();
        File fileOld = new File("C:/tempDel/file.txt");
        fileOld.createNewFile();

        System.out.println("Date modified - " + fileOld.lastModified());
        fileOld.setLastModified(januaryFirst.getTime());
        System.out.println("New date modified - " + fileOld.lastModified());
        fileOld.delete();
        dir.delete();

        //New way
        Path dirNew = Paths.get("C:", "tempDel");
        Files.createDirectory(dirNew);
        Path fileNew = Paths.get("C:", "tempDel", "file.txt");
        Files.createFile(fileNew);
        FileTime fileTime = FileTime.fromMillis(januaryFirst.getTime());
        System.out.println("Date modified - " + Files.getLastModifiedTime(fileNew));
        Files.setLastModifiedTime(fileNew, fileTime);
        System.out.println("New date modified - " + Files.getLastModifiedTime(fileNew));

        System.out.println("Is executable - " + Files.isExecutable(fileNew));
        System.out.println("Is readable - " + Files.isReadable(fileNew));
        System.out.println("Is writable - " + Files.isWritable(fileNew));

        //BasicFileAttributes vs BasicFileAttributeView

        System.out.println("-----Basic File Attributes----");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(fileNew, BasicFileAttributes.class);
        System.out.println("create: " + basicFileAttributes.creationTime());
        System.out.println("access: " + basicFileAttributes.lastAccessTime());
        System.out.println("modify: " + basicFileAttributes.lastModifiedTime());
        System.out.println("directory: " + basicFileAttributes.isDirectory());

        System.out.println("-----Basic File Attribute View----");
        FileTime lastUpdate = basicFileAttributes.lastModifiedTime();
        FileTime created = basicFileAttributes.creationTime();
        FileTime now = FileTime.fromMillis(System.currentTimeMillis());
        BasicFileAttributeView view = Files.getFileAttributeView(fileNew, BasicFileAttributeView.class);
        view.setTimes(lastUpdate, now, created);

        System.out.println("-----Dos File Attributes----");
        Files.setAttribute(fileNew, "dos:hidden", true);
        Files.setAttribute(fileNew, "dos:readonly", true);
        DosFileAttributes dosFileAttributes = Files.readAttributes(fileNew, DosFileAttributes.class);
        System.out.println("Doc hidden - " + dosFileAttributes.isHidden());
        System.out.println("Doc readonly - " + dosFileAttributes.isReadOnly());
        Files.setAttribute(fileNew, "dos:readonly", false);

        /*System.out.println("-----Posix File Attributes----");
        PosixFileAttributes posixFileAttributes = Files.readAttributes(fileNew, PosixFileAttributes.class);
        Set<PosixFilePermission> perm = PosixFilePermissions.fromString("rw-r--r--");
        Files.setPosixFilePermissions(fileNew, perm);
        System.out.println("Permissions - " + posixFileAttributes.permissions());
        System.out.println("Group - " + posixFileAttributes.group());*/

        Files.deleteIfExists(fileNew);
        Files.deleteIfExists(dirNew);

        System.out.println("-----Directory Stream----");
        Path dirStream = Paths.get("c:", "Intel");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dirStream)) {
            for (Path path : stream) {
                System.out.println(path);
            }
        }
        System.out.println();
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dirStream, "[gL]*")) {
            for (Path path : stream) {
                System.out.println(path);
            }
        }
    }
}
