package Java_Test.BoardProject_2.src.BoardException;

public enum ErrorCodeBoard {
    NOT_EXIST_BOARD("없는 게시물 입니다.","E03"),
    IS_NOT_RIGHT_BNO("입력 게시물 번호가 옳지 않습니다.","E02"),
    IS_NOT_RIGHT_CHOICE("올바른 선택지가 아닙니다.","E01");
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
