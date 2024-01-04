package Java_Lecture.About_Collection.TreeMapEx;

import java.util.*;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<String,Integer> scores = new TreeMap<>();
//        scores.put("1",75);
//        scores.put("2",80);
//        scores.put("3",87);
//        scores.put("4",70);
//        scores.put("5",65);
//        scores.put("6",62);
//        scores.put("7",90);
//        scores.put("8",95);

        scores.put("sam",75);
        scores.put("tom",80);
        scores.put("sara",87);
        scores.put("sin",70);
        scores.put("adward",65);
        scores.put("kim",50);
        scores.put("kate",90);
        scores.put("billy",95);




        System.out.println("---------------------------------------");
//        Set<Map.Entry<String,Integer>> scoreSet = scores.entrySet();
//        Iterator<Map.Entry<String,Integer>> entryIterator = scoreSet.iterator();
//
//        while(entryIterator.hasNext()){
//            System.out.print(entryIterator.next()+" ");
//        }
//        System.out.println();
        System.out.println("---------------------------------------");
//        SortedMap<String,Integer> sortedMap = scores;
        System.out.println(scores.entrySet()+" ");


        System.out.println();
        System.out.println("--------------------------------------------");
        TreeSet<Integer> scoreTree = new TreeSet<>(scores.values());
        System.out.println(scoreTree.last());

        System.out.println("--------------------------------------------");
        System.out.println(scoreTree.first());
        System.out.println("--------------------------------------------");
        System.out.println(scoreTree.lower(90));
        System.out.println("--------------------------------------------");
        System.out.println(scoreTree.higher(90));
        System.out.println("--------------------------------------------");
        System.out.println(scoreTree.floor(90));
        System.out.println("--------------------------------------------");
        System.out.println(scoreTree.ceiling(80));

        System.out.println("--------------------------------------------");
        NavigableMap<String,Integer> scoreDescend=scores.descendingMap();
        for (Map.Entry<String, Integer> entry : scoreDescend.entrySet()) {
            System.out.print(entry+" ");
        }
        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println(scores.subMap("b",true,"k",true));
        System.out.println("--------------------------------------------");


//
//        System.out.println("---------------------------------------");
//        System.out.println(scores.floorEntry("4"));
//        System.out.println(scores.lastEntry());
//        System.out.println(scores.firstEntry());
//
//        System.out.println("---------------------------------------");
//        System.out.println(scores.lowerEntry("3"));
//        System.out.println(scores.higherEntry("6"));
//        System.out.println("---------------------------------------");
//        System.out.println(scores.floorEntry("4"));
//        System.out.println(scores.ceilingEntry("4"));
//
//        System.out.println("---------------------------------------");
//        NavigableMap<String,Integer> score=scores.descendingMap();
//        for (Map.Entry<String, Integer> entry : score.entrySet()) {
//            System.out.println(entry);
//        }
//        System.out.println();
//        System.out.println("---------------------------------------");
//        NavigableMap<String,Integer> rangeSet=scores.headMap("4",true);
//        for (Map.Entry<String, Integer> entry : rangeSet.entrySet()) {
//            System.out.print(entry+" ");
//        }
//        System.out.println();
//        System.out.println("---");
//        System.out.println(scores.headMap("4",true));
//        System.out.println("---------------------------------------");
//        System.out.println(scores.subMap("4",true,"7",false));




    }
}
