package Chapter_2.Constructors_126;

/**
 * Created by MaxiM on 22.11.2015.
 */
public class BulDog extends Dog {

    static {
        System.out.println("SB - BulDog");
    }

    {
        System.out.println("IB - BulDog");
    }

    public BulDog() {
        System.out.println("Constructors - BulDog");
    }

    public static void main(String[] args) {
        System.out.println("pre new BulDog---------------");
        new BulDog();
        System.out.println("END-------------------");
    }

}
