package OCP.Chapter_7.Suppressed_Exceptions;

import java.io.IOException;

/**
 * Created by MaxiM on 13.02.2016.
 */
public class Resource_A implements AutoCloseable {

    private String name;

    public Resource_A(String name) {
        this.name = name;
    }

    @Override
    public void close() throws IOException {
        System.out.println("Resource - " + name + " is closed");
        throw new IOException("In IOException from A");
    }
}
