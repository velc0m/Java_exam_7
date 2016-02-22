/**
 * Created by MaxiM on 20.12.2015.
 */
public class ModificationsOfArgumments {

    void probe(int... x) {
        System.out.println("In ...");
    }
    /*void probe(int x) {
        System.out.println("In int");
    }*/

    void probe(Integer x) {
        System.out.println("In INTEGER");
    }

    void probe(long x) {
        System.out.println("In long");
    }

    void probe(Long x) {
        System.out.println("In LONG");
    }

    public static void main(String[] args) {
        Integer i = 4;
        new ModificationsOfArgumments().probe(i);
        //int a = 4;
        //char a = 666;
        short a = 333;
        new ModificationsOfArgumments().probe(a);
    }
}
