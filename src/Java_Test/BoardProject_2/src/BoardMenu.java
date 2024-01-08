package Java_Test.BoardProject_2.src;


public class BoardMenu {

    BoardDao boardDao= new BoardDao();
    public void mainMenu(){

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
