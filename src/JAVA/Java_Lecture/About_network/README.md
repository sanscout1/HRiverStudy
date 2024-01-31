# 네트워크
- 여러 컴퓨터들을 통신 회선으로 연결한 것

### HTTP
- 하이퍼텍스트 (텍스트의 형태로 구성된 문서이며, 다른 문서나 데이터와 연결(link)되어 있어 사용자가 한 문서에서 다른 문서로 쉽게 이동할 수 있는 구조를 가지고 있습니다. 이러한 링크를 통해 사용자는 원하는 정보를 찾거나 관련 정보를 탐색할 수 있습니다)
  - html 이 하이퍼 텍스트로 만들어져 있다.

## Port

![img.png](network01.png)

- 네트워크에서 프로세스가 통신을 위해 사용하는 논리적인 엔드포인트
- 포트는 IP 주소와 함께 사용되어 네트워크 통신을 관리
- 포트는 컴퓨터 내에서 특정 프로세스를 식별


## inetaddress
- 로컬 컴퓨터의 InetAddress를 얻으려면 InetAddress.getLocalHost() 
- getByName ( ) 메소드는 DNS에서 도메인 이름으로 등록된 단 하나의 IP 주소를 가져온다.
- getAllByName() 메소드는 등록된 모든 IP 주소를 배열로 가져옴
- InetAddress 객체에서 IP 주소를 얻으려면 getHostAddress () 메소드를 호출


## TCP/ IP
- ip : 컴퓨터 네트워크에서 장치를 식별하는 데 사용되는 고유한 숫자
- tcp : 신뢰성 있는 데이터 전송을 보장하며, 데이터가 패킷으로 분할되어 네트워크를 통해 안전하게 전송 제어, 패킷단위로 저장
- http 와 같은 application 은 패킷을 묶어 세그먼트로 저장

![img.png](tcp03.png)
- Source Port : 보내는 시스템의  애플리케이션 Port
- Destination Port : 받는 시스템의 애플리케이션 Port
- sequence number : 패킷의 송신 data 일련 번호
- Acknowledgement Number : 패킷을 잘 수신 받았다는 대답


![img.png](packetstructure.png)

![img.png](tcpip01.png)
- osi 7계층

![img.png](tcpip02.png)
- 계층별 데이터 종류

![img.png](tcpip04.png)

![img.png](tcpip05.png)

<br>
<br>

- 소켓은 프로그램 간의 통신을 가능하게 하는 인터페이스, TCP/IP 프로토콜 스택과 상호 작용하여 데이터를 전송하고 수신하는 데 사용

<br>
<br>


# www.google.com 입력시 과정

- 소켓 라이브러리를 통해 데이터를 네트워크 통신 가능한 구조로 생성


### 1. HTTP 프로토콜
- http://user:password@www.cyber.co.kr:80/dir/file1.html
- user: 사용자명 (생략 가능)
- password: 패스워드 (생략 가능)
- www.google.com: 웹 서버의 도메인명 
- 80: 포트 번호 (생략 가능)
- dir/file1.html: 파일의 경로명

<br>
<br>

- HTTP 프로토콜은 클라이언트와 서버가 주고받는 메시지의 내용이나 순서를 정한 것
- `'무엇을'에 해당하는 것이 URI`
- URI(Uniform Resource Identifier)는 인터넷에서 자원을 식별하고 지칭하는 일반적인 방법
  - URL(Uniform Resource Locator): 인터넷 상에서 특정 자원의 위치를 나타내는 문자열입니다. URL은 프로토콜(예: "http://", "https://"), 호스트 이름 또는 IP 주소, 포트 번호, 자원의 경로 등으로 구성
  - URN(Uniform Resource Name): 리소스의 위치가 아니라 리소스의 이름을 나타내는 문자열입니다. URN은 리소스의 고유한 이름을 지정하며, 해당 이름을 통해 리소스에 접근할 수 있도록 합니다. 예를 들어, "urn:isbn:0451450523"은 특정 ISBN(국제 표준 도서 번호)에 대한 리소스를 가리키는 URN

<br>
<br>

