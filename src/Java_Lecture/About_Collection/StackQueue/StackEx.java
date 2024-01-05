package Java_Lecture.About_Collection.StackQueue;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> stack_int = new Stack<Integer>(); // Integer 형 스택 선언
        stack_int.push(1);     // Stack 에 1 추가
        stack_int.push(2);     // Stack 에 2 추가
        stack_int.push(3);     // Stack 에 3 추가 (출력에 나온 부분은 push() 성공시, 해당 아이템을 리턴해주기 때문임)
        stack_int.pop();       // Stack 에서 데이터 추출 (마지막에 넣은 3이 출력)
    }
}
