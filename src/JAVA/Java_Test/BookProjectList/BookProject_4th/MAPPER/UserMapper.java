package JAVA.Java_Test.BookProjectList.BookProject_4th.MAPPER;


import JAVA.Java_Test.BookProjectList.BookProject_4th.VO.User;

import java.util.HashMap;
import java.util.Map;

public class UserMapper  {
    Map<Integer, User> userlist = new HashMap<>();


    public Map<Integer, User> getUserlist() {
        return userlist;
    }
}
