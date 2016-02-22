package Chapter_6.Exception;

/**
 * Created by MaxiM on 19.12.2015.
 */
public class MyExceptionSubClass extends MyExceptionTop {

    @Override
    public void getMessagegFromMe() {
        System.out.println("It is from MyExceptionSubClass");
    }
}
