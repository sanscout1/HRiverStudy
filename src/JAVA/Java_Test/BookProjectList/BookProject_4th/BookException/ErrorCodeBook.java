package JAVA.Java_Test.BookProjectList.BookProject_4th.BookException;

public enum ErrorCodeBook {
    IS_NOT_GOOD_TEL("올바른 형식의 전화번호가 아닙니다.","E07"),
    IS_NOT_ADMIN("관리자 계정 정보가 옳지 않습니다","E06"),
    IS_NOT_EXIST_BOOK("없는 책입니다.","E05"),
    IS_YN_CHOICE("Y 혹은 N 을 입력해주세요","E04"),
    EMPTY_BOOK("저장되어진 책이 없습니다.","E03"),

    INEXIST_NAME( "이름이 저장되어 있지 않습니다.","E01"),
    INEXIST_PASSWORD( "비밀번호가 저장되어 있지 않습니다.","E02");

    private String message;
    private String code;

    ErrorCodeBook(String message, String code){
        this.message=message;
        this.code=code;
    }

    public String getMessage() {
        return message;
    }

    public String getCode() {
        return code;
    }
}
