package Java_Test.BookProjectList.BookProject_Exception.Service;

import Java_Test.BookProjectList.BookProject_Exception.BookException.BookException;
import Java_Test.BookProjectList.BookProject_Exception.BookException.BookExceptionList;
import Java_Test.BookProjectList.BookProject_Exception.BookException.ErrorCodeBook;
import Java_Test.BookProjectList.BookProject_Exception.vo.User;

public class UserService {

  private User user;

  public UserService(User user) {
    this.user = user;
  }

  public void userInfoPrint() {
    try {
      System.out.println("고객 정보확인");
      if(BookExceptionList.isExistName(user)){
        throw new BookException(ErrorCodeBook.INEXIST_NAME);
      }
      if(BookExceptionList.isExistPassword(user)){
        throw new BookException(ErrorCodeBook.INEXIST_PASSWORD);
      }
      System.out.println("이름: " + user.getName());
      System.out.println("전화번호: " + user.getPhone()); // 고객 이름, 전화번호 출력
    }
    catch (Exception e){

    }
  }

}
