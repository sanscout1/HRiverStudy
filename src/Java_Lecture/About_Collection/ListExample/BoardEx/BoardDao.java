package Java_Lecture.About_Collection.ListExample.BoardEx;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    // 데이터만 있는 board 의 대한 기능 구현

    private List<Board> boardList = new ArrayList<Board>();
    List<Board> getBoard() {
        boardList.add(new Board("자바심화프로그래밍1", "오늘은 컬렉션 프레임워크1", "SYM"));
        boardList.add(new Board("자바심화프로그래밍2", "오늘은 컬렉션 프레임워크2", "SYM"));
        boardList.add(new Board("자바심화프로그래밍3", "오늘은 컬렉션 프레임워크3", "JAY"));
        boardList.add(new Board("자바심화프로그래밍4", "오늘은 컬렉션 프레임워크4", "SYM"));
        boardList.add(new Board("자바심화프로그래밍5", "오늘은 컬렉션 프레임워크5", "SYM"));
        return boardList;
    }

    int boardSize() {
        return boardList.size();
    }

    void getBoardAll() {
        for (Board board : boardList) {
            System.out.println("================================");
            System.out.println(boardList.indexOf(board));
            System.out.println(board.getWriter());
            System.out.println(board.getSubject());
            System.out.println(board.getContent());
        }
    }

    void writerSearch(String writer) {

        for (Board board : boardList) {
            if (board.getWriter().equals(writer)) {
                System.out.println("--------------------------");
                System.out.println("글쓴이 검색 완료!");
                System.out.println(boardList.indexOf(board));
                System.out.println(board.getWriter());
                System.out.println(board.getSubject());
                System.out.println(board.getContent());
            }
        }
    }

    void boardInsert( String subject, String writer, String content) {
        this.boardList.add(new Board(subject, writer, content));
        System.out.println("추가 완료!");
        getBoardAll();
    }


}
