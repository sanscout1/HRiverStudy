package JAVA.Java_Lecture.About_Collection.GenericEx;

//문제3) 모든 타입의 두 객체를 매개변수로 받고 비교를 나타내는 정수 값을 반환하는 "compare" 단일 메서드를 사용하여
//        Comparator 라는 제너릭 인터페이스를 만드세요 .
public interface Comparator <o>{
    public int compare(o o1, o o2);
    //같은 객체를 받아서 비교 할 것이기 때문에 타입을 하나만 받는다.
}
