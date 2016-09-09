package OCP.Chapter_9.FileNavigation;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;

/**
 * Created by LitVV on 09.09.2016.
 */
public class WriterOne {

    private static Logger logger = Logger.getLogger(WriterOne.class);

    public static void main(String[] args) {

        boolean isFileExict = false;
        File file = new File("myFile.txt");
        System.out.println(isFileExict = file.exists());

        if (!isFileExict) {
            try {
                isFileExict = file.createNewFile();
                System.out.println("File is crested");
            } catch (IOException e) {
                logger.error(e);
            }
        }

        System.out.println(isFileExict);


    }
}
