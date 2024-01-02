package Java_Lecture.About_Collection.ListExample.BoardExample;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardDao {

    private static int BNO =1;
    private Scanner in = new Scanner(System.in);
    List<Board> boardList = new ArrayList<Board>();

    public void list() {
        System.out.println();
        System.out.println("[게시물 목록]");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
        System.out.println("--------------------------------------------------------------------------------");
        readAll();
        mainMenu();
    }

    public void mainMenu() {
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println("메인 메뉴 : 1. Create | 2.Read | 3.Clear | 4.Exit");
        System.out.println("메뉴 선택: ");
        String menuNo = in.nextLine();
        System.out.println();
        switch (menuNo) {
            case "1" -> create();
            case "2" -> read();
            case "3" -> clear();
            case "4" -> exit();
            default -> mainMenu();
        }

    }

    private void create() {
        Board board = new Board();
        try {
            System.out.println("[새 게시물 입력]");
            board.setBno(BNO++);
            System.out.print("제목: ");
            board.setBtitle(in.nextLine());
            System.out.print("내용: ");
            board.setBcontent(in.nextLine());
            System.out.print("작성자: ");
            board.setBwriter(in.nextLine());
            board.setBdate(getCurrentDate());
            // 보조 메뉴
            subMenu();
            String menuNo = in.nextLine();
            if (menuNo.equals("1")) {
                boardList.add(board);
                System.out.println("게시물 등록 성공!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            exit();
        }
        list();
    }

    private void read() {
        System.out.println("[게시물 읽기]");
        System.out.print("bno: ");
        int tmpBno = Integer.parseInt(in.nextLine());   // 이렇게 입력받기 익숙해지자
        readOne(tmpBno);
        // 보조 메뉴
        System.out.println("--------------------------------------------");
        System.out.println("보조 메뉴: 1. Update | 2. Delete | 3.List");
        System.out.println("메뉴 선택: ");
        String menuNo = in.nextLine();
        if (menuNo.equals("1")) {
            update(tmpBno);
        } else if (menuNo.equals("2")) {
            delete(tmpBno);
        } else if (menuNo.equals("3") ){
            list();
        } else {
            System.out.println("없는 메뉴 입니다");
            list();
        }
    }

    public void update(int bno){
        try {
            for (Board board : boardList) {
                if(board.getBno() == bno){
                    System.out.println("[수정 내용 입력]");
                    System.out.print("제목: ");
                    String tmpBtitle = in.nextLine();
                    System.out.print("내용: ");
                    String tmpBcontent = in.nextLine();
                    System.out.print("작성자: ");
                    String tmpBwriter = in.nextLine();
                    // 보조 메뉴
                    subMenu();
                    String menuNo = in.nextLine();
                    if (menuNo.equals("1")) {
                        board.setBtitle(tmpBtitle);
                        board.setBcontent(tmpBcontent);
                        board.setBwriter(tmpBwriter);
                        System.out.println("게시물 수정 성공!");
                    }
                }

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            exit();
        }
        list();
    }

    public void delete(int tmpBno){
        try {
            for (Board board : boardList) {
                if(board.getBno()==tmpBno){
                    boardList.remove(board);
                }
            }
        } catch (Exception e){
            System.out.println("게시판이 비어있습니다.");
        }

        list();
    }


    private void clear() {
        System.out.println("[게시물 전체 삭제]");
        subMenu();
        try {
            String menuNo = in.nextLine();
            if (menuNo.equals("1")) {
                boardList.removeAll(boardList);
                System.out.println("게시물 전체 삭제 성공!");
            }
        } catch (Exception e){
            System.out.println("게시물이 비어있습니다.");
        }
        list();
    }

    private void exit() {
        System.out.println("***exit()메소드 실행됨, 프로그램 종료");
        System.exit(0);
    }

    public String getCurrentDate() {
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        String currentDate = date.format(new Date());
        return currentDate;
    }

    private void readAll() {
        for (Board board : boardList) {
            System.out.printf("%-6s%-12s%-16s%-40s\n", board.getBno(), board.getBwriter(), board.getBdate(), board.getBcontent());
        }
    }

    private void readOne(int bno) {
        try {
            System.out.println("###################");
            for (Board board : boardList) {
                if (board.getBno() == bno) {
                    System.out.printf("%-6s%-12s%-16s%-40s\n", board.getBno(), board.getBwriter(), board.getBdate(), board.getBcontent());
                }
            }
            System.out.println("###################");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void subMenu(){
        System.out.println("--------------------------------------------");
        System.out.println("보조 메뉴: 1. OK | 2. Cancel");
        System.out.println("메뉴 선택: ");
    }
}
