package JAVA.Java_Test.BookProjectList.BookProject_4th;


import JAVA.Java_Test.BookProjectList.BookProject_4th.BookException.BookException;
import JAVA.Java_Test.BookProjectList.BookProject_4th.BookException.BookExceptionList;
import JAVA.Java_Test.BookProjectList.BookProject_4th.BookException.ErrorCodeBook;
import JAVA.Java_Test.BookProjectList.BookProject_4th.DAO.AdminService;
import JAVA.Java_Test.BookProjectList.BookProject_4th.DAO.BookService;
import JAVA.Java_Test.BookProjectList.BookProject_4th.DAO.UserService;
import JAVA.Java_Test.BookProjectList.BookProject_4th.VO.User;


import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

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

    public void printSelectMenu() {
        UserService userService = new UserService();
        BookService bookService = new BookService();

        String name = "";      //입력받을 이름
        String tel = "";       //입력받을 전화번호
        User user;
        int id = 1;


        System.out.print("당신의 이름을 입력하세요 : ");
        name = sc.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        tel = sc.nextLine();

        while (BookExceptionList.isRightTel(tel)) {
            try {
                throw new BookException(ErrorCodeBook.IS_NOT_GOOD_TEL);
            } catch (Exception e) {
            } finally {
                System.out.println("연락처를 다시 입력해주세요");
                tel = sc.nextLine();
            }
        }


        user = new User(id++, name, tel);
        userService.addUser(user);

        while (true) {
            printMenu();   //메뉴 목록 출력
            String choiceNum = sc.nextLine();   //메뉴 선택
            try {
                switch (choiceNum) {
                    case "1" -> { //유저 정보 출력
                        userService.printInfo(user);
                    }
                    case "2" -> { //나의 장바구니 목록 출력
                        bookService.printInfo(user.getID());
                    }
                    case "4" -> { //장바구니에 책 추가
                        bookService.addBookCartlist(user.getID());
                    }
                    case "8" -> { //프로그램 종료
                        System.out.println("종료");
                        System.exit(0);
                    }
                    case "9" -> { //관리자 로그인
                        AdminService adminService = new AdminService(user);
                        adminService.menuAdminLogin();  //관리자 로그인 메뉴
                    }
                    default -> System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                }
            } catch (Exception e) {
            }
        }
    }
}
