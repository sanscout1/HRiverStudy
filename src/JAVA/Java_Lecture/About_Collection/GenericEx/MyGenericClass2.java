package JAVA.Java_Lecture.About_Collection.GenericEx;
// 배열과 두 개의 인덱스를 받아 주어진 인덱스에서 요소를 교환하는 static void swap 제너릭메서드를 구현하세요
// swap 메서드는 모든 타입의 배열을 처리할 수 있어야 한다.
public class MyGenericClass2 {
    public static <T> void swap(T[] t, int i, int j){
        if(t[i]!=null && t[j]!=null){
            T temp = t[i];
            t[i] = t[j];
            t[j] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println("Before");
        Integer[] intArray = {1,2,3,4,5};
        for (Integer i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("After");
        swap(intArray,1,3);
        for (Integer i : intArray) {
            System.out.print(i + " ");
        }
    }
}
