package JAVA.Java_Test.BookProjectList.BookProject_4th.BookException;

public class BookException extends RuntimeException {
    private ErrorCodeBook errorCodeBook;

    public BookException(ErrorCodeBook errorCodeBook){
        this.errorCodeBook = errorCodeBook;
        System.out.println("================================================================");
        System.out.println(this.errorCodeBook.getCode()+" : "+this.errorCodeBook.getMessage());
        System.out.println("================================================================");
    }
}
