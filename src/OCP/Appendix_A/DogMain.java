package OCP.Appendix_A;

import java.io.*;

/**
 * Created by LitVV on 12.09.2016.
 */
public class DogMain {

    public static void main(String[] args) {

        Dog dog = new Dog(5, "Barbos");
        System.out.println("Before, weight = " + dog.weight);

        try {
            FileOutputStream fos = new FileOutputStream("testDog.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dog);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("testDog.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Dog dog1 = (Dog) ois.readObject();
            ois.close();
            System.out.println("Afer - " + dog1.weight);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
