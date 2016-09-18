package OCP.Chapter_11.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Litvv on 18.09.2016.
 */
public class BinarySearch {

    public static void main(String[] args) {

        String[] stringsOne = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        List<String> listTwo = new ArrayList<>();

        listTwo.add("one");
        listTwo.add("two");
        listTwo.add("three");
        listTwo.add("four");

        List<String> listOne = Arrays.asList(stringsOne);

        System.out.println(listOne);

        Arrays.sort(stringsOne);

        listOne = Arrays.asList(stringsOne);

        System.out.println(listOne);

        System.out.println("Element 5 = " + listOne.get(5));
        System.out.println("size = " + listOne.size());

        //Exception!!!
        //listOne.remove(9);

        System.out.println(listOne);

        System.out.println(Arrays.binarySearch(stringsOne, "seven"));

        System.out.println("-----toArray-----");

        System.out.println(listTwo);

        Object[] stringsTwo = listTwo.toArray();

        for (Object o : stringsTwo) {
            System.out.println(o);
        }


    }
}
