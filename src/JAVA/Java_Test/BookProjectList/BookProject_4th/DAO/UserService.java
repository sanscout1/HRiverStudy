package JAVA.Java_Test.BookProjectList.BookProject_4th.DAO;


import JAVA.Java_Test.BookProjectList.BookProject_4th.API.Service;
import JAVA.Java_Test.BookProjectList.BookProject_4th.MAPPER.UserMapper;
import JAVA.Java_Test.BookProjectList.BookProject_4th.VO.User;


import java.util.HashMap;
import java.util.Map;

public class UserService implements Service {

UserMapper userMapper = new UserMapper();

    public <T> void printInfo(T user) {
       System.out.println(user.toString());
    }
    public void addUser(User user) {
        userMapper.getUserlist().put(user.getID(),user);
    }
}
