package Static.One;

/**
 * Created by MaxiM on 20.12.2015.
 */
public class SubPower extends SuperPower {
    static {
        System.out.println("In static block of SubPower");
        ID = "CHANGED";
    }

    static void staticMethodSubPower() {
        System.out.println("Static Method SubPower");
    }
}
