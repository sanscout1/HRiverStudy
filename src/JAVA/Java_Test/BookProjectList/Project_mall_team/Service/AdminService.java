package JAVA.Java_Test.BookProjectList.Project_mall_team.Service;

import JAVA.Java_Test.BookProjectList.Project_mall_team.vo.Admin;
import JAVA.Java_Test.BookProjectList.Project_mall_team.vo.User;

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

        isAdmin(user, adminId, adminPW);

    }

    private void isAdmin(User user, String adminId, String adminPW) {
        if (user.getId().equals(adminId) && user.getPassword().equals(adminPW)) {
            // 관리자 아이디가 맞으면 Admin 객체 생성
            Admin admin = new Admin(user);
            // user 받는 이유, admin 의 아이디 비번을 확인하고 객체 생성을 하기 때문에, 유저 객체 들어올수 밖에 없다.
            // (서비스 흐름이 유저 객체가 생성된 상태에서 진행되기 때문이다. --> 전번과 이름이 user 객체에 존재 하고 있어서)

            System.out.println("이름" + admin.getName() + " 연락처 " + admin.getPhone());
            System.out.println("아이디" + admin.getId() + " 비밀번호 " + admin.getPassword());
        } else {
            System.out.println("관리자 정보가 일치하지 않습니다.");
        }
    }
}
