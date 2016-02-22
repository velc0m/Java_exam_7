package Chapter_6.Exception;

/**
 * Created by MaxiM on 14.12.2015.
 */
public class MyExceptionTest {

    public static void main(String[] args) throws MyExceptionTop {

        try {
            checkFood("apple");
            checkFood("dddd");
            checkFood("carrot");
        } catch (BadFoodException e) {
            e.getMess();
            //e.printStackTrace();
        }
        System.out.println("It is the End!");

        System.out.println("-----------------");

        try {
            tryThrowMyException();
        } catch (MyExceptionTop my) {
            my.getMessagegFromMe();
            System.out.println("From catch ");
        } finally {
            throw new MyExceptionTop();
        }
    }

    static void tryThrowMyException() throws MyExceptionSubClass {
        throw new MyExceptionSubClass();
    }


    static void checkFood(String food) throws BadFoodException {

        switch (food) {
            case "apple":
                System.out.println(food + " - OK!");
                break;
            case "carrot":
                throw new BadFoodException();
            default:
                System.out.println("Good idea!!!");
                String a = "asd";
                Integer in = new Integer(3);
                in = Integer.parseInt("444");
        }
    }
}
