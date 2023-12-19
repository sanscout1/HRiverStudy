package Java_Lecture.About_oop.ourProject;

import java.util.ArrayList;

public class User extends Person{

  private ArrayList<Book> bookCart = new ArrayList<>();

  public ArrayList<Book> getBookCart() {

    return bookCart;
  }

  public void addBookCart(Book book){
    this.bookCart.add(book);
  }
  public void printCartList(){
    for (Book book: bookCart) {
      book.bookPrint();
    }
  }

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
