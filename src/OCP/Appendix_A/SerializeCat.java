package OCP.Appendix_A;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by LitVV on 12.09.2016.
 */
public class SerializeCat {

    public static void main(String[] args) {
        Cat cat = new Cat();
        try {
            FileOutputStream fs = new FileOutputStream("TestSer.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(cat);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("TestSer.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            cat = (Cat) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
