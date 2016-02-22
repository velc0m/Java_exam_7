package Chapter_6.Exception;

/**
 * Created by MaxiM on 14.12.2015.
 */
public class BadFoodException extends Exception {

    void getMess() {
        System.out.println("From my Exception");
    }

}
