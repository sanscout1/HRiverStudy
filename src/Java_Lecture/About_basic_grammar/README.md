## 간단한 문법
- continue
    - 블록 내부에서 continue 문이 실행되면 for 문의 증감식 또는 while 문, do-while 문의 조건식으로 바로 이동

- printf(“%%”) 이렇게 해야 % 출력
- %.0f 하면 소수점 표현안하고 출력 가능

![Untitled.png](..%2F..%2F..%2F..%2F..%2F..%2FDownloads%2FUntitled.png)

- 삼항 연산자는 조건식을 평가하고, 조건식이 true이면 첫 번째 표현식을 반환하고, false이면 두 번째 표현식을 반환합니다.
    - `(조건식) ? (첫 번째 표현식) : (두 번째 표현식)`


- `System.out.println((int)(Math.random()*6)+1);` // 경우의 수에 맞게 곱하면 됌 애는 6자리 주사위
- `alt shift`를 누른 상태에서 좌클릭하면 코드를 동시에 작성할 수 있습니다.


### Switch 문

```
int numLetters = switch (day) {
    case MONDAY, FRIDAY, SUNDAY -> 6;
    case TUESDAY                -> 7;
    case THURSDAY, SATURDAY     -> 8;
    case WEDNESDAY              -> 9;
}; 
```

- 문자열을 비교할 때는 동등(==, !=) 연산자 대신 `equals()` 와 `!equals()`를 사용


---
### 논리연산자
![Untitled (1).png](..%2F..%2F..%2F..%2F..%2F..%2FDownloads%2FUntitled%20%281%29.png)

---

- for문의 별명을 사용하면 해당 별명에 해당하는 반복문에서 break 문을 사용할 수 있습니다.

![Untitled (2).png](..%2F..%2F..%2F..%2F..%2F..%2FDownloads%2FUntitled%20%282%29.png)

---

### BufferReader

```
BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 선언
String s = bf.readLine(); // String
int i = Integer.parseInt(bf.readLine());
```

- 입력은 `readLine()` 메서드를 사용하여 처리합니다. 
- 입력값이 String으로 고정되기 때문에 다른 타입의 입력을 받으려면 형변환을 해주어야 합니다.
- 또한, 예외 처리를 꼭 해주어야 합니다. `readLine()`을 사용할 때는 `try` `catch` 문으로 예외 처리를 할 수도 있지만, 일반적으로 `throws IOException`을 사용하여 처리합니다.

```
// 입력 문자열을 공백을 기준으로 나누기 위해 StringTokenizer를 사용합니다.
StringTokenizer st = new StringTokenizer(s);

// 첫 번째 호출된 토큰을 정수로 변환합니다.
int a = Integer.parseInt(st.nextToken());

// 두 번째 호출된 토큰을 정수로 변환합니다.
int b = Integer.parseInt(st.nextToken());

// 입력 문자열을 공백을 기준으로 나누어서 배열에 저장합니다.
String array[] = s.split(" ");
```

- 띄어쓰기 입력받기

---

### BufferWriter

```
// BufferedWriter를 사용하여 할당된 버퍼에 값을 넣어줍니다.
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

// 출력할 문자열
String s = "abcdefg";

// 버퍼에 있는 값 전부를 출력합니다.
bw.write(s + "\\n");

// 남아있는 데이터를 모두 출력시킵니다.
bw.flush();

// 스트림을 닫습니다.
bw.close();
```
- BufferedWriter의 경우 버퍼를 잡아놓았기 때문에 반드시 `flush()` 또는 `close()`를 호출하여 뒷처리를 해주어야 합니다. 또한, `bw.write`는 `System.out.println()`과 같이 자동 개행 기능이 없기 때문에 개행을 해주어야 할 경우에는 `\\n`를 사용하여 따로 처리해주어야 합니다.

- write()을 사용하여 출력할 내용을 담고, `flush()`을 통해서 **버퍼를 비워내는 동시에 콘솔에 출력**하면 됩니다. 주의할 점은 write()만 사용한다고 콘솔에 출력이 되는 것은 아니고, **반드시 `flush()`을 써 주어야 합니다**.


>https://hianna.tistory.com/543  reverse()
---

### 람다식

- 람다식은 함수를 하나의 식으로 표현하는 것입니다. 메소드의 이름이 필요 없기 때문에 익명 함수의 한 종류입니다.

```
public String hello() {
    return "Hello World!";
}

() -> "Hello World!";
```
- 람다식을 사용하면 메소드 이름이 필요 없으며, 괄호 ()와 화살표 `->`를 이용하여 함수를 선언할 수 있습니다.


- 람다식(Lambda Expression) 의 특징

    람다식 내에서 사용되는 지역변수는 `final`이 붙지 않아도 상수로 간주된다.
    람다식으로 선언된 변수명은 다른 변수명과 중복될 수 없다.


- 람다식(Lambda Expression) 의 장점

  코드를 간결하게 만들 수 있다.
  식에 개발자의 의도가 명확히 드러나 가독성이 높아진다.
  함수를 만드는 과정없이 한번에 처리할 수 있어 생산성이 높아진다.
  병렬프로그래밍이 용이하다.

- 람다식(Lambda Expression) 의 단점

  람다를 사용하면서 만든 무명함수는 재사용이 불가능하다.
  디버깅이 어렵다.
  람다를 남발하면 비슷한 함수가 중복 생성되어 코드가 지저분해질 수 있다.
  재귀로 만들경우에 부적합하다.



