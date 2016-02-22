package Chapter_2.Polymorphism_p_96.Override;

import java.io.EOFException;
import java.io.IOException;

/**
 * Created by MaxiM on 14.11.2015.
 */
public class Car extends Vehicle implements F1 {

    private String name = "Car";

    @Override
    protected void getVehicle(String name) throws EOFException {
        System.out.print("Super getVehicle - ");
        try {
            super.getVehicle(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("getVehicle From Car - " + name);
    }

    @Override
    public void getF1() {
        System.out.println("getF1 From Car");
    }

    void getCar() {
        System.out.println("Car name - " + name);
    }
}
