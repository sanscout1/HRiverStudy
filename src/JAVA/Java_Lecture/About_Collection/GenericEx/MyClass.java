package JAVA.Java_Lecture.About_Collection.GenericEx;
// 모든 타입의 배열을 처리 할 수 있는 제너릭 메서드 printArray()

///문제2) 'MyClass'에 모든 타입의 배열을 매개변수로 받아 배열의 요소를 출력하는 printArray 제너릭 메서드를 작성하세요
public class MyClass  {
    public static <T> void printArray(T[] array){
        for (T t : array) {
            System.out.println(t);
        }
    }
}
