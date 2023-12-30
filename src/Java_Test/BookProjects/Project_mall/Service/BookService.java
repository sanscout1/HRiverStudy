package Java_Test.BookProjects.Project_mall.Service;


import Java_Test.BookProjects.Project_mall.vo.Book;
import Java_Test.BookProjects.Project_mall.vo.User;
import java.util.ArrayList;
import java.util.Scanner;


public class BookService {
  private User user;
  private Scanner sc;
  private ArrayList<Book> bookList = new ArrayList<>();         // 현재 쇼핑몰에 책리스트
  private ArrayList<Book> myCartBookList = new ArrayList<>();   // 내가 담은 장바구니 리스트
  Book book1 = new Book("ISBN1234", "쉽게 배우는 JSP 웹 프로그래밍", 27000, "송미영", "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍", "IT전문서", "2018/10/06");
  Book book2 = new Book("ISBN1235", "안드로이드 프로그래밍", 33000, "우재남", "실습 단계별 명쾌한 멘토링!", "IT전문서", "2022/01/22");
  Book book3 = new Book("ISBN1236", "스크래치", 22000, "고광일", "컴퓨터 사고력 키우는 블록 코딩", "컴퓨터입문", "2019/06/10");


  public BookService(User user, Scanner sc){
    bookList.add(book1);
    bookList.add(book2);
    bookList.add(book3);
    this.user = user;
    this.sc = sc;

  }

  public void bookListPrint (ArrayList<Book> bookList){ // Book 리스트 출력
    if(bookList.isEmpty()){
      System.out.println("장바구니가 비었습니다.");
    }
    for(Book book : bookList){
      System.out.print(book.getBookId()+" | "+book.getBookName()+" | "+book.getBookPrice()+" | "+book.getBookAuthor()+" | "+book.getBookSubName()+" | "+book.getBookCategory()+" | "+book.getBookDate()+"\n");
    }
  }

  public void addListBook(Book book) { // 장바구니에 Book 담기

    this.myCartBookList.add(book);
  }

  public ArrayList<Book> getMyCartBookList() {
    return myCartBookList;
  }

  public void cartAddBook() { // 장바구니에 Book 담기

    String inputId = "";  // 입력받는 책아이디

    boolean bookIs = true;

    System.out.println();

    bookListPrint(bookList); // 책리스트춮력

    while (bookIs) { // false 나올때까지 반복
      System.out.print("\n장바구니에 추가할 도서의 ID를 입력하세요 ");
      inputId = sc.nextLine();

      for (Book book : bookList) {
        if (book.getBookId().equals(inputId)) {
          bookIs = false;
          // 입력받은 book아이디랑 쇼핑몰 책 리스트에 같은이름이 있으면 이 if문에 들어오고 bookIs는 false가 되어서 for문 빠져나옴
        }
      }
      if (bookIs) { // 같은 이름이 없으면 true 니까 if 실행 그리고 while 반복
        System.out.println("목록에 그런 책이없습니다.");
      }
    }
   askAddBook(bookList, inputId);
  }

  public void askAddBook(ArrayList<Book> bookList,String inputId){
    String inputTF;       // 장바구니 추가하겠습니까? Y|N

    System.out.print("장바구니에 추가하시겟습니까? (Y|N) "); //
    inputTF = sc.nextLine();
    if (inputTF.equalsIgnoreCase("Y")) {
      for (Book book : bookList) {
        if (book.getBookId().equals(inputId)) {
          addListBook(book); // Y면 장바구니에 추가
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
