package Java_Test.BookProjectList.BookProject_Exception.vo;

public class Admin extends Person {

  public Admin(User user) {
    super(user.getName(), user.getPhone(), user.getId(), user.getPassword());
  }
    // user 받는 이유, admin 의 아이디 비번을 확인하고 객체 생성을 하기 때문에, 유저 객체 들어올수 밖에 없다.
}
