package Chapter_2.Casting_113;

import java.io.EOFException;
import java.io.IOException;

/**
 * Created by MaxiM on 15.11.2015.
 */
class Dog extends Animal implements Pet {

    @Override
    void makeNoise() {
        System.out.println("Bark!!!");
    }

    void playDead() {
        System.out.println("roll over");
    }

    @Override
    public void beFrendly() {
        System.out.println("I am Friendly");
    }
}
