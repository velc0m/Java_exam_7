package Chapter_2.Polymorphism_p_96.Override;

import java.io.EOFException;
import java.io.IOException;

/**
 * Created by MaxiM on 14.11.2015.
 */
public class Main {

    public static void main(String[] args) {

        Vehicle mazda = new Mazda();
        Car mazda_2 = new Mazda();
        Mazda mazda_3 = new Mazda();

        F1 f1 = new Mazda();

        try {
            mazda.getVehicle("Vehicle new Mazda");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            mazda_2.getVehicle("Car new Mazda");
        } catch (EOFException e) {
            e.printStackTrace();
        }

        mazda_2.getCar();
        mazda_2.getF1();

        mazda_3.getVehicle("Mazda new Mazda");
        mazda_3.getCar();
        mazda_3.getF1();
        mazda_3.getMazda();

        f1.getF1();

        System.out.println("-------------");

    }
}
