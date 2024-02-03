package JAVA.Java_Test.BoardProject_2.src;

import JAVA.Java_Test.BoardProject_2.src.BoardException.BoardException;
import JAVA.Java_Test.BoardProject_2.src.BoardException.BoardExceptionList;
import JAVA.Java_Test.BoardProject_2.src.BoardException.ErrorCodeBoard;
import lombok.Getter;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 위에서 아래로 천천히 읽으면서 가세요

public class BoardDao {
    Scanner in = new Scanner(System.in);
    @Getter
    private  List<Board> boardList = new ArrayList<>();
    private Board board;
    /*
    여기 boardDB가 또 싱글톤 패턴 뭐시기로 생성되어있네요 좀만 기다리세요 설명해주겠습니다.
     */
    BoardDB boardDB = BoardDB.getInstance();
    private int bno ;

    /*
    싱글톤 패턴이란 객체 인스턴스를 하나만 만들어서 사용하고 싶을때 사용하는 객체 생성패턴입니다.
    내가 원치 않게 다른 객체 생성을 하지 않고 하나만 사용하기 참 좋겠죠?

    밑에 getInstance 함수를 보면 instance 가 없으면 생성하고 있다면 그냥 있는 instance를 리턴 해줍니다.
    리턴해줄려면 가지고 있는 애가 있다는 거라 바로 위에 boarddao는 instance를 가지고 있는 것을 볼 수 있습니다.
    싱글톤 패턴은 이곳 저곳에서 new 해서 인스턴스 생성하는 것이 아닌 한번만 생성해서 써야 해서, static 영역을 활용합니다.
     */
    private static volatile BoardDao instance;

    public static BoardDao getInstance() {  //싱글톤
        if (instance == null) {
            instance = new BoardDao();
        }
        return instance;
    }


    /*
    저는 boarddao 를 생성 할 때, db 를 연결하고 db 데이터 를 가지고 옵니다.
    그 후 다시 닫아야겠죠? 함수이름만 봐도 이해가 되죠?
    try 안에 있는애는 뭐지 애는 싶겠지만
    bno 가 테이블에서 기본키이면서 자동상승 하는 애라 auto_increment
    그거에 맞게 해줄려고 짠 함수라 이해가 되지 않는다면 하나하나 직접 이해하셔야 합니다.
     */

    private  BoardDao() {
        boardDB.connectDB();
        this.boardList = boardDB.readDB();
        try {
            if(!this.boardList.isEmpty()) {
                this.bno = this.boardList.get(boardList.size()-1).getBno()+1;
            }
            else {
                this.bno =1;
            }

            boardDB.closeDB();
        } catch (Exception e) {}
    }


    public void list() {
        System.out.println("[게시물 목록]");
        System.out.println("---------------------------------------------");
        System.out.printf("%-4s%-12s%-40s%-25s%-30s\n", "no", "writer","content", "date", "title");
        ReadAll();
        System.out.println("---------------------------------------------");

    }


    /*
    여기서부터는 원래 게시판 함수랑 동일합니다. 다만 차이가 있다면 boarddao가 가지고 있는 arraylist 에 데이터를 저장하면서,
    db에 저장하기 위하여 db 연결 후 db데이터 작업 후, db 해제를 합니다.
    boarddao 설명은 여기까지하고, boarddb 클래스로 가셔서 어떻게 해놨나보세요
     */
    public void Create() {
        System.out.println("[새 게시물 입력]");
        board = new Board();
        board.setBno(bno++);
        System.out.print("제목: ");
        board.setBtitle(in.nextLine());
        System.out.println();
        System.out.print("내용: ");
        board.setBcontent(in.nextLine());
        System.out.println();
        System.out.print("작성자: ");
        board.setBwriter(in.nextLine());
        board.setDate();
        

        System.out.println("--------------------------------------------------------");
        System.out.println("보조 메뉴: 1.OK | 2.Cancel");
        System.out.println("메뉴 선택: ");
        try {
            String tmp = in.nextLine();
            if (BoardExceptionList.isOneOrTwo(tmp)) {
                int choice = Integer.parseInt(tmp);
                if (choice == 1) {
                    boardList.add(board);
                    boardDB.connectDB();
                    boardDB.writeDB(board);
                    boardDB.closeDB();
                } else {
                    System.out.println("생성을 취소 했습니다.");
                }
            } else {
                throw new BoardException(ErrorCodeBoard.IS_NOT_RIGHT_CHOICE);
            }
        } catch (Exception e) {
            // e.printStackTrace();
        }
        list();
    }

