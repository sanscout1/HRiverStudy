package Java_Test.BoardProject_2.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardDao {
    Scanner in = new Scanner(System.in);
    private List<Board> boardList = new ArrayList<Board>();
    private Board board;

    public static int bno = 1;

    public List<Board> getBoardList() {
        return boardList;
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
        int choice = Integer.parseInt(in.nextLine());
        if (choice == 1) {
            boardList.add(board);

        }
    }

    public void Read() {
        System.out.println("[게시물 읽기]");
        System.out.print("bno:");
        int tmpBno = Integer.parseInt(in.nextLine());

        // foreach 에서 range 범위가 변화는 일 (삭제 같은거) 발생하면 오류발생해서 터짐
        for (Board board1 : boardList) {
            if (board1.getBno() == tmpBno) {
                System.out.println("####################");
                System.out.println("번호: " + board1.getBno());
                System.out.println("제목: " + board1.getBtitle());
                System.out.println("내용: " + board1.getBcontent());
                System.out.println("작성자: " + board1.getBwriter());
                System.out.println("날짜: " + board1.getDate());
                System.out.println("------------------------------------------------");
                System.out.println("보조 메뉴: 1.Update | 2.Delete | 3.List");
                System.out.println("메뉴 선택: ");
                int choice = Integer.parseInt(in.nextLine());
                try {
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
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        }


    }

    public void ReadAll() {

        if(!boardList.isEmpty()){
            for (Board board1 : boardList) {
                System.out.printf("%-4s%-12s%-16s%-40s\n",board1.getBno(),board1.getBwriter(),board1.getDate(),board1.getBtitle());
            }
        }
        System.out.println();
        System.out.println("---------------------------------------------");

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
                    if (menuNo.equals("1")) {
                        board.setBtitle(tmpBtitle);
                        board.setBcontent(tmpBcontent);
                        board.setBwriter(tmpBwriter);
                        System.out.println("게시물 수정 성공!");
                    }


            }



    public void Delete(Board board) {
        System.out.println("삭제합니다");
        try {boardList.remove(board);}
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("삭제 완료");

    }

    public void Clear() {
        System.out.println("[게시물 전체 삭제]");
        System.out.println("--------------------------------------------");
        System.out.println("보조 메뉴: 1. OK | 2. Cancel");
        System.out.println("메뉴 선택: ");
        try {
            String menuNo = in.nextLine();
            if (menuNo.equals("1")) {
                boardList.removeAll(boardList);
                System.out.println("게시물 전체 삭제 성공!");
            }
        } catch (Exception e){
            System.out.println("게시물이 비어있습니다.");
        }

    }

    public void Exit() {
        System.out.println("시스템을 종료합니다.");
        System.exit(0);
    }
}
