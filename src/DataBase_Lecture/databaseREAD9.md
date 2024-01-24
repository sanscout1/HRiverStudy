# Procedure
```sql

 -- 제어문 종류
 -- 1. delimiter : 구문의 종류 기호를 설정
 -- 2. begin end : 프로그램 문을 블록으로 묶음 {}, 중첩 가능
 -- 3. if else end : 조건의 검사 결과에 따라 문장을 선택적으로 수행
 -- 4. loop  라벨: loop sql문 (leave , iterate) loop end; : leave 문을 만나기 전까지 반복
 -- 5. while문 : 조건이 참일 경우 while문을 수행 -- while(조건) do   sql문   end while;
 -- 6. repeat : 조건이 참일 경우 repeat의 블럭을 수행    -- repeat sql문 until(조건) end repeat
 -- 7. return : 프로시저를 종료함, 상태값을 반환 return[식]
-- while / iterate (continue 와 동일) / leave (break 와 동일)


-- 1. while <조건식> do sql 명령문  ...  end while;

-- 1부터 100까지 모두 더하는 기능
drop procedure if exists whilePrc;
drop procedure if exists whilePrc1;
drop procedure if exists whileProc2;

-- C나 JAVA의 세미콜론(;), 문법의 끝을 나타내는 역할 ,,, delimiter 명령어 뒤에 구문 문자로 사용하고자 하는 문자를 넣어주면 된다.  프로시저 안의 세미콜론(;)으로 인해 여러 명령문으로 나눠지는 것을 막고 프로시저 자체를 하나의 명령문으로 묶어주기 위해서 Delimiter 를 사용
--    delimiter $$    ~프로시저 생성 내용 end $$  delimiter ;    이렇게 사용해야 함수 구분을 한다.
delimiter $$ 	
create procedure whilePrc()
begin
		declare i int;
		declare hap int;
        set i =1;
        set hap =0;
        while(i <= 100) do
        set hap = hap+i;
        set i = i+1;
        end while;
        
        select hap;
end   $$
delimiter ; 	
-- delimiter 랑 세미콜론 띄어쓰기 필수임   희안하게 이렇게 주석을 인식 해버릴 때도 있음... 애는 잘 작동함
call whilePrc();



drop procedure if exists whilePrc1;
delimiter $$
create procedure whilePrc1()
begin
		declare i int;
		declare hap int;
        set i =1;
        set hap =0;
        
        mywhile: while(i <= 100) do
		if(i%7 =0)
			then set i = i+1;     -- 7의 배수만 제외하고 누적 합
            iterate myWhile;		-- while문의 iterate 를 사용하기위하여 mywhile 별명 지은곳으로 돌아가게 만듬
		end if;
        
        set hap = hap+i;
        if(hap > 1000) then
			leave mywhile;         -- 조건 해당하면 mywhile while문을 종료
		end if;
        
        set i = i+1;
        end while;
        
        select hap;
end   $$
delimiter ;
call whilePrc1();

-- 응용 : 1부터 1000 까지의 숫자 중에서 3배수 또는 8배수만 더하는 whileproc2 작성

drop procedure if exists whileProc2;
delimiter $$
create procedure whileproc2()
begin
	declare i int;
    declare total int;
    set i =1;
    set total = 0;
    totalwhile: while (i<=1000) do
    if( i%3=0 or i%8 =0) then
		set total = total+i;
		set i=i+1;
        iterate totalwhile;
	end if;
/*    if( i%8=0 ) then
		set total = total+i;
		set i=i+1;
        iterate totalwhile;
	end if; */
    set i=i+1;
    end while;
    
    select total;
	
end  $$
delimiter ;
call whileproc2();

-- 프로시저는 한 파일당 하나만 작성하는 습관을 들이자



-- 오류 처리 declare action handler FOR 오류조건    처리할 문장
-- action : 오류 발생 시 행동을 정의 : continue, exit 두가지 선택지. continue 선택시 제일 뒤의 '처리할 문장' 이 처리된다.
-- 오류조건 : 어떤 오류를 처리할 것인지 지정. sqlexecption, sqlwarning, not found
-- 처리할 문장 : 한문장,  begin '문장들' end 이용해서 여러 문장 가능

drop procedure if exists errorprc;
delimiter $$
create procedure errorprc()
begin
	declare continue handler for 1146 select '테이블이 없어요' as 'message';  -- 1146 이랑 sqlstate '42s02' (테이블 없을때 나오는 애)
    select * from notable;    -- notable 이란 테이블이 없어서 위에 예외 처리 문장이 나오는 것
    
end $$ delimiter ;
call errorprc();




-- 문제발생시 예외메시지 발생

use sqldb;
drop procedure if exists errorprc2;
delimiter $$
create procedure errorprc2()
begin
	-- select count(*) errors,'오류가 발생하여 작업을 취소시켰습니다.' as 'message';
    declare continue handler for SQLEXCEPTION 
    Begin
    select count(*) errors,'오류가 발생하여 작업을 취소시켰습니다.' as 'message';
    End;
    insert into usertbl values ('ssg','신세계',1990,'서울',null,null,178,current_date());
	rollback;
end $$
delimiter ;
call errorprc2();

-- 발생 에러문 출력
show errors;
show count(*) errors;
select @@error_count;


  
  
  
  -- 동적 쿼리문

  prepare myquery from 'select * from usertbl where userid = "EJW"';
  execute myquery;
  deallocate prepare myquery;


-- mytable 생성 (id auto_increment pk, mdate datetime);
create table mytable (
	 id int auto_increment primary key,
     mdate datetime );


-- curdate 변수에 날짜 함수를 이용하여 현재 날짜와 시간을 시스템으로 부터 받아 할당
set @curdate =  current_date();   -- current_timestamp();, sysdate();

-- myquery 동적 쿼리 작성, mytable 값을 매개변수 값 ? 로을 입력
prepare myquery from 'insert into mytable values(null,?)';


-- myquery 실행
 execute myquery using @curdate;
 

-- myquery 해제
deallocate prepare myquery;
-- mytable 전체 정보 조회
 select * from mytable;


```

