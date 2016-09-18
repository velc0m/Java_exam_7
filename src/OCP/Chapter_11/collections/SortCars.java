package OCP.Chapter_11.collections;

import java.util.Comparator;

/**
 * Created by Litvv on 18.09.2016.
 */
public class SortCars implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getModel().compareTo(o2.getModel());
    }
}
