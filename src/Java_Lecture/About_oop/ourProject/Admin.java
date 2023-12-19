package Java_Lecture.About_oop.ourProject;

import java.util.Scanner;

public class Admin extends Person {
  private String id;
  private String password;

  public Admin(String name, String phone) {
    super(name, phone);
  }

  public Admin(String name, String phone, String id, String password) {
    super(name, phone);
    this.id = id;
    this.password = password;
  }

  public String getId() {
    return id;
  }

  public String getPassword() {
    return password;
  }

  public void menuAdminLogin() {

    System.out.println("관리자 정보를 입력하세요");

    Scanner sc = new Scanner(System.in);
    System.out.println("아이디 :");
    String adminId = sc.next();
    System.out.println("비밀번호 :");
    String adminPW = sc.next();

    if (this.id.equals(adminId) && this.password.equals(adminPW)) {
      System.out.println("이름" + this.getName() + " 연락처 " + this.getPhone());
      System.out.println("아이디" + this.getId() + " 비밀번호 " + this.getPassword());
    } else {
      System.out.println("관리자 정보가 일치하지 않습니다.");
    }
  }
}
