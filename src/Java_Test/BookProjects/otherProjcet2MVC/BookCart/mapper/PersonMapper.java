package Java_Test.BookProjects.otherProjcet2MVC.BookCart.mapper;

import Java_Test.BookProjects.otherProjcet2MVC.BookCart.vo.Person;
import java.util.HashMap;
import java.util.Map;

public class PersonMapper {
    private Map<String, Person> store = new HashMap<>();

    // 회원가입
    public void save(Person person) {
        store.put(person.getId(), person);
    }

    // 사용자 조회
    public Person findById(String id) {
        return store.get(id);
    }
}
