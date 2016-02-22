package Chapter_2.Polymorphism_p_96.OverrideException;

/**
 * Created by MaxiM on 14.11.2015.
 */
public class Animal {
    public void eat() throws Exception {
        System.out.println("Animal eat");
    }

    protected void forOverloaded(int a) {
        int b = a;
    }
}
