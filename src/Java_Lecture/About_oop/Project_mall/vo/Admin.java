package Java_Lecture.About_oop.Project_mall.vo;

public class Admin extends Person {

  public Admin(User user) {
    super(user.getName(), user.getPhone(), user.getId(), user.getPassword());
  }

}
