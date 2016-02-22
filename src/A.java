/**
 * Created by MaxiM on 14.01.2016.
 */
public class A {

    String string;

    int number;

    public A(String string, int number) {
        this.string = string;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        A a = (A) o;

        if (number != a.number) return false;
        if (string != null ? !string.equals(a.string) : a.string != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = string != null ? string.hashCode() : 0;
        result = 31 * result + number;
        return result;
    }
}
