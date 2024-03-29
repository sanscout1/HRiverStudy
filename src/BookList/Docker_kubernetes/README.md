![img.png](docker01.png)

# 그림과 실습으로 배우는 도커 쿠버네티스


***


# 도커
- 데이터 또는 프로그램을 격리 시키는 기능
- 데이터와 프로그램을 컨테이너로 나눠 분리 사용 가능 기능 제공
- `도커엔진` 을 통해 컨테이너 생성 및 이용 가능
- `이미지` 를 통해 컨테이너 생산

## 도커 환경
- 내부적으로 리눅스
- 컨테이너에서 동작시킬 프로그램도 리눅스용

### 도커의 필요성
- 프로그램 분리 -- 서버내의 프로그램 간 영향 제거
- 프로그램 호환 문제 해결 가능

## 서버와 도커
- 도커를 이용하여 하나의 물리 서버에서 여러개의 웹 서버 생성 가능
    - 물리 서버 비용 절감
- 도커 엔진 위에서 컨테이너는 자유롭게 옮겨 사용 가능

## 도커의 구조
- 리눅스 운영체제 위에 도커엔진 , 그 위에 컨테이너 존재
- 컨테이너에 커널을 제외한 운영체제 서비스가 있고, 도커엔진 밑에 운영체제에는 커널만 존재


## 도커의 이미지
- 이미지로 컨테이너 생성, 컨테이너로 이미지 생성도 가능
- 이미지를 이용해 기존 도커엔진 컨테이너를 다른 도커엔진 위에도 생성 가능

### 도커 허브
- 허브에서 필요한 이미지를 찾아 컨테이너 이용하면 된다.

## 컨테이너 생애주기
- 생성, 실행,종료 , 폐기
- 새로운 버전으로 바꾸기 쉬운 구조 -- 업데이트가 용이
#### 도커가 설치된 물리적 서버의 디스크를 마운트해 데이터 저장할 수 있다.
- 컨테이너 폐기해도 데이터를 유지 가능

## 도커의 장점 단점
### 장점
- 독립된 환경 : 유지보수 용이
- 이미지 : 배포, 교체, 환경 이동이 쉬움
- 커널포함을 안한다 : 컨테이너가 가벼워짐
- 물리 서버에 여러 대 서버 이용 가능
- 서버 관리 용이

### 단점
- 운영체제는 리눅스만
- 물리서버 문제 발생 시 모든 서버 문제 발생

***


# 도커 설치 구조
1. 리눅스 위에 직접 설치
2. 가상머신 위에 설치
3. 데스크톱용 윈도우 도커 설치 
   - 윈도우는 hyper-v 가상환경 위에, mac 은 hyper-kit 가상환경 위에 설치
   - hyper-v 는 윈도우에 포함되 있고, hyperkit은 도커 데스크톱 페키지 안에 포함되어 있음
    - 윈도우는 wsl2 라는 리눅스 지원이 내장되어서 도커 데스크톱에서 wsl2 혹은 도커 내장 리눅스 선택지가 존제



## 도커 설치하기
1. 프로그램 --> 프로그램 및 기능 켜기 끄기 --> linux용 windows 하위시스템, 가상 머신 플랫폼 키기
2.  파워쉘 --> 
3. `dism.exe /online /enable-feature /featurename:Microsoft-Windows-Subsystem-Linux /all /norestart`
4. `dism.exe /online /enable-feature /featurename:VirtualMachinePlatform /all /norestart`
5. wsl --install
6. wsl --set-default-version 2 입력하기


# 컨테이너 실행

## 컨테이너 기본 사용 명령어
- `docker container run -d penguin --mode=1`
-  `container run` : 커맨드, 상위커맨드와 하위커맨드다 , 상위 커맨드는 대상의 종류 명시, 하위 커맨드는 어떤 행동을 할지 명시
-  `-d, --mode=1` : 옵션, -d 는 백그라운드 실행, --mode=1 은 모드 1로 실행하라는 의미
- 펭귄은 실행할 대상이다.
- docker run 만 입력해도 실행은 된다.
- `-dit` : 이렇게 입력해서 d,i,t 옵션 3개다 할 수 있다. 



