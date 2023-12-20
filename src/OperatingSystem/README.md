# OperatingSystem

## 운영체제 소개

### 운영체제 기본 정의

- 운영체제는 하드웨어를 제어하는 소프트웨어이고 유저와 하드웨어 사이에서 중계자로써 응용 프로그램의 서비스를 제공하는 소프트웨어

<br>
    
<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FtuQUG%2Fbtrn4r08X1y%2FKZMcbGtq9D0ytbU3yj05c1%2Fimg.png" width="60%"/>
    
- 컴퓨터 위에서 항상 실행되는 하나의 프로그램
    - Kernel로도 정의
    - 하드웨어를 제어하는 소프트웨어
    - 유저와 하드웨어 사이의 중계자

### 컴퓨터 시스템의 구성
- Bootstrap 프로그램
  - bootstrap 프로그램이란 컴퓨터 전력이 들어오자마자 제일 처음에 수행되는 프로그램.
  - 운영체제를 메모리에 적재(load)하는 프로그램입니다.
- 인터럽트(Interrupt)
  - 인터럽트란 하드웨어가 작동중에 CPU에게 알려주는 신호(signal)입니다.
  - 시스템 버스(system bus)를 통해서 CPU에게 신호를 전송함으로써 어느 시간이던 하드웨어는 인터럽트를 발생시킬 수 있습니다.

- 폰 노이만 구조

    -  현재 컴퓨터의 기반이 되는 구조
  
    1. 명령어 실행 사이클(Instruction-execution cycle)은 첫번째로 메모리에서 명령어를 인출(fetches)하고 명령어 레지스터(Instruction Register)에 명령어를 저장함
  2. 명령어는 그런다음 디코딩되어 메모리에서 피연산자(처리될 데이터 그자체)를 가져올 수 있습니다. 그리고 내부 레지스터(Internal Register)에 저장됩니다.
  3. 피연산자들에게서 명령어가 실행된 이후에 결과는 다시 메모리에 저장됩니다.
  
<br>

  <img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FonoAH%2Fbtrn0WnM8A9%2FDnUm0UK61sxFGgKN0LUQb1%2Fimg.png" width="60%"/>

- 저장장치 계층

  1. 용량
  2. 접근 속도
  
    - 위로 올라갈수록 속도는 빠르지만 저장용량이 적고 아래로 내려갈수록 속도는 느리지만 저장용량이 많아지게 됩니다.
    - cache와 registers는 CPU에 존재하는 작은 용량의 기억장치
    - 캐시에는 자주 사용하는 데이터를 저장하고 registers에는 명령어나 연산에 사용될 피연산자(데이터)를 저장
    - main memory는 하드웨어 부품인 RAM
  

- 입출력 구조

<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2F6NUiO%2Fbtrn0X72r48%2FWCThtY1UgqoKiMEtWKKZe1%2Fimg.png" width="60%">

    - CPU는 디바이스(키보드, 모니터 등)에게 입출력을 요청합니다.
    - CPU와 디바이스는 서로 데이터를 통신합니다.
    - 디바이스에서 CPU에게 인터럽트를 전송할 수 있습니다.
    - CPU는 메모리로부터 명령어를 인출하고 실행하여 결과를 다시 메모리에 적재할 수 있습니다.
    - 디바이스와 메모리는 DMA(Direct Memory Access)라는 것을 할 수 있습니다.

- DMA(Direct Memory Access)
  - 하드웨어(HDD, 그래픽 카드 등)들이 메모리에 직접 접근하여 읽거나 쓸 수 있도록 하는 기능
  -  CPU의 개입이 없습니다.
  -  CPU가 해야할 주변장치와의 전송을 DMA 장치가 대신 해줍니다. CPU의 효율을 향상

---

### 컴퓨터 시스템 구조

 - #### 컴퓨터 시스템 부품 정의
    - CPU : 명령어들을 실행시키는 하드웨어, 프로세서의 종류 중 하나
    - Processor : 1개의 이상의 CPU가 포함된 물리적인 칩
    - Core : CPU의 각종 연산을 수행하는 핵심 요소
    - Multicore : 같은 CPU 위에 여러개의 계산용 코어가 포함되어 있는 것
    - Multiprocessor : 프로세서가 여러개 인것

   
