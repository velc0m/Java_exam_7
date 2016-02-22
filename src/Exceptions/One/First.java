package Exceptions.One;

/**
 * Created by MaxiM on 20.12.2015.
 */
public class First {

    public static void main(String[] args) {
        First first = new First();
        try {
            first.myMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }




    }

    void myMethod() throws Exception {
        yourMethod();
    }

    void yourMethod() throws Exception {
        throw new Exception();
    }

}
