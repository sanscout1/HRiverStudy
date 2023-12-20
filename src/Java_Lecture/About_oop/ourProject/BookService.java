package Java_Lecture.About_oop.ourProject;

import java.util.ArrayList;

public class BookService {
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
}
