package OCP.Chapter_9.nio;

import java.nio.file.*;

public class MyPathMatcher {

    public static void main(String[] args) {
        Path path1 = Paths.get("C:", "Intel/Logs", "IntelUSB3.log");
        Path path2 = Paths.get("IntelUSB3.log");
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.log");
        System.out.println(matcher.matches(path1));
        System.out.println(matcher.matches(path2));
    }
}
