package JAVA.Java_Test.BookProjectList.BookProject_Exception.vo;

public class Book {
  private String bookId;
  private String bookName;
  private int bookPrice;
  private String bookAuthor;
  private String bookSubName;
  private String bookCategory;
  private String bookDate;

  public Book(String bookId, String bookName, int bookPrice, String bookAuthor, String bookSubName, String bookCategory, String bookDate) {
    this.bookId = bookId;
    this.bookName = bookName;
    this.bookPrice = bookPrice;
    this.bookAuthor = bookAuthor;
    this.bookSubName = bookSubName;
    this.bookCategory = bookCategory;
    this.bookDate = bookDate;
  }

  public String getBookId() {
    return bookId;
  }

  public String getBookName() {
    return bookName;
  }

  public int getBookPrice() {
    return bookPrice;
  }

  public String getBookAuthor() {
    return bookAuthor;
  }

  public String getBookSubName() {
    return bookSubName;
  }

  public String getBookCategory() {
    return bookCategory;
  }

  public String getBookDate() {
    return bookDate;
  }
}
