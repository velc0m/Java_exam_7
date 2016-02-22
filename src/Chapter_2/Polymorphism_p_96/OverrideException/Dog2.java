package Chapter_2.Polymorphism_p_96.OverrideException;

/**
 * Created by MaxiM on 14.11.2015.
 */
public class Dog2 extends Animal {

    public void eat() {
        System.out.println("Overriding eat from Dog2");
    }

    protected String forOverloaded(int a, int c) {
        //int b = a;
        return "";
    }

    protected void forOverloaded(int a) {
        int b = a;
    }

    public static void main(String[] args) {
        Animal a = new Dog2();
        Dog2 d = new Dog2();

        d.eat();
        //a.eat(); //!!!! not compile

    }
}
