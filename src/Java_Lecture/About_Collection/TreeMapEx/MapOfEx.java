package Java_Lecture.About_Collection.TreeMapEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapOfEx {
    public static void main(String[] args) {
        Map<Integer,String> map = Map.of(1,"first",2,"second");
        map.forEach((k,v) -> System.out.println(k + " - "+v));

        //map.put(3,"three");  불변 구조라 추가할려면 list로 해야함

        List<String> list1 = new ArrayList<>();
        list1.add("first");
        list1.add("second");
        list1.add("third");
        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        Map<Integer, List<String>> map2 = Map.of(1,list1,2,list2);
        System.out.println(map2);
        list1.add("five");
        System.out.println(map2);
        map2.forEach((k,v) -> System.out.println(k+ " - "+v));





    }
}
