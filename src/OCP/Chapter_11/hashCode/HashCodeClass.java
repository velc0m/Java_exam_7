package OCP.Chapter_11.hashCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Litvv on 16.09.2016.
 */
public class HashCodeClass {

    public static void main(String[] args) {
        HashCodeClass hashCodeClass = new HashCodeClass();

        Car car1 = hashCodeClass.new Car();
        Car car2 = hashCodeClass.new Car();
        Car car3 = car1;

        car1.model = "BMW";
        car1.price = 55_000;

        car2.model = "Opel";
        car2.price = 22_000;

        System.out.println("-----to String-----");
        System.out.println("Car1 = " + car1);
        System.out.println("Car2 = " + car2);
        System.out.println("Car3 = " + car3);

        System.out.println("-----Equils-----");
        System.out.println("Car1 equals Car2 = " + car1.equals(car2));
        System.out.println("Car3 equals Car1 = " + car3.equals(car1));

        System.out.println("-----HashCode-----");

        System.out.println("Hash Car 1 = " + car1.hashCode());
        System.out.println("Hash Car 2 = " + car2.hashCode());

        System.out.println("-----MAP and hashCode-----");

        Map<Car, Person> minskMap = new HashMap<>();

        Person person = hashCodeClass.new Person();
        person.name = "Vitali";
        person.age = 37;

        minskMap.put(car1, person);

        Car car11 = hashCodeClass.new Car();
        car11.model = "BMW";
        car11.price = 55_000;

        System.out.println("Map with original object - " + minskMap.get(car1));
        System.out.println("Equal original and new original = " + car1.equals(car11));
        System.out.println("HashCode of the new origin object Car 11 = " + car11.hashCode());
        System.out.println("Map with new equal original object - " + minskMap.get(car11));

    }

    private class Car {
        String model;
        int price;

        @Override
        public String toString() {
            return "Car " + model + " , price = " + price;
        }

        /*@Override
        public boolean equals(Object obj) {
            if ((obj instanceof Car) && ((Car) obj).model == this.model && ((Car) obj).price == this.price) {
                return true;
            }
            return false;
        }*/

        /*@Override
        public int hashCode() {
            return model.length();
        }*/
    }

    private class Person {
        String name;
        int age;

        @Override
        public String toString() {
            return "Person " + name;
        }
    }
}
