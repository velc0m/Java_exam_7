package OCP.Chapter_7.Suppressed_Exceptions;

import java.io.IOException;

/**
 * Created by MaxiM on 13.02.2016.
 */
public class Resource_B implements AutoCloseable {

    private String name;

    public Resource_B(String name) {
        this.name = name;
        System.out.println("B is created");

    }

    @Override
    public void close() throws IOException {
        System.out.println("Resource - " + name + " is closed");
        throw new IOException("In IOException from B");
    }
}
