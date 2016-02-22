package Chapter_2.Polymorphism_p_96.Override;

/**
 * Created by MaxiM on 14.11.2015.
 */
public class Mazda extends Car {

    private String name = "Mazda";

    @Override
    protected void getVehicle(String name) {
        System.out.println("overridden getVehicle from Mazda - " + name);
    }

    @Override
    public void getF1(){
        System.out.println("Overridden getF1 from Mazda");
    }

    @Override
    void getCar() {
        System.out.println("Overridden getCar From Mazda");
        System.out.println("Super getCar");
        super.getCar();
    }

    void getMazda() {
        System.out.println("getMazda!!!!");
    }
}
