package Java_Test.BookProjectList.BookProjects.myProject;

public class User extends Person{


  public void printCustomerInform(){
    System.out.println("이름: "+getName());
    System.out.println("전화번호: "+getPhone());
  }

  public User(String customerName, String customerTel) {
    super(customerName, customerTel);

  }

  public User(String customerName, String customerTel, String customerAddress){
    super(customerName,customerTel,customerAddress);
  }
}