- 람다식 예제
 ``` 
//기존 문법
new Thread(new Runnable() {
   @Override
   public void run() { 
      System.out.println("Welcome Heejin blog"); 
   }
}).start();

//람다식 
new Thread(()->{  System.out.println("Welcome Heejin blog"); }).start();

```
>https://velog.io/@tsi0521/java-Lambda  

>[https://inpa.tistory.com/entry/☕-Lambda-Expression](https://inpa.tistory.com/entry/%E2%98%95-Lambda-Expression)

### 함수형 인터페이스(Functional Interface)

```
public class Lambda {
    public static void main(String[] args) {  
        // 기존의 익명함수
        System.out.println(new MyLambdaFunction() {
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        }.max(3, 5));
    }
}
------------------------------------------------------------------
@FunctionalInterface
interface MyLambdaFunction {
    int max(int a, int b);
}

public class Lambda {
    public static void main(String[] args) {
        // 람다식을 이용한 익명함수
        MyLambdaFunction lambdaFunction = (int a, int b) -> a > b ? a : b;
        System.out.println(lambdaFunction.max(3, 5));
    }
}
```

- 함수형 인터페이스를 구현하기 위해서는 인터페이스를 개발하여 그 내부에는 1개 뿐인 abstract 함수를 선언하고, 위에는 `@FunctionalInterface` 어노테이션을 붙여주면 된다.

---

### IntStream

- `IntStream.rangeClosed(0, 5).forEach(System.out::println);`
- `.filter`( i → 조건) —> 조건에 맞는 것 걸러준다
- `.rangeClosed()`     —→  end 까지 포함 범위

`List<Character> r = IntStream.range(50, 80).mapToObj(a -> (char) a).collect(Collectors.toList());`
-  mapToObj 통해 형변환 가능
---
- for문의 다른 이용 법
```
for(int i : intArray) {
System.out.println(i);
}
```

---

```
import java.util.Scanner;

public class Test {
    public static class Score {
        int[] grade = new int[100];
    }

    public static void InsertScore(Score s, int i, int grade) {
        s.grade[i] = grade;
    }

    public static int total(int a, int b, int c) {
        int total = a + b + c;
        return total;
    }
    
    public static void PrintGrade(Score s, int sum, float total, int count) {
        System.out.print("점수 : ");
        StringBuilder sb = new StringBuilder();
        for (int num : s.grade) {
            if (num > 0) {
                sb.append(num);
                sb.append(", ");
                sum += num;
                count++;
            }
        }
        System.out.println( sb.delete(sb.length() - 2, sb.length() - 1) );
        total = (float) sum / count;
        System.out.printf("총합 : %d   평균 : %.1f" , sum, total);
    }

    public static void main(String[] args) {
        Score s = new Score();
        Scanner in = new Scanner(System.in);

        int i = 0;
        int sum = 0;
        float total = 0;
        int count = 0;

        /**
         * Receiving any integer inputs.
         * Enter 0 to exit the loop.
         * size of array is set as 100.
         */
        while(i < 100) {
            int grade = in.nextInt();

            if (grade == 0) {
                break;
            } else {
                InsertScore(s, i, grade);
                i++;
            }
        }
        // Print all data
        PrintGrade(s, sum, total, count);
    }
}
```
- StringBuilder 이용한 예제

>https://itprogramming119.tistory.com/entry/JAVA-40-%EB%AC%B8%EC%9E%90%EC%97%B4%EC%97%90%EC%84%9C-%EB%B6%80%EB%B6%84-%EB%AC%B8%EC%9E%90%EC%97%B4%EC%9D%84-%EC%A0%9C%EA%B1%B0%ED%95%98%EB%8A%94-delete-%EB%A9%94%EC%86%8C%EB%93%9C-StringBuffer-%ED%81%B4%EB%9E%98%EC%8A%A4 delete() 함수

---

Arrays 문법 정리할 것
>https://www.techiedelight.com/ko/sort-array-of-strings-java/


---

- ArrayList <> (제너릭-->해당 내용물을 관리해서 저장하겠다)
---

>https://jamesdreaming.tistory.com/84 spilt 정리


---

>https://m.blog.naver.com/hyoun1202/222113488861 compareTo 정리


---

>https://velog.io/@akwnsldj1/Java-%EC%9E%90%EB%B0%94-%EC%86%8C%EC%88%98%EC%A0%90-%EB%B0%98%EC%98%AC%EB%A6%BC format()

----
#### hasNext()
     inputStr1 = String.format("%.2f",Double.parseDouble(inputStr1));
- while문에 sc.hasNext() 을 이용하면 입력 안들어오는 순간 안함

---

#### str.split("\\.");

---

> https://codechacha.com/ko/java-sorting-array/ sort 내림차순

---

> https://www.tcpschool.com/java/java_stream_optional Optional 객체 처리

---

>https://cordcat.tistory.com/64 array 를 intstream 처리 방법
``` 
int[] outputIntArray = {95,75,85,100,50};
outputIntArray= Arrays.*stream*(outputIntArray).sorted().toArray();
IntStream outputIntstream = Arrays.*stream*(outputIntArray);
outputIntstream.forEach(i->System.*out*.printf("%d ",i));
```

---

`replace() `  알아볼것

---

#### LocalDate
> https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html






