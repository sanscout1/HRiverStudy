package Java_Lecture.About_Reference_address;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {
        //주소값을 비교 할 때는 동등비교 연산자 ( ==, != )

        int[] array1;
        //int array1[];

        int[] array2;

        int[] array3;

        array1 = new int[] {1,2,3};
        //힙 영역에 저장하기 때문에 new 필요  --> 정수형 배열을 생성하고 초기화 한꺼번에

        array2 = new int[3];  //null 값으로 힙 영역에 저장은 되어있음

        int[] array4 = null;  //이러면 스택영역에만 저장되고 힙 영역에 저장 x

        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;

        array3 = array2;

        System.out.println(array1.toString());  //776ec8df 16진법 주소 출력
        System.out.println(array1.toString()==array2.toString());
        //System.out.println(array1.hashCode()==array2.hashCode());
        System.out.println(System.identityHashCode(array1));  //10진법 주소 출력
        System.out.println(System.identityHashCode(array2));
        //System.out.println(Arrays.hashCode(array1) == Arrays.hashCode(array2)); 애는 이상해 쓰지마
        System.out.println(array1==array2);
        System.out.println(array1.equals(array2)); //
        System.out.println(array2 == array3);
        // 주소값 비교


        System.out.println(Arrays.equals(array1, array2));
        // 값비교



    }
}
