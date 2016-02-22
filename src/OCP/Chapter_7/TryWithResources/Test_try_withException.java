package OCP.Chapter_7.TryWithResources;

/**
 * Created by MaxiM on 13.02.2016.
 */
public class Test_try_withException {

    public static void main(String[] args) {
        try(Resource_A a = new Resource_A("one"); Resource_B b = new Resource_B("two")) {
            System.out.println("Try is started");
            throw new RuntimeException("In runtime");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("In Finally");
        }
    }
}
