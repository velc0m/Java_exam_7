/**
 * Created by MaxiM on 12.01.2016.
 */
public enum MEnum {

    ONE(1),
    TWO(2),
    THREE(3),
    FIVE(5),
    SIX("HELLO");

    private int size;
    private String str;

    public int getSize() {
        return size;
    }

    public String getStr() {
        return str;
    }

    MEnum(int size) {
        this.size = size;
    }

    MEnum(String str) {
        this.str = str;
    }



}
