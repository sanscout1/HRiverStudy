package JAVA.Java_Test.BoardProject_2.src;

import java.sql.SQLException;

public class BoardMain {
    /*
    우리 팀을 위한 간단한 설명
    main 에서는 메뉴 객체 생성 후 메뉴로 들어갑니다.
    -- 메뉴 클래스에서 설명 이어서
     */

    public static void main(String[] args){
        BoardMenu menu = new BoardMenu();
        menu.mainMenu();
    }
}
