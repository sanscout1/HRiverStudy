package Java_Test.BoardProject_2.src;


public class BoardMenu {

    BoardDao boardDao= new BoardDao();
    public void mainMenu(){
        // 이 부분 boarddao 에서 게시물 출력 하는거 따로 뽑자
        System.out.println("[게시물 목록]");
        System.out.println("---------------------------------------------");
        System.out.printf("%-4s%-12s%-16s%-40s\n","no","writer","date","title");
        boardDao.ReadAll();
        System.out.println("---------------------------------------------");

        System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
        System.out.println("메뉴 선택 :");
        int choice = Integer.parseInt(boardDao.in.nextLine());
        switch (choice) {
            case 1-> {boardDao.Create(); mainMenu();}
            case 2-> {boardDao.Read();  mainMenu();}
            case 3-> {boardDao.Clear();  mainMenu();}
            case 4-> {boardDao.Exit();  mainMenu();}
            default -> mainMenu();
            //이렇게 함수 2개 해서 반복되게 가능
        }

    }
}
