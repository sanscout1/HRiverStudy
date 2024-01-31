package JAVA.Java_Test.BookProjectList.BookProject_4th.DAO;


import JAVA.Java_Test.BookProjectList.BookProject_4th.BookException.BookException;
import JAVA.Java_Test.BookProjectList.BookProject_4th.BookException.ErrorCodeBook;
import JAVA.Java_Test.BookProjectList.BookProject_4th.VO.Admin;
import JAVA.Java_Test.BookProjectList.BookProject_4th.VO.User;


import java.util.Scanner;

public class AdminService {
    User user;

    public AdminService(User user) { //생성자
        this.user = user;
    }

    public void menuAdminLogin() {   // 관리자 로그인
        System.out.println("관리자 정보를 입력하세요");

        Scanner sc = new Scanner(System.in);
        System.out.println("아이디 :");
        String adminId = sc.next();
        System.out.println("비밀번호 :");
        String adminPW = sc.next();

        isAdmin(adminId, adminPW);

    }

    private void isAdmin( String adminId, String adminPW) {
        Admin admin = new Admin();
            if (admin.getId().equals(adminId) && admin.getPassword().equals(adminPW)) {
                System.out.println("admin 로그인 성공");

            }
            else {
                throw new BookException(ErrorCodeBook.IS_NOT_ADMIN);
            }
    }
}
