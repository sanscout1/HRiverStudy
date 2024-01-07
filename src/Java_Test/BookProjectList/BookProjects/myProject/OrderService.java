package Java_Test.BookProjectList.BookProjects.myProject;

import java.util.ArrayList;
import java.util.Scanner;
public class OrderService {

  private User cus1;
  private BookService bookService;

  OrderService(){}
  OrderService(User cus1, BookService bookService){
    this.cus1 = cus1;
    this.bookService = bookService;
  }

  public void printMenu()  {
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

  public void serviceCustomerPrint(){
    System.out.println("고객 정보확인");
    cus1.printCustomerInform(); // 고객 이름, 전화번호 출력
  }

  public void servicePrintCartList(){
    System.out.println("장바구니 상품목록 보기");
    if (!bookService.getBookCart().isEmpty()) { // 장바구니가 비어있지 않으면 장바구니 리스트 출력
      bookService.printCartList();
    } else {
      System.out.println("장바구니가 비었습니다.");
    }
  }


  Scanner sc = new Scanner(System.in);
  public void serviceAddBook(ArrayList<Book> bookMall){

    String inputId = ""; // 입력받는 책아이디
    boolean bookIs = true;

    System.out.println();
    for (Book book : bookMall) { // 쇼핑몰 책리스트 출력
      book.bookPrint();
    }
    while (bookIs) { // false 나올때까지 반복
      System.out.print("\n장바구니에 추가할 도서의 ID를 입력하세요 ");
      inputId = sc.nextLine();

      for (Book book : bookMall) {
        if (inputId.equals(book.getBookId())) {
          bookIs = false;
          // 입력받은 book아이디랑 쇼핑몰 책 리스트에 같은이름이 있으면 이 if문에 들어오고 bookIs는 false가 되어서 for문 빠져나옴
        }
      }
      if (bookIs) { // 같은 이름이 없으면 true 니까 if 실행 그리고 while 반복
        System.out.println("목록에 그런 책이없습니다.");
      }
      askAddBook(bookMall,inputId);
    }

  }
  private void askAddBook (ArrayList<Book> bookMall,String inputId){

    String inputTF;   // 장바구니 추가하겠습니까? Y|N

    System.out.print("장바구니에 추가하시겟습니까? (Y|N) "); //
    inputTF = sc.nextLine();
    if (inputTF.equalsIgnoreCase("Y")) {
      for (Book book : bookMall) {
        if (book.getBookId().equals(inputId)) {
          bookService.addBookCart(book); // Y면 장바구니에 추가
          System.out.println(book.getBookId() + " 도서가 장바구니에 추가되었습니다.");
        }
      }
    } else if (inputTF.equalsIgnoreCase("N")) {
      System.out.println("N입력");
    } else {
      System.out.println("다른 문자 입력,다시 입력 해주세요");
    }
  }
}

