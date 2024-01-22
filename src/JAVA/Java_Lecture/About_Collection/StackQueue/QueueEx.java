package JAVA.Java_Lecture.About_Collection.StackQueue;

import java.util.LinkedList;
import java.util.Queue;


public class QueueEx {
    public static void main(String[] args) {
        Queue<Integer> queue_int = new LinkedList<Integer>(); // Integer 형 queue 선언
        Queue<String> queue_str = new LinkedList<String>(); // String 형 queue 선언
        // 데이터 추가는 add(value) 또는 offer(value) 를 사용함
        queue_int.add(1);
        queue_int.offer(2);
// 출력에 true 라고 출력되는 부분은 offer() 메서드가 리턴한 값으로,
// 셀의 맨 마지막에 함수를 넣을 경우, 변수가 변수값이 출력되는 것처럼 함수는 함수 리턴값이 출력되는 것임
        System.out.println(queue_int);
        // poll() 은 큐의 첫 번째 값 반환, 해당 값은 큐에서 삭제
        queue_int.poll();
        queue_int.remove();

    }
}
