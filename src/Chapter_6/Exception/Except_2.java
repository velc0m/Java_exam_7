package Chapter_6.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by MaxiM on 13.12.2015.
 */
public class Except_2 {

    public static void main(String[] args) {
        myFunction();
        try {
            start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void myFunction() {
        try {
            RandomAccessFile rm = new RandomAccessFile("my.txt", "r");
            byte[] b = new byte[1000];
            rm.readFully(b, 0, 1000);
        } catch (FileNotFoundException e) {
            System.out.println("File not FOUND!!!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO EXCEPTION");
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

    static void start() throws IOException {
        myFunction_2();
    }

    static void myFunction_2() throws IOException {
        RandomAccessFile rm2 = new RandomAccessFile("my.txt", "r");
        byte[] b2 = new byte[1000];
        rm2.readFully(b2, 0, 1000);
    }
}
