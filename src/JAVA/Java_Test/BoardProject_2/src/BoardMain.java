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


    /*
    내가 고생한 4시간
    1. 아니 sql 에서는 datetime으로 해놨는데 board 객체에는 뭐라고 해야 date 가 똑같이 나오는거야?
        - 편하게 String 으로 퉁치고,
        public void setDate(){
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.Bdate = date.format(new Date());
    }    -- 이렇게 simpleDateFormat 으로 모양이 똑같은 String 으로 만든다음에
       pstmt.setString(4, board.getDate()); 보내자
       sql 에서는 datetime 자료형이지만 잘 들어간다.

     2. truncate 는 왜 안되는거야?
        - 워크벤치에서 autocommit 을 해놓자
        - 다른 sql문도 이상하게 commit 안누르면 적용안될때는 autocommit 안해놔서 그렇다

     3.
     */
}
