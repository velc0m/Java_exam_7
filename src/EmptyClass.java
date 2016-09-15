import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Litvv on 29.08.2016.
 */
public class EmptyClass {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);

        Iterator iterator = list.iterator();


        while (iterator.hasNext()) {
            int c = (int) iterator.next();

            if (c == 6) {
                iterator.remove();
            }

        }

        System.out.println(list);

        Object
    }
}
