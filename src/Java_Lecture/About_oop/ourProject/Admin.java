package Java_Lecture.About_oop.ourProject;

import java.util.Scanner;

public class Admin extends Person {


  static private final String id = "admin";
  static private final String password = "adminadmin";


  public Admin(String name, String phone) {
    super(name, phone);
  }

  // 클래스내 사용
  protected String getId() {
    return id;
  }

  protected String getPassword() {
    return password;
  }


}
