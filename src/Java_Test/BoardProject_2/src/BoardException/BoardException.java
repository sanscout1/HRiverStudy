package Java_Test.BoardProject_2.src.BoardException;

public class BoardException extends RuntimeException{

    private ErrorCodeBoard errorCodeBoard;
    public BoardException(ErrorCodeBoard error){
        this.errorCodeBoard = error;
        System.out.println("====================에러=============================");
        System.out.println(this.errorCodeBoard.getMessage()+" "+this.errorCodeBoard.getErrorCode());
        System.out.println("====================에러=============================");
    }
}
