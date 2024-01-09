package Java_Lecture.About_Lamda;

import Java_Lecture.About_Lamda.product.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//생성자 참조는 객체를 인스턴스화하지 않고도 생성자를 참조할 수 있는 방법 제공
public class LamdaConstructorEx {
    public static void main(String[] args) {
        // 1. 인수가 없는 생성자 참조  (supplier 함수형 인터페이스는 인수가 없는 객체의 공급자를 나타낸다.)
        // 참조된 생성자를 사용하여 새 객체를 생성하는 방법 제공한다.
        //Supplier<ClassName> constructorRef = ClassName::new;


        // 2. 인수가 있는 생성자 참조 (인수를 받는 생성자를 나타낸다.)
        // Function<Integer, ClassName> constructorRef = ClassName::new;

        // 3. 배열 생성자에 대한 참조
        // Function<Integer, ClassName[]> constructorRef = ClassName[]::new;

        // 4. 제너릭 클래스의 생성자 참조
        // Supplier<GenericClass<Integer>> constructorRef = GenericClass<Integer>::new;


        //Calculator calculate = Calculator::new;

        //미리 정의된 값으로 컬렉션을 초기화
        List<Integer> numbers = Stream.of(1,2,3,4,5)
                .collect(Collectors.toCollection(ArrayList::new));

        BiFunction<String, Integer, Person> perosnFunction =Person::new;
        Person john = perosnFunction.apply("john",20);


        // 1. 인수가 없는 String생성자를 사용하여 새 String 객체를 생성하는 람다식 작성
        Supplier<String> newString = String::new;
        String emptyString = newString.get();  //get 메서드를 통해 인수가 없는 String 생성자 호출 , 새로운 비어있는 String 객체 반환
        System.out.println(emptyString);

        // 2. 인수가 없는 ArrayList 생성자를 사용하여 새로운 ArrayList 객체를 생성하는 람다식 작성
        Supplier<ArrayList<String>> newArrayListSupplier = ArrayList::new;
        ArrayList<String> emptyArrayList = newArrayListSupplier.get();


        // 3. 인수가 없는 Random 생성자를 사용하여 새 Random객체를 생성하는 람다식 작성
        Supplier<Random> newRandomSupplier = Random::new;
        Random random = newRandomSupplier.get();
        int randomNumber = random.nextInt(100);
        System.out.println(randomNumber);

        /*
        IntSupplier intSupplier = () -> {
            int num = (int) (Math.random() * 6) + 1;
            return num;
        };

        int num = intSupplier.getAsInt();
        System.out.println("눈의 수: " + num);
        }
*/

    }
}
