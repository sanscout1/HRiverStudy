# Procedure
```sql
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



