package Chapter_2.Casting_113.Cast;

/**
 * Created by LitVV on 16.12.2015.
 */
public class Main {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();
        A ab = new B();

        System.out.println("A a = " + a.a);
        System.out.println("A as = " + a.as);

        System.out.println("B b = " + b.b);
        System.out.println("B as = " + b.as);




        System.out.println("A a from B = " + ((B)ab).b);
        System.out.println("A as from B = " + ((B)ab).as);

        long l1 = 100000000;
        long l2 = 20000000;


    }
}
