package OCP.Chapter_8.Pattern.Parsing;

import java.util.Scanner;

/**
 * Created by Litvv on 14.04.2016.
 */
public class ScanIn {

    public static void main(String[] args) {

        //Need to input - init String = "1 a12 234b";
        String pattern = "\\d+";

        System.out.print("Input: ");
        System.out.flush();

        Scanner scanner = new Scanner(System.in);
        String token;

        do {
            token = scanner.findInLine(pattern);
            System.out.println("Found " + token);
        } while (token != null);


    }
}
