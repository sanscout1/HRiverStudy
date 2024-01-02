package Java_Lecture.About_Collection.ListExample.BoardEx;

public class BoardMain {  //
    public static void main(String[] args) {


        BoardDao boardDao = new BoardDao();
//        List<Board> boardList = new ArrayList<Board>();
//        boardList = boardDao.getBoard();
        boardDao.getBoard();
        // 게시물 사이즈
        System.out.println("게시물 사이즈 : " + boardDao.boardSize());
        // 게시물 내용 조회
        boardDao.getBoardAll();
        // 글쓴 사람 이름을 전달하여 글쓴이의 이름과 글 주제 내용을 출력 하는 함수
        boardDao.writerSearch("JAY");

        //dao 에 boardInsert(String subject, String writer, String content)메소드를 작성하여 새로운 글 추가기능 구현
        boardDao.boardInsert("자바심화프로그래밍6", "오늘은 컬렉션 프레임워크6", "LHK");







//           List<Board> boardList = new ArrayList<Board>();
//        //5명이 글을 작성하였습니다. 5명이 쓴 글에대해 글쓴 순서대로 boardlist 저장하세요.
//        boardList.add(new Board("자바심화프로그래밍1","오늘은 컬렉션 프레임워크1","SYM"));
//        boardList.add(new Board("자바심화프로그래밍2","오늘은 컬렉션 프레임워크2","SYM"));
//        boardList.add(new Board("자바심화프로그래밍3","오늘은 컬렉션 프레임워크3","SYM"));
//        boardList.add(new Board("자바심화프로그래밍4","오늘은 컬렉션 프레임워크4","SYM"));
//        boardList.add(new Board("자바심화프로그래밍5","오늘은 컬렉션 프레임워크5","SYM"));
//
//        int size = boardList.size();
//        System.out.println("현재 게시물 개수 : "+size);
//
//        // 두번째로 글 쓴 사람의 이름
//
//        Board two = boardList.get(1);
//        System.out.println(two.getWriter());
//        two.setWriter("KJS");
//        System.out.println(two.getWriter());
//
//
//        // Board의 전체 글을 조회
//        for (Board board : boardList) {
//            System.out.println(boardList.indexOf(board));
//            System.out.println(board.getWriter());
//            System.out.println(board.getSubject());
//            System.out.println(board.getContent());
//        }


    }

}
