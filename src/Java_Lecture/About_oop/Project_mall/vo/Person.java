package Java_Lecture.About_oop.Project_mall.vo;

public class Person {
  private String id = "Admin"; //관리자 아이디, 비밀번호 고정
  private String password = "Admin1234";
  private String name;
  private String tel;

  public Person(){}

  public Person(String name, String tel){
    this.name = name;
    this.tel = tel;
  }

  public Person(String id, String password, String name, String tel) {
    this.id = id;
    this.password = password;
    this.name = name;
    this.tel = tel;
  }

  public String getName() {
    return name;
  }

  public String getPhone() {
    return tel;
  }

  public String getId() {
    return id;
  }

  public String getPassword() {
    return password;
  }
}
