package Java_Test.BoardProject_2.src.BoardException;

public enum ErrorCodeBoard {
    IS_NOT_ONETWO("올바른 선택지가 아닙니다.","E01");
    private String message;
    private String errorCode;

    public String getMessage() {
        return message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    ErrorCodeBoard(String message, String errorCode){
        this.message = message;
        this.errorCode = errorCode;
    }
}
