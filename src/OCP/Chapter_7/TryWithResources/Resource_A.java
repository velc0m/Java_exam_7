package OCP.Chapter_7.TryWithResources;

import java.io.Closeable;

/**
 * Created by MaxiM on 13.02.2016.
 */
public class Resource_A implements AutoCloseable {

    private String name;

    public Resource_A(String name) {
        this.name = name;
    }

    //Without Exceptions
    /*@Override
    public void close() {
        System.out.println("Resource - " + name + " is closed");
    }*/


    //With Exceptions
    @Override
    public void close() throws Exception {
        System.out.println("Resource - " + name + " is closed");
    }
}
