import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MaxiM on 17.01.2016.
 */
public class GCollection {

    private static List objects = new ArrayList();

    private static boolean cont = true;
    private static final int SIZE = 10*1024*1024;
    private static String input;
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Memory tools");

        while (cont) {
            System.out.println("I have " + objects.size() + " objects in use, about " + objects.size() * 10 + "MB.");
            System.out.println("1. Create some objects");
            System.out.println("2. Delete some objects");
            System.out.println("0. Exit");
            input = in.readLine();

            if ((in != null) && (input.length() >= 1)) {
                if(input.startsWith("0")) cont = false;
                if(input.startsWith("1")) createObject();
                if(input.startsWith("2")) removeObjects();
            }
        }
    }

    private static void createObject() {
        System.out.println("Create objects ...");
        for (int i = 0; i < 3; i++) {
            objects.add(new byte[SIZE]);
        }
    }

    private static void removeObjects() {
        System.out.println("Remove objects ...");
        int start = objects.size() - 1;
        int end = start - 3;
        for (int i = start; ((i >=0) && (i > end)); i--) {
            objects.remove(i);
        }
    }


}
