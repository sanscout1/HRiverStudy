package JAVA.Java_Test.BoardProject_2.src;


import java.sql.SQLException;

public class BoardMenu {

    /*
    boarddao 가 이상하게 객체 생성 new 가아닌 .getInstanche를 합니다. 싱글톤 패턴을 사용해서 그런데요
    자세한 내용은 boardDao에 작성하겠습니다.

    이 클래스에서는 간단한 메뉴 함수만 있습니다. boarddao로 넘어가 설명을 이어 가겠습니다.
     */

    BoardDao boardDao= BoardDao.getInstance();

    public void mainMenu() {

        System.out.println("메인 메뉴: 1.Create | 2.Read | 3.List | 4.Clear | 5.Exit");
        System.out.println("메뉴 선택 :");
        int choice = Integer.parseInt(boardDao.in.nextLine());
        switch (choice) {
            case 1-> {boardDao.Create(); mainMenu();}
            case 2-> {boardDao.Read();  mainMenu();}
            case 3-> {boardDao.list();  mainMenu();}
            case 4-> {boardDao.clear();  mainMenu();}
            case 5-> {boardDao.Exit();  mainMenu();}
            default -> mainMenu();
        }

    }
}
