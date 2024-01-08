package Java_Test.BoardProject_2.src.BoardException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BoardExceptionList{

    public static boolean isOneOrTwo(String choice){
        String regex = "[1-2]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(choice);
        return m.matches();
    }
}