    public void Read() {
        System.out.println("[게시물 읽기]");
        System.out.print("bno:");
        try {
            String tmp = in.nextLine();
            if (BoardExceptionList.isInteger(tmp)) {
                int tmpBno = Integer.parseInt(tmp);
                boolean flag = false;
                // foreach 에서 range 범위가 변화는 일 (삭제 같은거) 발생하면 오류발생해서 터짐
                for (Board board1 : boardList) {
                    if (board1.getBno() == tmpBno) {
                        flag = true;
                        System.out.println("####################");
                        System.out.println("번호: " + board1.getBno());
                        System.out.println("제목: " + board1.getBtitle());
                        System.out.println("내용: " + board1.getBcontent());
                        System.out.println("작성자: " + board1.getBwriter());
                        System.out.println("날짜: " + board1.getDate());
                        System.out.println("------------------------------------------------");
                        System.out.println("보조 메뉴: 1.Update | 2.Delete | 3.List");
                        System.out.println("메뉴 선택: ");
                        tmp = in.nextLine();
                        if (BoardExceptionList.isInteger(tmp)) {
                            int choice = Integer.parseInt(tmp);

                            // 예외처리

                            if (choice == 1) {
                                Update(board1);
                                break;
                            } else if (choice == 2) {
                                Delete(board1);
                                break;
                            } else if (choice == 3) {
                                System.out.println("메인메뉴");
                                break;
                            } else {
                                System.out.println("없는 선택지 입니다.");
                                break;
                            }
                        } else {
                            throw new BoardException(ErrorCodeBoard.IS_NOT_RIGHT_CHOICE);
                        }
                    }

                }
                if (!flag) {
                    throw new BoardException(ErrorCodeBoard.NOT_EXIST_BOARD);
                }
            } else {
                throw new BoardException(ErrorCodeBoard.IS_NOT_RIGHT_BNO);
            }
        } catch (Exception e) {
            // e.printStackTrace();
        }
        list();

    }

    public void ReadAll() {
        // 예외처리
        if (!boardList.isEmpty()) {
            for (Board board1 : boardList) {
                System.out.printf("%-4s%-12s%-40s%-25s%-30s\n", board1.getBno(), board1.getBwriter(),board1.getBcontent(), board1.getDate(), board1.getBtitle());
            }
        }
        System.out.println();

    }

    public void Update(Board board) {


        System.out.println("[수정 내용 입력]");
        System.out.print("제목: ");
        String tmpBtitle = in.nextLine();
        System.out.print("내용: ");
        String tmpBcontent = in.nextLine();
        System.out.print("작성자: ");
        String tmpBwriter = in.nextLine();
        // 보조 메뉴
        System.out.println("--------------------------------------------");
        System.out.println("보조 메뉴: 1. OK | 2. Cancel");
        System.out.println("메뉴 선택: ");
        String menuNo = in.nextLine();
        try {

            if (BoardExceptionList.isOneOrTwo(menuNo)) {
                if (menuNo.equals("1")) {
                    board.setBtitle(tmpBtitle);
                    board.setBcontent(tmpBcontent);
                    board.setBwriter(tmpBwriter);
                    boardDB.connectDB();
                    boardDB.updateDB(board);
                    boardDB.closeDB();
                    System.out.println("게시물 수정 성공!");
                }
            } else {
                throw new BoardException(ErrorCodeBoard.IS_NOT_RIGHT_CHOICE);
            }
        } catch (Exception e) {
            // e.printStackTrace();
        }


    }


    public void Delete(Board board) throws SQLException {// 예외처리
        boardDB.connectDB();
        boardDB.deleteBoard(board);
        boardDB.closeDB();
        boardList.remove(board);
        System.out.println("삭제 완료");

    }

    public void clear()  {  //예외처리
        System.out.println("[게시물 전체 삭제]");
        System.out.println("--------------------------------------------");
        System.out.println("보조 메뉴: 1. OK | 2. Cancel");
        System.out.println("메뉴 선택: ");
        try {
            String menuNo = in.nextLine();
            if (BoardExceptionList.isOneOrTwo(menuNo)) {
                if (menuNo.equals("1")) {
                    boardList.clear();
                    System.out.println("게시물 전체 삭제 성공!");
                    boardDB.connectDB();
                    boardDB.clearBoard();
                    boardDB.closeDB();
                    this.bno = 1;
                }
            } else {
                throw new BoardException(ErrorCodeBoard.IS_NOT_RIGHT_CHOICE);
            }
        } catch (Exception e) {
            // e.printStackTrace();
        }
        list();

    }

    public void Exit() {
        System.out.println("시스템을 종료합니다.");
        System.exit(0);
    }
}
