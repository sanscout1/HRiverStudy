package JAVA.Java_Lecture.About_IO.ObjectinputstreamEX;

import java.io.Serial;
import java.io.Serializable;

public class Member implements Serializable {

    // 직렬화 할 객체는 Serializable 인터페이스를 구현해놔야한다.

    @Serial
    private static final long serialVersionUID = 1000;
    // 필드 갯수가 달라도 uid 가 같다면 같은 객체로 판단하고 직렬화 할수 있다.

    String name;
    transient Integer age;  // transient 는 직렬화에서 제외 한다. ,, 이렇게 실행해보면 null 로 나온다.

    public Member(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
