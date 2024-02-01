package JAVA.Java_Test.ioex01;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        MemoDao dao = MemoDao.getInstance();
        Menu menu = new Menu();
        dao.loadMemo();
        menu.printMenu();
    }
}
