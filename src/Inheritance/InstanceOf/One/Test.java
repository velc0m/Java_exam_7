package Inheritance.InstanceOf.One;

/**
 * Created by MaxiM on 20.12.2015.
 */
public class Test {

    public static void main(String[] args) {

        Fly f = new Eagle();
        Eagle e = new Eagle();

        Fly f2 = new Bird();

        Bat b = new Bat();

        if(f instanceof Fly) System.out.println("f is Fly");
        if(e instanceof Bird) System.out.println("e is Bied");

        if(f2 instanceof Eagle) {
            System.out.println("YESSSS");
        } else {
            System.out.println("NO");
        }




        //!!! Так как не по иерархии наследования
        // if(b instanceof Bird) System.out.println("");

    }

}
