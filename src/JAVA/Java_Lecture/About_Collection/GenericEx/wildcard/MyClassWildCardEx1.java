package JAVA.Java_Lecture.About_Collection.GenericEx.wildcard;

import JAVA.Java_Lecture.About_Collection.ListExample.BoardEx.Board;


import java.util.ArrayList;
import java.util.List;

public class MyClassWildCardEx1  {
    //문제 8
//    public static void printList(List<?> list){
//        list.forEach(System.out::println);
//    }


    //문제 9
    public static <T extends Comparable<T>> void printList(List<?> list){ // 보면 앞에 T가 회색인거 확인가능, 뒤에 list ? 써서 이용 안하기 떄문
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9));
        List<String> stringList = new ArrayList<String>(List.of("a", "b", "c", "d", "e", "f"));
        printList(numberList);
        printList(stringList);

        // board 게시글을 저장한 리스트를 만들어 해당 글 내용을 출력
        Board board = new Board("국어","아 어렵다","이한강");
        Board board1 = new Board("영어","아 어렵다어려워","이한강");

        List<Board> boardList = new ArrayList<Board>();   // board에 tostring 오버라이딩 하면 출력을 내가 원하는대로 할 수 있다.
        boardList.add(board);
        boardList.add(board1);

        printList(boardList);
         // public static <T extends Comparable<T>> void printList(List<T> list)
        // -- 뒤에 인자로 <?> 가 아닌 <T> 로 하면 printList(boardList); 에서 boardList가 comparable 인터페이스 구현이 안되있다고 board 출력이 안나온다.
        //   <T extends Comparable<T>> 이것을 통해 T 타입이 comparatble 이 구현되어있는지 체크하고,
        // printList(List<T> list) 여기서 그 체크된 T list를 구현하는것, 그래서 boardlist는 오류가 발생하는것이다.
        // 하지만  <T extends Comparable<T>> void printList(List<?> list) 이렇게 하면 뒤에 list<?> 는 앞에 뭘 정의하든
        // 신경끄고 받아서 출력하는 것이라, comparable이 implement 하는 T 상관없이 가져오는거라, boardlist를 출력하는 것이다.
        // 따라서 comparable 구현된애를 쓰고 싶다면 뒤에 타입도 T 로 제한을 걸어놔야한다.
        // T로 제한 해놨다면 T 로 통일 시키고, ? 쓸거면 T로 뭔가 이상한 제한을 하지말자.

    }
}
