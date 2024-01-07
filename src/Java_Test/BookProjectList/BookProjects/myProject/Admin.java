package Java_Test.BookProjectList.BookProjects.myProject;

public class Admin extends Person {


  static private final String id = "admin";
  static private final String password = "adminadmin";


  public Admin(String name, String phone) {
    super(name, phone);
  }

  // 클래스내 사용
  public String getId() {
    return id;
  }

  public String getPassword() {
    return password;
  }


}
