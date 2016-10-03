package OCP.Chapter_11.collections;

/**
 * Created by Litvv on 18.09.2016.
 */
public class Car implements Comparable<Car> {

    private String model;
    private int price;

    @Override
    public int compareTo(Car o) {
        return (this.price < o.price) ? -1 : (this.price == o.price) ? 0 : 1;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        return model.length();
    }
}
