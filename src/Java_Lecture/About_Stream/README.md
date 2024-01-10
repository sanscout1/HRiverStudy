# 스트림

## 스트림이란?
- 데이터의 흐름 (stream)
- 데이터가 여러개가 있어야 흐름을 만들 수 있다.
- 스트림 데이터 종류 : 컬렉션 : list.stream 혹은 stream(list) , 배열 : Arrays.stream(배열)
- 스트림 데이터는 데이터 소스로 부터 추출한 연속적인 데이터
- 스트림 API : 연속적인 데이터의 흐름을 반복적으로 또는 연산하여 처리하는 기능 (map, reduce, filter, sort)

### 스트림 인터페이스
![img.png](../../picture/stream01.png)

### 스트림 특징
- 스트림 연산은 기존 자료를 변경하지 않는다.
- 스트림 연산은 중간 연산과 최종연산 구분
- 한 번 생성하고 사용한 스트림은 재사용할 수 없다.

#### iterartor 차이점
- 내부 반복자여서 빠르고, 병렬처리 효율적
- 람다식으로 다양한 요소 처리 정의
- 중간처리와 최종 처리를 수행하도록 파이프 라인을 형성

![img.png](../../picture/iterartorvsStream.png)

## 중간 연산, 최종 연산
### 중간 연산
- .filter() : 조건에 맞는 요소 추출
- .map() : 조건에 맞는 요소 변환  ,, Stream으로 return해준다.
- .sorted() : 정렬
### 최종 연산
- 스트림의 자료를 소모하면서 연산을 수행한다.
- 최종 연산 이후에 스트림은 더 이상 다른 연산을 적용할 수 없다.
- .foreach() : 요소를 하나씩 꺼내옴  ,, 요소 하나씩 처리 가능 return이 void 여서 다른 메서드를 이용하는 것은 가능! 대표적으로 list.add
- .count() : 요소 개수
- .sum()
- .average() <br>
<br>
<br>
<br>


[**기본 예제 코드**](StreamEx01.java)

[**문자열 스트림 코드**](StreamEx04.java)

[**map, .of 코드**](StreamEx05.java)

[**reduce 코드**](StreamEx06.java)

[**이중map 예제**](StreamExFromLamda01.java)

[**병렬스트림**](StreamPack02%2FParallelStreamEx01.java)

[**객체를 활용한 스트림**](StreamPack02%2Fproduct%2FProductStreamEx.java)

[**파일스트림**](StreamFile.java)