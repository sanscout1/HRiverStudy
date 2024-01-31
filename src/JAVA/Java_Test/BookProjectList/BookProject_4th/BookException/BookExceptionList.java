package JAVA.Java_Test.BookProjectList.BookProject_4th.BookException;



import JAVA.Java_Test.BookProjectList.BookProject_4th.MAPPER.BookMapper;


import java.util.Map;
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

//    public static boolean isAdmin(User user, String adminId, String adminPW){
//        if(user.getId().equals(adminId) && user.getPassword().equals(adminPW)){
//            return true;
//        }return false;
//    }
//
//

    public static boolean isEmptyBookList( BookMapper bookMapper) {
        if(bookMapper.getCart().isEmpty()){
            return true;
        }
        return false;
    }

}
