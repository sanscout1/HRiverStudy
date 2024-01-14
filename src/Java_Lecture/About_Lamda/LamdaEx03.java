package Java_Lecture.About_Lamda;



import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

interface Product{
    int calculate(List<Integer> products);
}

public class LamdaEx03 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        numbers.forEach(System.out::println);

        //reduce()  스트림의 원소들을 하나씩 소모해가며, 누적 계산을 수행하고 결과값을 리턴하는 메서드다.
        // T identity: 계산에 적용할 초깃값으로, 스트림이 비어 있더라도 초깃값을 반환
        Product product = products -> products.stream().reduce(1,(a,b) -> a * b);
        List<Integer> list = List.of(2,3,4);
        System.out.println(product.calculate(list));





//        // 리스트를 알파벳 순서로 정렬을 쉽게 줄이는 방법,, 아래 두가지는 동일하다.
//        // 새로운 sort를 저렇게 줄여섷 해보자
//        List<String> names =Arrays.asList("John", "Jane","Adam", "Eve");
//        Collections.sort(names, new Comparator<String>() {
//            public int compare(String a, String b) {
//                return a.compareTo(b);
//            }
//        });
//
//        Collections.sort(names,(a,b) -> a.compareTo(b));
//        Collections.sort(names,String::compareTo);
        // sort 함수는 리스트와 , 비교 어떻게할지 넣어서 정렬 가능





        // 문자열 리스트를 대문자로 변환하는 람다식을 작성
        List<String> names =Arrays.asList("John", "Jane","Adam", "Eve");  //애는 사이즈만 고정,, 값은 바꿀 수 있음 listof 는 값도 고정
        List<String> upperCaseNames = names.stream()
                // map은 Stream의 요소들을 내가 사용할 형태로 바꾸거나, 사용할 요소를 뽑아내는 것
                .map(String::toUpperCase)  //name -> name.toUpperCase()
                .toList();   // .collect(Collectors.toList());
        // 잘생각해보면 mapToInt 같은거는 우리가 합쳐버려서 다시 수집할 이유가 없었다.
        // 하지만 애는 다시 배열로 만들어야하니 수집해야하니 toList 해야하는게 맞네
        System.out.println();


        // 매개변수와 반환값이 없는 람다식
        //ex 1
//        (x,y) -> {
//                return  x*y;
//        }
        // ex 2
//        (name,age) -> {
//            System.out.println(name);
//            System.out.println(age);
//        }



    }
     }


