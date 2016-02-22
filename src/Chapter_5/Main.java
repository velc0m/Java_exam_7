package Chapter_5;

/**
 * Created by Litvv on 09.12.2015.
 */
public class Main {

    public static void main(String[] args) {

        Car[] cars = {new Car(), new Honda(), new Car()};

        for (Car car : cars) {
            car.goCar();
            if (car instanceof Honda) {
                ((Honda) car).stopHonda();
            }
        }
    }
}
