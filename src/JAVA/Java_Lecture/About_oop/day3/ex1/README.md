### Class 객체 내부의 필드 활용 (AddObject.java)

* Object 클래스를 활용하여, 다양한 인수를 받도록 구성한다.
* 오버로딩을 통하여 다양한 타입을 받을 수 있는 클래스 생성이 가능하다



### this를 이용한 생성자

* this() 생성자
    * 동일한 클래스 내의 서로 다른 생성자에서 오버로딩된 또 다른 생성자 하나를 호출하는 데 사용
* 생성자 체인
    * 동일한 클래스의 다른 생성자에서 하나의 생성자를 호출하는 프로세스로, 생성자는 다른 생성자에서만 호출할 수 있으므로 생성자 체인이 필요함
```
public class Chain {

Chain() {
this(10);
System.out.println("기본 생성자 Chain() 호출");
}

Chain(int x) {
this(5, 6);
System.out.println("일반 생성자 Chain(int x) 호출");
System.out.println("x의 값 : "+ x);
}

Chain(int x, int y) {
System.out.println("일반 생성자 Chain(int x, int y) 호출");
System.out.println("x와 Y 값 : "+ x +" "+ y);
}
}
```

***

### 접근제한자(modifier)

* 접근성을 설정하는 데 사용되는 키워드로 다른 클래스의 `클래스`, `생성자`, `데이터 멤버`, `메서드`의 접근을 제한함
* 정보 은닉의 캡슐화

<img src="https://github.com/sanscout1/HRiverStudy/blob/main/src/picture/modifier.png?raw=true" alt="--">



***