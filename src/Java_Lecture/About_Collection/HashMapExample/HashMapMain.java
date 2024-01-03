package Java_Lecture.About_Collection.HashMapExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapMain {
    public static void main(String[] args) {
        Map<String,Integer> map1 = new HashMap<>();
        Map map2 = new HashMap<>(); // 모든 타입의 객체 키 와 값을 저장, 거의 없다.



        Map<String,Integer> scores = new HashMap<>();

        // 이름을 key, 점수를 value 저장하는 map

        scores.put("김지영", 60);
        scores.put("김하나", 90);
        scores.put("이지은", 80);
        scores.put("김진석", 80);
        scores.put("이수연", 100);
        scores.put("이수연", 100);

        System.out.println("총 엔트리: "+ scores.size());
        System.out.println();
        String key= "이수연";
        Integer value = scores.get(key);
        System.out.println(key + "학생의 점수는 "+ value);


        //키 set 컬렉션을 얻어와, 반복자를 통해 키와 값을 출력하기

        Set<String> keySet = scores.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()){
            String k = keyIterator.next();
            Integer v = scores.get(k);
            System.out.println(k+" : "+ v);
        }

        //엔트리 set컬렉션을 얻어, 반복하여 키와 값을 출력하기

        //Map -> entrySet, keyset
        // Map --> entry   ,,,,,,, entry는 set에서 활용가능
        //entry -> getkey, getvalue
        // key 와 value 도 set 에서 활용 가능
        Set<Map.Entry<String,Integer>> entrySet = scores.entrySet();
        Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String,Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v =entry.getValue();
            System.out.println(k + " :  "+ v);
        }

        System.out.println(scores.size());
        scores.remove("김진석");
        System.out.println(scores.size());
        scores.clear();
        System.out.println(scores.size());
    }
}
