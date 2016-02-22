import sun.security.provider.SHA;

/**
 * Created by MaxiM on 20.12.2015.
 */
public final class Evaluate{

    public static void main(String[] args) {

        MEnum one = MEnum.FIVE;

        byte b = -128;
        short s = 200;
        int i = 500;
        long l = 1000;
        float f = 10.5f;
        double d = 20.5;
        char c  = 'a';
        char cc = 100;

        System.out.println("-----------------");

        System.out.println(MEnum.THREE);
        System.out.println(one.getSize());
        System.out.println(MEnum.values());
        System.out.println(MEnum.SIX.getStr());


    }

}
