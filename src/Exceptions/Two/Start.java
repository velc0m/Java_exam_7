package Exceptions.Two;

/**
 * Created by MaxiM on 12.01.2016.
 */
class Start {

    public static void main(String[] args) {

        try {
            System.out.println("Try in MAIN");
            method_1();
        } catch (MyExceptionSubClass myExceptionSubClass) {
            System.out.println("Catch Main");
            //myExceptionSubClass.printStackTrace();
        }
        System.out.println("END");

    }

    static void method_1() throws MyExceptionSubClass {
        System.out.println("Method 1");
        method_2();
    }

    static void method_2() throws MyExceptionSubClass {
        try {
            System.out.println("Try Method 2");
            throw new MyExceptionSubClass();
        }  catch (MyExceptionSubClass myExceptionSubClass) {
            //myExceptionSubClass.printStackTrace();
            System.out.println("Catch method 2");
            throw myExceptionSubClass;
        } finally {
            System.out.println("Finlly method 2");
        }

    }


}
