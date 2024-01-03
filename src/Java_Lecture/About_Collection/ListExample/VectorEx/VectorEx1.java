package Java_Lecture.About_Collection.ListExample.VectorEx;

import Java_Lecture.About_Collection.ListExample.BoardEx.Board;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

//벡터는 arraylist와 동일한 내부 구조
// vector는 동기화된 메소드로 구성되어 있어 멀티스레드가 동시에 vector 메소드를 실핼 할 수 없다.
public class VectorEx1 {

    public static void main(String[] args) {
        List<Integer> list1 = new Vector<>();

        List list2 = new Vector();   //제너릭으로 타입을 안정하면 모든 타입 객체가 저장 가능
        // List<Object> list3;
        list2.add("M");
        list2.add(30);
        list2.add(40.5);

        List<Board> boards = new Vector<>();
       // List<Board> boards1 = new ArrayList<>();

        Thread threadA = new Thread(){
            public void run(){
                for (int i = 1; i <= 1000 ; i++) {
                    boards.add(new Board("제목"+i, "내용"+i,"글쓴사람"+i));
                }
            }
        };
        Thread threadB = new Thread(){
            public void run(){
                for (int i = 1001; i <= 2000 ; i++) {
                    boards.add(new Board("제목"+i, "내용"+i,"글쓴사람"+i));
                }
            }
        };

        threadA.start();
        threadB.start();

        // 쓰레드들이 종료될때까지 메인 대기  join 함수는 쓰레드가 끝날때 까지 다른 쓰레드 종료를 대기시켜준다.
        try{
            threadA.join();
            threadB.join();
        }catch (Exception e){
            e.printStackTrace();
        }

        int size = boards.size();
        System.out.println("총 게시글 : "+size);  //벡터로하면 2000나옴  arraylist 하면 2000개안나옴
        //Vector는 따로따로 연산하게 막지만 (동기화 : 한번에 하나의 쓰레드만 접근가능하게)
        //arraylist는 신경안써서 연산중에 다른 쓰레드가 접근하는경우가 발생하여 작업을 못한 경우도 존재

        for (Board board : boards) {
            System.out.println(board.getSubject()+" "+board.getWriter()+" "+board.getContent());
        }
    }
}
