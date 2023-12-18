# OperatingSystem

## 운영체제 소개

### 운영체제 기본 정의

* 운영체제는 하드웨어를 제어하는 소프트웨어이고 유저와 하드웨어 사이에서 중계자로써 응용 프로그램의 서비스를 제공하는 소프트웨어

![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2\&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FtuQUG%2Fbtrn4r08X1y%2FKZMcbGtq9D0ytbU3yj05c1%2Fimg.png)

* 컴퓨터 위에서 항상 실행되는 하나의 프로그램
  * Kernel로도 정의
  * 하드웨어를 제어하는 소프트웨어
  * 유저와 하드웨어 사이의 중계자

### 컴퓨터 시스템의 구성

* Bootstrap 프로그램
  * bootstrap 프로그램이란 컴퓨터 전력이 들어오자마자 제일 처음에 수행되는 프로그램.
  * 운영체제를 메모리에 적재(load)하는 프로그램입니다.
* 인터럽트(Interrupt)
  * 인터럽트란 하드웨어가 작동중에 CPU에게 알려주는 신호(signal)입니다.
  * 시스템 버스(system bus)를 통해서 CPU에게 신호를 전송함으로써 어느 시간이던 하드웨어는 인터럽트를 발생시킬 수 있습니다.
*   폰 노이만 구조

    * 현재 컴퓨터의 기반이 되는 구조
    * 명령어 실행 사이클(Instruction-execution cycle)은 첫번째로 메모리에서 명령어를 인출(fetches)하고 명령어 레지스터(Instruction Register)에 명령어를 저장함
    * 명령어는 그런다음 디코딩되어 메모리에서 피연산자(처리될 데이터 그자체)를 가져올 수 있습니다. 그리고 내부 레지스터(Internal Register)에 저장됩니다.
    * 피연산자들에게서 명령어가 실행된 이후에 결과는 다시 메모리에 저장됩니다.

    ![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2\&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FonoAH%2Fbtrn0WnM8A9%2FDnUm0UK61sxFGgKN0LUQb1%2Fimg.png)

&#x20;  1\. 용량

&#x20;  2\. 접근 속도

* 저장장치 계층
  * cache와 registers는 CPU에 존재하는 작은 용량의 기억장치
  * 위로 올라갈수록 속도는 빠르지만 저장용량이 적고 아래로 내려갈수록 속도는 느리지만 저장용량이 많아지게 됩니다.
  * 캐시에는 자주 사용하는 데이터를 저장하고 registers에는 명령어나 연산에 사용될 피연산자(데이터)를 저장
  * main memory는 하드웨어 부품인 RAM

&#x20;&#x20;



* 입출력 구조
