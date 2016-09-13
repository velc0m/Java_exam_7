package OCP.Chapter_9.nio;

import java.nio.file.*;

public class MyPathMatcher {

    public static void main(String[] args) {
        Path dirA = Paths.get("E:/Dir_A");
        Path dirB = Paths.get("E:/Dir_A", "Dir_B/B.txt");
        Path dirC = Paths.get("E:/Dir_A", "Dir_B/Dir_C");
        Path dirD = Paths.get("E:/Dir_A", "Dir_B/Dir_C", "Dir_D");

        goMatch(dirA, "*.txt");
        goMatch(dirB, "**/*.txt");
        goMatch(dirB, "**/*.???");
        goMatch(dirD, "**");
    }

    static void goMatch(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:" + glob);
        boolean res = matcher.matches(path);
        System.out.println(res);
    }
}
