package Chapter_6.Loop;

/**
 * Created by MaxiM on 13.12.2015.
 */
public class Loop {

    public static void main(String[] args) {


        doStuff();
        System.out.println("After ");

        doLoop();

    }

    static void doStuff() {
        for (int x = 0; x < 3; x++) {
            System.out.println("in for loop");
            break;
            //return;
        }
        System.out.println("ssssss");
    }

    static void doLoop() {
        int i = 1;

        for (int k = 0; (i < 6 && k == 0); ) {
            i++;
        }
        System.out.println("i = " + i);

    }

}
