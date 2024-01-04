package Java_Lecture.About_Collection.TreeSetEx;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(75);
        scores.add(80);
        scores.add(87);
        scores.add(70);
        scores.add(65);
        scores.add(62);
        scores.add(90);
        scores.add(95);

        System.out.println("---------------------------------------");
        for (Integer score : scores) {
            System.out.println(score);
        }

        System.out.println("---------------------------------------");
        System.out.println(scores.floor(87));
        System.out.println(scores.last());
        System.out.println(scores.first());

        System.out.println("---------------------------------------");
        System.out.println(scores.lower(90));
        System.out.println(scores.higher(90));
        System.out.println("---------------------------------------");
        System.out.println(scores.floor(90));
        System.out.println(scores.ceiling(90));

        System.out.println("---------------------------------------");
        Iterator<Integer> iterator=scores.descendingIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        System.out.println("---------------------------------------");
        NavigableSet<Integer> rangeSet=scores.headSet(80,true);
        for (Integer i : rangeSet) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println(scores.subSet(80,true,90,false));
    }
}
