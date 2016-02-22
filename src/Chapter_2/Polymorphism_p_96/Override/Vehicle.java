package Chapter_2.Polymorphism_p_96.Override;

import java.io.IOException;

/**
 * Created by MaxiM on 14.11.2015.
 */
public class Vehicle {

    private String name = "Vehicle";

    void getVehicle(String name) throws IOException {
        System.out.println("getVehicle from Vehicle - " + name);
    }
}
