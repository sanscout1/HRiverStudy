package JAVA.Java_Test.BookProjectList.Project_mall_team.Service;
import JAVA.Java_Test.BookProjectList.Project_mall_team.vo.User;

import java.util.Scanner;

public class OrderService {
  Scanner sc;
  private User user;

  public OrderService(User user, Scanner sc) {
    this.sc = sc;
    this.user = user;  //OrderMain에서 생성한 user객체를 받아온다.
  }

  public void printMenu() {
    System.out.println();
    System.out.println("******************************");
    System.out.println("1. 고객 정보 확인하기");
    System.out.println("2. 장바구니 상품 목록보기");
    System.out.println("4. 바구니에 항목 추가하기");
    System.out.println("8. 종료");
    System.out.println("9. 관리자 로그인");
    System.out.println("******************************");
    System.out.print("\n메뉴 번호를 선택해주세요 ");
  }

  public void printSelectMenu() throws InterruptedException {
    UserService userService = new UserService(this.user);       //UserService 객체 생성
    BookService bookService = new BookService(this.user, sc);   //BookService 객체 생성
    //Scanner 중복 선언 방지를 위해 객체를 넘겨준다

    while (true) {
      printMenu();   //메뉴 목록 출력

      int choiceNum = sc.nextInt();   //메뉴 선택
      sc.nextLine();

      switch (choiceNum) {
        case 1 -> { //유저 정보 출력
          userService.userInfoPrint();
          Thread.sleep(1000);
        }
        case 2 -> { //나의 장바구니 목록 출력
          bookService.bookListPrint(bookService.getMyCartBookList());
          Thread.sleep(1000);
        }
        case 4 -> { //장바구니에 책 추가
          bookService.cartAddBook();
          Thread.sleep(1000);
        }
        case 8 -> { //프로그램 종료
          System.out.println("종료");
          System.exit(0);
        }
        case 9 -> { //관리자 로그인
          AdminService adminService = new AdminService(user);
          adminService.menuAdminLogin();  //관리자 로그인 메뉴
          Thread.sleep(1000);
        }
      }
    }
  }


}
