package Chapter_2.Constructors_126;

/**
 * Created by MaxiM on 22.11.2015.
 */
public class Dog extends Animal {

    static {
        strVar += " + SB Dog";
        System.out.println("SB - Dog");
        System.out.println("strVar = " + strVar);
    }

    {
        System.out.println("IB - Dog");
    }

    public Dog() {
        strVar += " + Dog constr";
        System.out.println("Constructors - Dog");
        System.out.println("strVar = " + strVar);
    }
}
