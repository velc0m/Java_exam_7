package OCP.Chapter_11.collections;

import java.util.*;

/**
 * Created by Litvv on 18.09.2016.
 */
public class BackedCollection {

    public static void main(String[] args) {

        System.out.println("-----TreeSet-----");
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1205);
        treeSet.add(1505);
        treeSet.add(1545);
        treeSet.add(1830);
        treeSet.add(2010);
        treeSet.add(2100);
        treeSet.add(1408);

        System.out.println(treeSet);
        System.out.println("lower 1505 - " + treeSet.lower(1505));
        System.out.println("floor 1505 - " + treeSet.floor(1505));
        System.out.println("higher 1830 - " + treeSet.higher(1830));
        System.out.println("ceiling 1830 - " + treeSet.ceiling(1830));

        System.out.println("Poll first - " + treeSet.pollFirst());
        System.out.println("Poll last - " + treeSet.pollLast());
        System.out.println(treeSet);

        System.out.println("Reverse - " + treeSet.descendingSet());
        System.out.println(treeSet.pollFirst());

        System.out.println("-----Backed collection (Sorted)-----");

        TreeMap<String, String> treeMap = new TreeMap<>();

        treeMap.put("a", "ant");
        treeMap.put("d", "dog");
        treeMap.put("h", "horse");

        SortedMap<String, String> subMap = treeMap.subMap("b", "g");

        System.out.println(treeMap + " " + subMap);

        treeMap.put("b", "bat");
        subMap.put("f", "fish");

        treeMap.put("r", "raccon");
        //subMap.put("p", "pig");

        System.out.println(treeMap + " " + subMap);

        System.out.println("-----Backed collection (Navigable)-----");

        NavigableSet<String> stringSet = new TreeSet<>();
        stringSet.add("one");
        stringSet.add("two");
        stringSet.add("three");
        stringSet.add("four");
        stringSet.add("five");
        stringSet.add("six");

        System.out.println(stringSet);

        SortedSet<String> navigableSet = stringSet.headSet("six");

        System.out.println(navigableSet);

        SortedSet<String> navigableSet1 = stringSet.tailSet("six");

        System.out.println(navigableSet1);

        System.out.println("-----Priority Queue");

        Integer[] integers = {4, 1, 6, 11, 3};

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (Integer integer : integers) {
            pq.offer(integer);
        }

        System.out.println(pq);
        System.out.println("size = " + pq.size());
        System.out.println("peek = " + pq.peek());
        System.out.println("peek = " + pq.peek());
        System.out.println("poll = " + pq.poll());
        System.out.println("poll = " + pq.poll());
        System.out.println("size = " + pq.size());
        for (Integer integer : integers) {
            System.out.println(pq.poll());
        }

    }
}
