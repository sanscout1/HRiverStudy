package Java_Test.BookProjectList.BookProject_Exception;

import Java_Test.BookProjectList.BookProject_Exception.BookException.BookException;
import Java_Test.BookProjectList.BookProject_Exception.BookException.BookExceptionList;
import Java_Test.BookProjectList.BookProject_Exception.BookException.ErrorCodeBook;
import Java_Test.BookProjectList.BookProject_Exception.Service.OrderService;
import Java_Test.BookProjectList.BookProject_Exception.vo.User;

import java.util.Scanner;

public class OrderMain {
  public static void main(String[] args) throws InterruptedException {
    Scanner sc = new Scanner(System.in);
    String name;      //입력받을 이름
    String tel;       //입력받을 전화번호
    User user1;


      System.out.print("당신의 이름을 입력하세요 : ");
      name = sc.nextLine();
      System.out.print("연락처를 입력하세요 : ");
      tel = sc.nextLine();
      while (BookExceptionList.isRightTel(tel)) {
        try {
        throw new BookException(ErrorCodeBook.IS_NOT_GOOD_TEL);
        } catch (Exception e) {}
        finally {
          System.out.println("연락처를 다시 입력해주세요");
          tel = sc.nextLine();
        }
      }

    user1 = new User(name, tel); // 입력받은 name, tel로 user객체 생성

    OrderService orderService = new OrderService(user1, sc);    //생성한 User객체로 OrderService 객체 생성     //Scanner 중복 선언 방지를 위해 객체를 넘겨준다

    System.out.println("******************************\n");
    System.out.println("\tWelcom to Shopping Mall");
    System.out.println("\tWelcom to Book Market");

    orderService.printSelectMenu();

  }
}
