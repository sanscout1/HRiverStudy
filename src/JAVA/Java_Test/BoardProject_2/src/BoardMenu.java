package JAVA.Java_Test.BoardProject_2.src;


import java.sql.SQLException;

public class BoardMenu {

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
