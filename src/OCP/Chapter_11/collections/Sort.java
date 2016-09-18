package OCP.Chapter_11.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Litvv on 18.09.2016.
 */
public class Sort {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        Car c1 = new Car();
        c1.setModel("BMW");
        c1.setPrice(1000);

        Car c2 = new Car();
        c2.setModel("Lada");
        c2.setPrice(222);

        Car c3 = new Car();
        c3.setModel("Porshe");
        c3.setPrice(33555);

        cars.add(c1);
        cars.add(c2);
        cars.add(c3);

        System.out.println("Before sorting - " + cars);

        Collections.sort(cars);

        System.out.println("Sorting with Comparable - " + cars);

        Collections.reverse(cars);
        System.out.println("Reverse - " + cars);

        Collections.sort(cars, new SortCars());

        System.out.println("Sorting with Comparator - " + cars);

        System.out.println("Binary search - " + Collections.binarySearch(cars, c3, new SortCars()));

        System.out.println(cars.indexOf(c3));
    }
}
