package Java_Test.BookProjectList.BookProject_Exception.BookException;

import Java_Test.BookProjectList.BookProject_Exception.vo.Book;
import Java_Test.BookProjectList.BookProject_Exception.vo.User;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BookExceptionList {

    public static boolean isRightTel(String tel){
        String regex="^01([0|1|6|7|8|9]?)-?([0-9]{3,4})-?([0-9]{4})$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(tel);
        if(m.matches()) return false;
        return true;
    }

    public static boolean isAdmin(User user, String adminId, String adminPW){
        if(user.getId().equals(adminId) && user.getPassword().equals(adminPW)){
            return true;
        }return false;
    }


    public static boolean isExistBook(String bookName,Book book){
        if(book.getBookId().equals(bookName)){
            return true;
        }
        return false;
    }

    public static boolean isEmptyBookList(ArrayList<Book> booklist) {
        if(booklist.isEmpty()){
            return true;
        }
        return false;
    }


    public static boolean isExistName(User user){
        String regex ="[a-zA-Z가-힣]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(user.getName());

        if(m.matches()){
            return true;
        }
        return false;
    }
    public static boolean isExistPassword(User user){
        String regex ="[\\w]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(user.getPassword());

        if(m.matches()){
            return true;
        }
        return false;
    }
}
