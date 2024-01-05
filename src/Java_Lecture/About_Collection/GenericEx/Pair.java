package Java_Lecture.About_Collection.GenericEx;
// collections api 에 있음
import lombok.Getter;
import lombok.ToString;
//문제1) 서로 다른 두 가지 타입의 객체를 타입 매개변수로 취하는 "Pair" 제너릭 클래스를 생성하세요.
//        쌍의 첫번째 와 두번째 객체를 나타내는 타입 T와 U의 개인 인스턴스 변수 두개 있어야 한다.
//        이 인스턴스 변수를 초기화하는 생성자와 인스턴스 변수의 값을 검색하는 getter메서드가 있어야 한다.


//문제 6 모든 타입의 요소 두개를 저장하고 요소를 교환하는 메서드를 구현하세요 문제 1번 "pair" 제너릭 클래스에 추가
@Getter
@ToString
//문제 1 관련 코드
//    public class Pair<T, U> {
//
//    private T t;
//    private U u;
//    public Pair(T t, U u){
//        this.t = t;
//        this.u = u;
//    }


public class Pair<T>  {

    private T t;
    private T u;

    public Pair(T t, T u){
        this.t = t;
        this.u = u;
    }
    public void swap() {
        T tmp = this.u;
        u =  t;
        t =  tmp;
    }

    public static void main(String[] args) {
        Pair<Integer> integerPair = new Pair<Integer>(1,2);
        System.out.println(integerPair.toString());
        integerPair.swap();
        System.out.println(integerPair.toString());
    }

}

