package JAVA.Java_Test.BookProjectList.BookProject_4th.DAO;



import JAVA.Java_Test.BookProjectList.BookProject_4th.API.Service;
import JAVA.Java_Test.BookProjectList.BookProject_4th.BookException.BookException;
import JAVA.Java_Test.BookProjectList.BookProject_4th.BookException.BookExceptionList;
import JAVA.Java_Test.BookProjectList.BookProject_4th.BookException.ErrorCodeBook;
import JAVA.Java_Test.BookProjectList.BookProject_4th.MAPPER.BookMapper;

import java.util.Scanner;

public class BookService implements Service {
    Scanner sc = new Scanner(System.in);
    BookMapper bookMapper = new BookMapper();

    @Override
    public <T> void printInfo(T t) {
        try {
            if (BookExceptionList.isEmptyBookList(bookMapper)) {
                throw new BookException(ErrorCodeBook.EMPTY_BOOK);
            }
            else {
                System.out.println(bookMapper.showCartList((Integer) t));
            }
        } catch (Exception e){

        }
    }


    public <T> void addBookCartlist(T userid) { // 장바구니에 Book 담기

        String inputId = "";  // 입력받는 책아이디

        boolean bookIs = true;

        System.out.println();

        bookMapper.toString(); // 책리스트출력

        while (bookIs) { // false 나올때까지 반복
            System.out.print("\n장바구니에 추가할 도서의 ID를 입력하세요 ");
            inputId = sc.nextLine();
                for (String id : bookMapper.showBookList().keySet()) {
                    if(inputId.equals(id)) {
                        bookIs = false;
                        askAddBook((Integer) userid,inputId);
                        break;
                    }


                        // 입력받은 book아이디랑 쇼핑몰 책 리스트에 같은이름이 있으면 이 if문에 들어오고 bookIs는 false가 되어서 for문 빠져나옴
                }
                if(bookIs) {
                    System.out.println("없는 도서 id 입니다.");
                }
            }

    }
    public void askAddBook(int userid,String inputId){
        String inputTF;       // 장바구니 추가하겠습니까? Y|N

        System.out.print("장바구니에 추가하시겟습니까? (Y|N) "); //
        inputTF = sc.nextLine();

            if (inputTF.equalsIgnoreCase("Y")) {
                for (String id : bookMapper.showBookList().keySet()) {
                    if (id.equals(inputId)) {
                        bookMapper.addCartList(userid,id); // Y면 장바구니에 추가
                        System.out.println(id + " 도서가 장바구니에 추가되었습니다.");
                    }
                }

            } else if (inputTF.equalsIgnoreCase("N")) {
                System.out.println("도서를 추가 하지 않았습니다.");
            } else {
                throw new BookException(ErrorCodeBook.IS_YN_CHOICE);
            }
    }
}
