# SQL 심화

## mysql 데이터 형식
1) 숫자 
    - SMALLINT (2)
    - INT (4)
    - BIGINT (8)
    - FLOAT(4)  -- 소수점 아래 7자리
    - DOUBLE(8) -- 소수점 15자리
    - DECIMAL(m,d) -- m: 전체자릿수 , d: 소수점 이하 자리수
   
2) 문자
    - CHAR(n) , CHAR(1) , CHARACTER : 고정길이
    - VARCHAR(1~65535) : 가변길이
    - TEXT 형식
      - TINYTEXT 1~255 : TEXT 데이터 값
      - TEXT 1~65535
      - LONGTEXT 4G 까지 저장 가능
    - ENUM() 열거형 데이터 값
    - BLOB 형식 - 사진, 동영상파일, 대용량의 글자를 저장하기 위한 데이터타입
    - SET 
3) 날짜/시간
    - 