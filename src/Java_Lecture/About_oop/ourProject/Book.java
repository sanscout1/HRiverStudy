package Java_Lecture.About_oop.ourProject;

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

  public void bookPrint (){
    System.out.print(bookId+" | "+bookName+" | "+bookPrice+" | "+bookAuthor+" | "+bookSubName+" | "+bookCategory+" | "+bookDate+" | \n");
  }

  public String getBookId() {
    return bookId;
  }
}
