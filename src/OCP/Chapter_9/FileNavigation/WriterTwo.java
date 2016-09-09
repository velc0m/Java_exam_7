package OCP.Chapter_9.FileNavigation;

import java.io.*;

/**
 * Created by LitVV on 09.09.2016.
 */
public class WriterTwo {

    public static void main(String[] args) {
        char[] in = new char[50];
        int size = 0;
        try {
            File file = new File("FileWriter2.txt");
            FileWriter fw = new FileWriter(file);
            fw.write("howdy \nfolks\n");
            fw.flush();
            fw.close();

            FileReader fr = new FileReader(file);
            size = fr.read(in);

            System.out.println("Size = " + size);

            for (char c : in) {
                System.out.print(c);
            }
            fr.close();

        } catch (IOException e) {
        }

        try {
            File myDir = new File("MyDir");
            myDir.mkdir();
            File myFile = new File(myDir, "myFile_2.txt");
            myFile.createNewFile();

            PrintWriter writer = new PrintWriter(myFile);
            writer.println("Hello Vitali");
            writer.println("I am Android!!!");
            writer.flush();
            writer.close();

            FileReader reader = new FileReader(myFile);
            size = reader.read(in);

            for (char c : in) {
                System.out.print(c);
            }
            System.out.println("Size = " + size);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
