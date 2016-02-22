package OCP.Chapter_7.Suppressed_Exceptions;

/**
 * Created by MaxiM on 13.02.2016.
 */
public class Test_suppressed {

    public static void main(String[] args) {
        try(Resource_A a = new Resource_A("one"); Resource_B b = new Resource_B("two")) {
            System.out.println("Try is started");
            //throw new RuntimeException("In runtime");
        } catch (Exception e) {
            System.out.println("!!! - " + e.getMessage());
            for (Throwable t : e.getSuppressed()) {
                System.out.println("Suppressed - " + t);
            }
            throw new RuntimeException("Runtime in the catch block");
        } finally {
            System.out.println("In Finally");
        }
    }
}