- 대칭형 다중 처리(Symmetric Multiprocessing, SMP)
  - 각각의 CPU 프로세서가 모든 작업을 수행하는 가장 일반적인 다중 프로세서 시스템
- 멀티 코어 설계
  - 같은 하나의 물리적인 CPU칩 안에 여러개의 코어들이 포함됨

### 운영체제 연산들

- #### 멀티프로그래밍
  - 메모리에 여러 개의 응용 프로그램을 적재하는 것
  - CPU가 하나의 프로그램이 대기중일때 다른 프로그램을 수행시켜 효율을 극대화
  - 프로그램이란 명령어의 집합

- #### 멀티태스킹=멀티프로세싱(Multitasking=Multiprocessing)
  - 프로그램들을 동시에 사용할 수 있게 하는 기술을 멀티프로세싱
  - CPU가 동시에 수행되는 것처럼 빈번하게 프로그램들을 교체
  - 운영체제가 다음에 CPU의 의해 실행될 프로그램을 고르는 것을 `CPU 스케줄링`
- #### 운영체제 연산의 2가지 모드
  1. 유저모드
     - 사용자가 접근할 수 있는 영역을 제한적
     - 코드를 작성하고, 프로세스를 실행하는 등의 행동을 할 수 있음
  2. 커널모드
     - 잘못된 프로그램으로 인해 다른 프로그램이 잘못 실행되지 않도록 하기 위해 사용되는 모드
     - 모든 자원(드라이버, 메모리, CPU 등)에 접근, 명령을 할 수 있음

<img src="https://github.com/sanscout1/HRiverStudy/tree/main/src/picture/kernel01.png" width="60%">

### 가상화

- 컴퓨터 하드웨어 위에서 여러개의 다른 운영체제를 실행하는 기술

<img src="https://github.com/sanscout1/HRiverStudy/tree/main/src/picture/VMM01.png" width="60%">


---

## 운영체제 구조

### 1. 운영체제 제공 서비스

- 유저 인터페이스(User Interface)
- 프로그램의 실행(Program execution)
- 입출력 연산(I/O operation)
- 파일 시스템 조작(File-system manipulation)
- 에러 탐색(Error detection)
- 자원 할당(Resource allocation)
- 로깅(Logging)
- 보호 및 보안(Protection and security)

### 2. 유저와 운영체제간의 인터페이스
- CLI(Command Line Interface) : 쉘(shells)로 알려진 sh, bash, csh, tcsh, zsh 등이 존재함
- GUI(Graphical User Interface) : Windows, MacOS 등
- Touch-Screen Interface : Android UI, iPhone UI 등

### 3. 시스템 콜
- System Calls이란 응용 프로그램이 운영체제와 통신하기 위한 방법
- read 함수를 통해서 시스템 콜을 호출하고 커널 모드로 들어가서 파일을 읽을 수 있습니다.

<img src="https://github.com/sanscout1/HRiverStudy/tree/main/src/picture/SystemCall01.png" width="60%">

---

## 프로세스

### 1. 프로세스의 개념
- #### 프로세스란?
    - 프로세스는 운영체제에서 작업 단위
    - 실행중인 프로그램 (필요 자원)
        - CPU의 점유
        - 메모리(memory)
        - 파일(files)
        - 입/출력 장치(I/O devices)
- #### 프로세스의 구조
  - Text Section : 실행가능한 코드를 저장하는 공간
  - Data Section : 전역 변수를 저장하는 공간
  - Heap Section : 프로그램 실행동안 동적으로 할당되는 변수가 저장되는 공간
  - Stack Section : 함수가 실행되는 동안 지역변수가 저장되는 임시 공간, 대표적으로 함수 매개변수, 리턴 주소, 지역 변수 등이 포함됨

<img src="https://github.com/sanscout1/HRiverStudy/tree/main/src/picture/processMemory01.png" width="60%">