### 2. 브라우저에 구글 입력시 작동 시퀀스
- 브라우저는 받은 IP 주소를 사용하여 웹 서버에 HTTP 요청을 보냅니다. 이 요청은 HTTP 프로토콜을 사용하며, 요청 메서드는 일반적으로 "GET"입니다
- 웹 서버는 브라우저로부터 받은 요청을 처리하고, 요청된 웹 페이지(구글 홈페이지)를 포함한 HTTP 응답을 생성합니다.
- 생성된 HTTP 응답은 브라우저에게 전송되고, 브라우저는 이를 받아들여 웹 페이지를 표시합니다
<br>
<br>

### http 소통은 3 way handshake 이 후에 서로간의 데이터 요청과 응답 할 때 사용된다.

<br>

![img_1.png](httpmethod.png)

### http 리퀘시트 메시지
1) request message
```agsl
<메서드><공백><URI><공백><HTTP 버전>
<필드명>:<필드값>...
<공백 행><메시지 본문>
```
- 첫 번째 행은 request line으로, 위의 request에 대한 대략적인 정보들이 담겨있는 행
- 공백까지는 header로, 한 행마다 한 개의 헤더 필드를 작성
- 마지막 부분은 message body로, 클라이언트에서 서버에 송신하는 데이터

2) response message
```agsl
<HTTP 버전><공백><상태 코드><공백><응답 문구>
<필드명>:<필드값>...
<공백 행><메시지 본문>
```
- 첫 번째 행은 status line으로, 응답 코드에 대한 내용
- 공백까지는 마찬가지로 메시지 헤더고, 마지막 부분은 바디값으로 서버에서 클라이언트로 송신하는 데이터


<br>
<br>


### 3. 클라이언트 서버간 tcp 연결

![img.png](tcpip07.png)
- #### 3 way handshake : TCP의 연결을 초기화 할 때 사용

  1. 클라이언트가 연결요청 메시지(SYN)을 전송합니다. 클라이언트는 Synchronize Sequence Number(SYN)라는 임의의 랜덤 숫자를 함께 전송
  2. 서버가 요청을 수락하며, 클라이언트에게도 들리냐는 연결요청 메시지를 전송합니다. 그 메시지에는 Acknowledgement number(ACK)를 포함하고 있으며, 이 번호는 받은 Synchronize Sequence Number(SYN)보다 +1한 값을 가집니다
  3. 클라이언트가 그 질문이 잘들린다고 Acknowledgement number(ACK)에 받은 Sequence number +1해서 전송


<br>
<br>

![img.png](tcpip08.png)
- #### 4-Way handshake : 세션을 종료하기 위해 수행되는 절차
  1. 클라이언트가 연결을 종료하겠다는 FIN플래그를 전송한다. 이때 A클라이언트는  `FIN-WAIT` 상태가 된다.
  2. 서버는 FIN플래그를 받고, 일단 확인메시지 ACK 보내고 자신의 통신이 끝날때까지 기다리는데 이 상태가 B서버의 `CLOSE_WAIT`상태
  3. 서버는 연결을 종료할 준비가 되면, 연결해지를 위한 준비가 되었음을 알리기 위해  클라이언트에게 FIN플래그를 전송한다. 이때 B서버의 상태는 `LAST-ACK`
  4. 클라이언트는 해지준비가 되었다는 ACK를 확인했다는 메시지를 보낸다. A클라이언트의 상태가 `FIN-WAIT ->TIME-WAIT` 으로 변경


<br>
<br>

### 4. DNS

![img_1.png](tcpip06.png)

- 가장 가까운 local DNS 서버에게 물어보고 -> 가장 가까운 DNS 서버는 루트 도메인이 등록되어 있기 때문
- 루트 도메인으로부터 받은 조회 메지를 전송한다. 이때, 루트 도메인이 www.google.com에서 .com 도메인의 DNS 서버의 IP 주소를 반송하고, 또 다시 가장 가까운 DNS 서버는 com 도메인의 DNS 서버에게 또 다시 메시지를 보낸다
- root nameserver -> top level domain nameserver (com,org ...) -> second-level domain (authoritative nameserver) (google)

<br>
<br>


<br>
<br>



