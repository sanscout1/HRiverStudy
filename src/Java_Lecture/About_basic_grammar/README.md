## 간단한 문법
- #### continue
    - 블록 내부에서 continue 문이 실행되면 for 문의 증감식 또는 while 문, do-while 문의 조건식으로 바로 이동

- #### printf(“%%”) 
  - 이렇게 해야 % 출력
- #### %.0f 
  - 하면 소수점 표현안하고 출력 가능
---
- 삼항 연산자는 조건식을 평가하고, 조건식이 true이면 첫 번째 표현식을 반환하고, false이면 두 번째 표현식을 반환합니다.
    - `(조건식) ? (첫 번째 표현식) : (두 번째 표현식)`


- `System.out.println((int)(Math.random()*6)+1);` // 경우의 수에 맞게 곱하면 됌 애는 6자리 주사위
- `alt shift`를 누른 상태에서 좌클릭하면 코드를 동시에 작성할 수 있습니다.

***

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

![Untitled (1).png](https://images.velog.io/images/falling_star3/post/355cf4e6-bb4b-4722-9181-6ff48fb85d46/0_YH506ZYL1rLNKQiK_.png)


---

### for문 별명
``` 

Outter: for(){
       ~~~~~  break Outter;
}
```

- for문의 별명을 사용하면 해당 별명에 해당하는 반복문에서 break 문을 사용할 수 있습니다.


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
### for문의 다른 이용 법
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

***

### StringBuilder 이용한 예제
  - delete(startIndex,endIndex)   endIndex 앞까지 제거
  - deleteCharAt(index)   해당 인덱스 문자 제거 

---

### Arrays 
- .sort(String[])  --> 문자열 오름차순 정렬, 퀵소트 이용
- .sort(String[], comparator)  --> `Arrays.sort(s, Comparator.naturalOrder());` 오름차순 정렬
- `Arrays.sort(s, Comparator.reverseOrder());` 내림차순정렬
-  `s = Arrays.stream(s).sorted().toArray(String[]::new);` 스트림을 이용한 정렬
### array 를 intstream 처리 방법
``` 
int[] outputIntArray = {95,75,85,100,50};
outputIntArray= Arrays.stream(outputIntArray).sorted().toArray();
IntStream outputIntstream = Arrays.stream(outputIntArray);
outputIntstream.forEach(i->System.out.printf("%d ",i));
```


> https://codechacha.com/ko/java-sorting-array/

---

#### ArrayList <> (제너릭-->해당 내용물을 관리해서 저장하겠다)

---

### spilt

- `str.split("-")` 지정 문자를 기준으로 배열에 저장
- `str.split("-",3)`  배열 3개까지 만드는 제한 걸고 나눔
-  `str.split("\\.");` . 기준으로 자르기


---

### compareTo()
- 문장열을 비교하다가 차이나는 부분에 반환값을 보여줌
---

### String.format()
- `String result5 = String.format("%.1f", num);` 둘째자리 까지 반올림


----
#### hasNext()
     inputStr1 = String.format("%.2f",Double.parseDouble(inputStr1));
- while문에 sc.hasNext() 을 이용하면 입력 안들어오는 순간 안함

---


### Optional 객체 처리
- `.getAsInt()`, `getAsDouble()`

---

### String.replace(기준, 바꿀문자) 
- 우측 변수값으로 기준 값들을 바꿈
---

### LocalDate
- `lengthOfMonth() ` 지정한 달의 길이 리턴
- `	getDayOfWeek()` 그 주의 enum 값 리턴
- 달력 정보를 제공 해줌
> https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html

---

### String.matches()
- matches()는 인자로 정규표현식
- return boolean

#### 정규 표현식
1) ^ : 문자열의 시작
2) $ : 문자열의 종료
3) . : 임의의 한 문자 (문자의 종류와 관계없음)
4) | : or의 의미임
5) ? : 앞 문자가 없거나 하나 있을때
6) + : 앞 문자가 하나 이상임 (최소 한개 이상)
7) * : 앞 문자가 없을 수도 있고, 무한정 많을 수도 있음
8) [] : 문자 클래스의 지정, 문자의 집합이나 범위를 나태내면 - 기호를 사용한다. [] 내에서 ^를 사용하면 not의 의미임
9) {} : 횟수나 범위를 나타냄. 예를 들어 k{5}의 경우 k가 5번 반복되는 경우임, a{3,5}는 a가 3번 이상 5번 이하 반복되는 경우임
10) \w : 알파벳이나 숫자
11) \W : \w의 not. 즉 알파벳이나 숫자를 제외한 문자
12) \d : [0-9]와 동일
13) \D : 숫자를 제외한 모든 문자

- 기본적인 정규 표현식과 그 예를 모아보면 다음과 같습니다.
1) 숫자만 : ^[0-9]*$
2) 영문자만 : ^[a-zA-Z]*$
3) 한글만 : ^[가-힣]*$
4) 영어 & 숫자만 : ^[a-zA-Z0-9]*$
5) E-Mail : ^[a-zA-Z0-9]+@[a-zA-Z0-9]+$
6) 휴대폰 : ^01(?:0|1|[6-9]) - (?:\d{3}|\d{4}) - \d{4}$
7) 일반전화 : ^\d{2.3} - \d{3,4} - \d{4}$
8) 주민등록번호 : \d{6} \- [1-4]\d{6}
9) IP 주소 : ([0-9]{1,3}) \. ([0-9]{1,3}) \. ([0-9]{1,3}) \. ([0-9]{1,3})
   
