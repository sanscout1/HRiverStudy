package JAVA.Java_Test.BoardProject_2.src;

import JAVA.Java_Test.BoardProject_2.src.BoardException.BoardException;
import JAVA.Java_Test.BoardProject_2.src.BoardException.BoardExceptionList;
import JAVA.Java_Test.BoardProject_2.src.BoardException.ErrorCodeBoard;
import lombok.Getter;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardDao {
    Scanner in = new Scanner(System.in);
    @Getter
    private  List<Board> boardList = new ArrayList<>();
    private Board board;

    BoardDB boardDB = BoardDB.getInstance();
    private int bno ;

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
    private static volatile BoardDao instance;

    public static BoardDao getInstance() {  //싱글톤
        if (instance == null) {
            instance = new BoardDao();
        }
        return instance;
    }

    public void list() {
        System.out.println("[게시물 목록]");
        System.out.println("---------------------------------------------");
        System.out.printf("%-4s%-12s%-40s%-25s%-30s\n", "no", "writer","content", "date", "title");
        ReadAll();
        System.out.println("---------------------------------------------");

    }

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
