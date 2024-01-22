package JAVA.Java_Test.BookProjectList.Project_mall_team.Service;

import JAVA.Java_Test.BookProjectList.Project_mall_team.vo.User;

public class UserService {

  private User user;

  public UserService(User user) {
    this.user = user;
  }

  public void userInfoPrint() {
    System.out.println("고객 정보확인");
    System.out.println("이름: "+user.getName());
    System.out.println("전화번호: "+user.getPhone()); // 고객 이름, 전화번호 출력
  }

}
