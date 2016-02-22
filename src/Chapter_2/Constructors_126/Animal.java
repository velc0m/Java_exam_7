package Chapter_2.Constructors_126;

/**
 * Created by MaxiM on 22.11.2015.
 */
public class Animal {

    static String strVar = "Init val";
    static {
        strVar += " + SB Animal";
        System.out.println("SB - Animal");
        System.out.println("strVar = " + strVar);
    }

    {
        System.out.println("IB - Animal");
    }

    public Animal() {
        strVar += " + Animal constr";
        System.out.println("Constructors - Animal");
        System.out.println("strVar = " + strVar);
    }
}
