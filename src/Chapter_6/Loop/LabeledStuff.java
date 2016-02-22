package Chapter_6.Loop;

/**
 * Created by MaxiM on 13.12.2015.
 */
public class LabeledStuff {

    public static void main(String[] args) {

        /*int age = 10;
        outer:
        while (age <= 21) {
            age++;
            if (age == 16) {
                System.out.println("Get your drive license");
                continue outer;
            } else {
                System.out.println("Another year - " + age);
            }
        }*/

        boolean isTrue = true;
        int j = 0;
        outer:
        for(int i=0; i<5; i++) {
            while (isTrue && j < 3) {
                System.out.println("Hello");
                //isTrue = false;
                j++;
                break outer;
                //break;
            } // end of inner while loop
            System.out.println("Outer loop."); // Won't print
        } // end of outer for loop
        System.out.println("Good-Bye");
    }

}
