package OCP.Chapter_13.FredLucyRicky;

/**
 * Created by LitVV on 14.09.2016.
 */
public class ManyNames {

    public static void main(String[] args) {
        NameRunnable nr = new NameRunnable();
        Thread one = new Thread(nr);
        Thread two = new Thread(nr);
        Thread three = new Thread(nr);

        one.setName("Fred");
        two.setName("Lucy");
        three.setName("Ricky");

        //one.setPriority(10);

        one.start();
        two.start();
        three.start();


    }
}
