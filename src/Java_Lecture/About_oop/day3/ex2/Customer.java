package Java_Lecture.About_oop.day3.ex2;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private String customerTel;
    private ArrayList<Book> bookCart = new ArrayList<>();

    public ArrayList<Book> getBookCart() {
        return bookCart;
    }

    public void addBookCart(Book book) {
        this.bookCart.add(book);
    }

    public void printCartList() {
        for (Book book : bookCart) {
            book.bookPrint();
        }
    }

    public Customer(String customerName, String customerTel) {
        this.customerName = customerName;
        this.customerTel = customerTel;
    }

    public void printCustomerInform() {
        System.out.println("이름: " + customerName);
        System.out.println("전화번호: " + customerTel);
    }
}