***


## 프로시저 실습 예제 
```sql
 /*
 2024.01.24 수업
 저장 프로그램은 로직을 프로시저로 구현하여 객체형태로 사용한다.
 저장 프로그램은 일반 프로그래밍에서 사용하는 함수와 비슷한 개념이다.
 작업 순서가 정해진 독립된 프로그램 수행 단위이다.
 프로시저가 정의된 다음 MySQL(DBMS)에 저장되어 저장프로그램이라고 명칭한다.
 저장 프로그램은 저장 루틴(routine), 트리거(trigger), 이벤트(event)로 구성된다.
 저장 루틴은 프로시저(procedure) , 함수 (function) 분류된다.*/
 
 
 # 실습 1.sinsaegebookdb.Book 테이블에 한개의 투플을 삽입하는 프로시저 : insertbook.sql  

 use sinsaegebookdb;
 
drop procedure insertbook;

-- 함수처럼 매개변수 지정가능, 순서는          in 변수이름 변수타입종류

delimiter //
create procedure insertBook(IN mybookid integer, in mybookname varchar(40), in mypublisher varchar(40), in myprice integer) 
begin
	insert into book(bookid, bookname, publisher,price) values (mybookid,mybookname,mypublisher,myprice);
end //
delimiter ;
  
call insertbook(13,'스포츠 과학','과학사',25000);

select * from book where bookid = 13;
  
  
 
 
 # 실습 2.동일한 도서가 있는지 점검한 후 삽입하는 프로시저 : bookinsertupdate.sql 
 drop procedure bookinsertupdate;
 
 delimiter //
 create procedure bookinsertupdate(IN mybookid integer, in mybookname varchar(40), in mypublisher varchar(40), in myprice integer) 
 begin
 
 # 이름으로 해당 도서가 존재하는지 검사
 declare mycount integer;
 select count(*) into mycount from book where bookname like mybookname; -- mycount 변수에 값 넣는 것
 
 if mycount !=0 then
	set sql_safe_updates = 0;  -- mysql 은 safe 설정이 되어 있어 풀어주는 것
    update book set price = myprice where bookname like mybookname;  -- 가격만 업데이트 가능
else
	insert into book(bookid, bookname, publisher,price) values (mybookid,mybookname,mypublisher,myprice);
end if;
 end //
 delimiter ;
 
call bookinsertupdate (1,'축구의 역사','굿스포츠',10000);
 
call bookinsertupdate (18,'최강야구','야구나라',15000);
 
 
 

 # 실습 3. Book테이블에 저장된 도서의 평균 가격을 반환하는 프로시저 : averageprice.sql
 
 drop procedure averageprice;
 
 -- procedure 에 out 으로 하면 return 값임
 
 delimiter // 
 create procedure averageprice(out averageval integer)
 begin
	select avg(price) into averageval     -- into 하면 select 값을 변수에 넣을 수 있다.
    from book where price is not null;
 
 end //
 delimiter ;
 
 call averageprice(@myval);
 select @myval;
 
 
 
 
 
 
 /*    커서 사용 : SQL문의 실행 결과가 다중행일 경우 프로그램에서는 한 행씩 처리한다. 
 #    커서는 실행결과 테이블을 한번에 한 행씩 처리하기 위해 테이블의 행을 순서대로 가리키는 데 사용된다.      
 
 # - 커서 생성 : CURSOR 커서이름 IS 커서 정의 , DECLARE 커서이름 CURSOR FOR 
 
 # - 커서 사용 시작: OPEN 커서이름
 
 # - 행 데이터를 가져오기 : FETCH 커서 이름 INTO 변수
 
 # -커서 사용 끝냄 : CLOSE 커서이름 
 */
 
 
 
 # 실습 4. 커서를 사용하여 Orders테이블의 판매 도서에 대한 이익금을 계산하는 프로시저 : interest.sql
 #  조건 : 도서 가격이 30,000원 이상이면 이익이 10%이고, 30,000 미만이면 5% 

 # procedure 용 변수 설정 declare
 # 쿼리문은 set @변수명
 
 drop procedure interest;
 
 delimiter //
 create procedure interest()
 begin
 # 변수 선언
 declare myinterest integer default 0.0;
 declare price integer;
 declare endofrow boolean default false;

 # 커서 생성
declare interestc cursor for select saleprice from orders;
declare continue handler for not found set endofrow = true;
-- continue : 핸들러 액션, for 에러 발생시  그뒤에 문장실행
-- handler for (에러 원인)
-- set ~ 여기문장 실행 한것

open interestc;   # 커서 오픈
 cursor_loop : loop  -- loop 별명 지어주고 돌리기
	fetch interestc into price;  # 커서 loop 하면서 데이터를 fetch
    if endofrow then leave cursor_loop;
    end if;
    
    if price >= 30000 then 
		set myinterest = myinterest + price* 0.1;
    else
		set myinterest = myinterest + price * 0.05;
	end if;
 
 end loop cursor_loop;  # loop 종료
 close interestc;	# 커서 종료
 select concat ('전체 이익금액 = ' , myinterest);
 end //
 delimiter ;
 
 
 call interest();
 
 
 
 
 
 
 
 /*
   트리거 : 데이터의 변경(insert,delete,update) 문이 실행될때 자동으로 같이 실행되는 프로시저이다. 
   보통의 트리거는 데이터의 변경문이 처리되는 세 가지 시점, 실행전(BEFROE), 대신하여(INSTEAD OF), 실행 후(AFTER) 동작
   
   root 계정에서 트리거 작동에 필요한 문장을 실행 하여 야 한다. 
   SET global log_bin_trust_function_creators=ON;
   
   Book_log 테이블 생성
   (bookid_log integer, bookname_log varchar(40), publisher_log varchar(40),price__log integer) 
  
 */
 
 set global log_bin_trust_function_creators=on;  
 -- MySQL이 function, trigger 생성에 대한 제약을 강제할 수 있는 기능이다.
 -- OFF상태의 경우 , 권한이 있더라도 trigger를 생성할 수 없고, function을 생성할 수 없다.
 -- 해당 옵션이 OFF 상태일 경우, root 권한이 없는 user가 생성한 function을 일반 user가 실행할 수 없게된다
 
 /*   Book_log 테이블 생성
   (bookid_log integer, bookname_log varchar(40), publisher_log varchar(40),price__log integer) 
*/
   
create table book_log(bookid_log integer, bookname_log varchar(40), publisher_log varchar(40),price__log integer) ;

-- afterinsertbook

delimiter //
create trigger afterinsertbook after insert on book for each row
begin
	declare average integer;
    insert into book_log values(new.bookid, new.bookname, new.publisher, new.price);

end //
delimiter ;

insert into book values (20,'아시안컵 축구 우승','대한민국축구왕',25000);
  




-- 사용자 함수
/*
프로시저는 call 명령에 의해 실행되는 독립적인 프로그램
사용자 정의 함수 : select 문이나 프로시저내에서 호출되어 sql문이나 프로시저에 값을 제공하는 용도로 사용

스칼라 함수 : built-in 함수 (단일 값을 돌려주는 함수)

*/

# 1. 판매된 도서의 이익을 계산을 위해서, 각 주문 건별로 실제 판매가격인 saleprice를 입력받아 가격에 맞는 이익
# (30000이상 도서는 10% , 미만은 5%) 계산하여 반환하는 함수

delimiter //
create function fn_interest(price integer) returns integer
begin
	declare myinterest integer;
    if price >= 30000 then set myinterest = price*0.1 + price;
    else set myinterest = price*0.05 + price;
    end if;
return myinterest;
end //
delimiter ;

select custid, orderid, saleprice, fn_interest(saleprice) as interest from orders;





```





