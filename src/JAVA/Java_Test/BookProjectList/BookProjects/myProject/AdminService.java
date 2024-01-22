package JAVA.Java_Test.BookProjectList.BookProjects.myProject;

import java.util.Scanner;

public class AdminService {

    private String adminId;
    private String adminPW;

    public  void menuAdminLogin(Person person) {

        System.out.println("관리자 정보를 입력하세요");
        Scanner sc = new Scanner(System.in);
        System.out.println("아이디 :");
        adminId = sc.next();
        System.out.println("비밀번호 :");
        adminPW = sc.next();

        Admin admin = new Admin(person.getName(),person.getPhone());
        isAdmin(admin,adminId,adminPW);
    }
    private void isAdmin(Admin admin,String adminId ,String adminPW){
        if (admin.getId().equals(adminId) && admin.getPassword().equals(adminPW)) {
            System.out.println("이름 " + admin.getName() + " 연락처 " + admin.getPhone());
            System.out.println("아이디 " + admin.getId() + " 비밀번호 " + admin.getPassword());
            System.out.println("관리자 계정 로그인 되었습니다.");
        } else {
            System.out.println("관리자 정보가 일치하지 않습니다.");
        }
    }
}
