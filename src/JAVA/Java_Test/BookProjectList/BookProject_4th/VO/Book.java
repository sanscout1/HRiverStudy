package JAVA.Java_Test.BookProjectList.BookProject_4th.VO;



public class Book   {
    private String bookId;
    private String bookName;
    private int bookPrice;
    private String bookAuthor;
    private String bookInfo;
    private String bookCategory;
    private String bookPublishingDate;

    public Book(String bookId, String bookName, int bookPrice, String bookAuthor, String bookInfo, String bookCategory, String bookPublishingDate) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookAuthor = bookAuthor;
        this.bookInfo = bookInfo;
        this.bookCategory = bookCategory;
        this.bookPublishingDate = bookPublishingDate;
    }

    @Override
    public String toString() {
        return
                "bookId='" + bookId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookInfo='" + bookInfo + '\'' +
                ", bookCategory='" + bookCategory + '\'' +
                ", bookPublishingDate='" + bookPublishingDate + '\'';
    }
}
