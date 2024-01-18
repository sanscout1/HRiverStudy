# 릴레이션 연산
##  조인 문법

![img.png](db10000.png)


```sql
-- sinsaegebookdb
-- customer, orders 테이블을 합체,
-- 조인인란 한테이블의 행을 다른 테이블의 행에 연결하여 두 개 이상의 테이블을 결합하는 연산
select count(*) from customer;
select count(*) from orders;
select * from customer, orders;
select count(*) from customer,orders;

-- 고객과 고객의 주문에 관한 데이터 보기
-- where 조건에 따라 검색, 동등조인 : 동등 조건에 의해 테이블 조인
select * from customer, orders,book where customer.custid = orders.custid and orders.bookid = book.bookid;
-- 고객과 고객의 주문에 관해 고객번호순으로 정렬
select * from customer c, orders o where c.custid = o.custid order by c.custid;

-- 고객의 이름과 고객이 주문한 도서의 판매가격을 검색하시오
select name,saleprice from customer,orders where customer.custid = orders.custid;

-- 고객별로 주문한 모든 도서의 총 판매액을 구하고, 고객별로 정렬하시오.
select name,sum(saleprice) from customer,orders where customer.custid = orders.custid group by customer.name order by customer.name;


-- 고객의 이름과 고객이 주문한 도서의 이름을 구하시오.
select name,bookname from customer,orders,book where customer.custid = orders.custid and orders.bookid = book.bookid;

-- 가격이 20,000원인 도서를 주문한 고객의 이름과 도서의 이름을 구하시오.
select name,bookname from customer,orders,book 
where customer.custid = orders.custid and orders.bookid = book.bookid and book.price = 20000;

select * from customer,orders,book;
select * from customer;
select * from orders;
select * from book;

-- 외부 조인
-- 도서를 구매하지 않은 고객을 포함하여 고객의 이름과 고객이 주문한 도서의 판매가격을구하시오.
select c.name, o.saleprice from customer c left outer join orders o on c.custid = o.custid;

select c.name, o.saleprice from customer c right outer join orders o on c.custid = o.custid;

-- 가장 비싼 도서의 이름을 보이시오.
select bookname from book where price =(select max(price) from book);
select bookname from book where price >= all (select price from book);

-- 도서를 구매한 적이 있는 고객의 이름을 검색하시오.
select name from customer where custid = any (select custid from orders);
select name from customer where custid in (select custid from orders);
select name from customer, orders where customer.custid = orders.custid group by customer.custid;

-- 대한미디어에서 출판한 도서를 구매한 고객의 이름을 보이시오.
select name from customer where custid in (select custid from orders where bookid in (select bookid from book where publisher ='대한미디어'));
select name from customer,orders,book where customer.custid= orders.custid and orders.bookid = book.bookid and publisher = '대한미디어';

-- 출판사별로 출판사의 평균 도서 가격보다 비싼 도서를 구하시오.   상관 부속 질의
select publisher,bookname,price from book b1
 where b1.price > (select avg(b2.price) from book b2 where b1.publisher = b2.publisher);

-- 대한민국에서 거주하는 고객의 이름과        도서를 주문한 고객의 이름을 보이시오.  중복 배제한다.
select name from customer where address like '대한민국%'
union
select name from customer where custid in ( select custid from orders);

-- 중복 허용 all
select name from customer where address like '대한민국%'
union all
select name from customer where custid in ( select custid from orders);

-- oracle dbms 에서는 minus, intersect(교집합) 지원함 하지만 mysql은 지원안함
-- not in (차집합) 과 in (교집합) 을 활용함


-- 대한민국에서 거주하는 고객의 이름에서 도서를 주문한 고객의 이름 빼고 보이시오
select name from customer where address like '대한민국%';  -- 3명 존재함
-- 차집합
select name from customer where address like '대한민국%' 
and name not in (select name from customer where custid in (select custid from orders));


-- 대한민국 에 거주하는 고객 중 도서를 주문한 고객을 조회    교집합
select name from customer where address like '대한민국%' 
and name  in (select name from customer where custid in (select custid from orders));


-- 도서를 주문한 고객의 이름을 찾으려면 고객 중 orders 테이블에 고객번호가 있으면 도서를 주문환 회원임 
-- 주문이 있는 고객의 이름과 주소를 조회하세요
select name,address from customer where exists (select custid from orders where customer.custid = orders.custid);  -- if문처럼 있는지 true 따지는거 같음
select name,address from customer where custid in (select custid from orders);



```
***
### 퀴즈 1
```sql
-- 1. 모든 도서의 이름과 가격을 검색하세요
select bookname,price from book;
-- 2. 모든 도서의 도서번호, 도서이름, 출판사 , 가격을 검색하세요
select * from book;
-- 3. 도서 테이블에 있는 모든 출판사를 검색하시오.
select publisher from book group by publisher;
-- 4. 가격이 20,000원 미만인 도서를 검색하시오
select bookname from book where price < 20000; 
-- 5. 가겨이 10,000원 이상 20,000원 이하인 도서를 검색하시오 
select bookname from book where price between 10000 and 20000;
-- 6. 출판사가 '굿스포츠' 혹은 '대한미디어'인 도서를 검색하시오
select bookname,publisher from book where publisher in('굿스포츠','대한미디어');
-- 7. '축구의 역사'를 출간한 출판사를 검색하시오
select publisher from book where bookname = '축구의 역사';
-- 8. 도서이름의 왼쪽에서 4번째 위치에 '바'라는 문자열을 갖는 도서를 검색하시오
select bookname from book where bookname like '___바%';
-- 9. 도서 이름에 '축구'가 포함된 출판사를 검색하시오
select bookname,publisher from book where bookname like '%축구%';
-- 10. 도서를 이름순으로 검색하시오
select * from book order by bookname;
-- 11. 도서를 가격순으로 검색하고, 가격이 같으면 이름순으로 검색하시오
select * from book order by price,bookname;
-- 12. 도서를 가격의 내림차순으로 검색하시오. 가격이 같다면 출판사를 오름차순으로 출력하시오
select * from book order by price desc, publisher;
-- 13. 고객이 주문한 도서의 총판매액을 구하시오.
select sum(saleprice) from orders;
-- 14. 2번 김연아 고객이 주문한 도서의 '총 판매액'을 출력하시오.(출력시 총 판매액으로 컬럼명 표시)
select * from orders;
select * from customer;
select sum(saleprice) '총 판매액' from orders where custid=2;
-- 15. 고객이 주문한 도서의 총판매액, 평균값, 최저가를 구하시오. (출력시 각 필드명을 제시한 필드명으로 표시)
select sum(saleprice) as 총판매액, avg(saleprice) as 평균값, min(saleprice) as 최저가 from orders;
-- 16. 서점의 도서 판매 건수를 구하시오.
select count(orderid) from orders;
-- 17. 가격이 8,000원 이상인 도서를 구매한 고객에 대하여 고객별 주문 도서의 총수량을 구하시오.
-- 단, 2권 이상일 경우만 출력하시오.
select custid,count(orderid) from orders where saleprice >= 8000 group by custid having count(orderid) >=2;
-- 18. 가장 비싼 도서의 이름을 검색하시오 
select bookname,price from book where price >= all(select price from book);
-- 19. 도서를 구매한 적이 있는 고객의 이름을 검색하시오

select custid ,name from customer where custid = any(select custid from orders group by custid);
-- 20. '대한 미디어'에서 출판한 도서를 구매한 고객의 이름을 나타내시오
select bookid from book where publisher='대한미디어';
select custid from orders where bookid = any(select bookid from book where publisher='대한미디어');
select custid ,name from customer where custid = any(select custid from orders where bookid = any(select bookid from book where publisher='대한미디어') );

/* 21 . 다음과 같은 속성을 가진 NewBook 테이블을 생성하시오
       - bookid  integer 
       - bookname(도서이름)  varchar(20)
       - publisher  varchar(20)
       - price   integer 
      제약 조건) 
         price에 값이 입력되지 않을 경우 기본값은 10000 을 저장한다.
         또, 가격은 최소 1,000원 이상으로 한다.
         */
create table NewBook (
bookid integer, bookname varchar(20), publisher varchar(20), price integer default 10000, check (price>=1000));
/* 22 . 다음과 같은 속성을 가진 NewBook1 테이블을 생성하시오
       - bookname(도서이름)  varchar(20)
       - publisher  varchar(20)
       - price   integer 
      제약 조건) 
      1. bookname 은 null을 가질 수 없고,
         publisher 에는 같은 값이 있으면 안된다.  
         price에 값이 입력되지 않을 경우 기본값은 10000 을 저장한다.
         또, 가격은 최소 1,000원 이상으로 한다.
         */
         
create table NewBook1 (
      bookname  varchar(20) not null,
	publisher varchar(20) unique  ,
       price   integer default 10000,
       check (price>=1000));
/* 22.  다음과 같은 속성을 가진 NewCustomer 테이블을 생성하시오
       - custid  integer , 기본키
       - name  varchar(40)
       - address  varchar(40)
       - phone   varchar(30) 
       */
create table NewCustomer (
custid  integer primary key, 
name  varchar(40),
address  varchar(40),
phone   varchar(30) );
      
         
/* 23.  다음과 같은 속성을 가진 NewOrders 테이블을 생성하시오
       - ordertid  integer , 기본키
       - custid  integer, not null 제약조건, 외래키 연새 삭제 (NewCustomer.custid)
       - bookid  integer, not null 제약조건 
       - saleprice  integer
       - orderdate  date 
       */
       
create table NewOrders (
ordertid  integer primary key, 
custid  integer not null, 
bookid  integer not null  ,
saleprice  integer,
orderdate  date ,
 foreign key (custid) references NewCustomer.custid on delete cascade);
 
-- 24 . NewBook 테이블에 varchar(13) 자료형의 isbn 속성을 추가하시오
alter Table newbook add isbn varchar(13);

-- 25. NewBook 테이블에서 isbn 속성의 데이터 타입을 integer 형으로 변경하세요
alter table newbook modify isbn integer;

-- 26. NewBook테이블의 inbn 속성을 삭제하세요
alter table newbook drop column isbn;
-- 27. NewBook 테이블의 bookname 속성에 not null 제약조건을 적용하세요.
alter table newbook modify bookid integer not null;
-- 28. NewBook 테이블의 bookid 속성을 기본키로 변경하세요 
alter table newbook add primary key(bookid);
-- 29. NewBook1 테이블을 삭제하세요 
drop table newbook1;
-- 30. NewCustomer 테이블을 삭제하세요. 
drop table newcustomer;
  --   만약 삭제가 거절된다면 원인을 쓰고, 관련된 테이블을 함께 삭제하세요 
  -- 자식인 NewOrders 가 있어서 삭제 안됨
drop table neworders;
drop table newcustomer; 




-- insert into book(bookid,bookname,publisher,price) values (11,'스포츠 의학','한술의학',7000);
-- insert into book(bookid,bookname,publisher) values (11,'스포츠 의학','한술의학');
-- insert into book(bookid,bookname,publisher,price) select bookid,bookname,publisher,price from imported_book;

-- safe updates 옵션 미 해제시 실행
set sql_safe_updates =0;

update customer set address ='대한민국 부산' where custid=5;
  
  delete from book where bookid = 11;
  truncate book;
  delete from book;
  
  



```


***
### 퀴즈 2
```sql
-- 데이터 1
use sqldb;

create table stdTbl ( stdName varchar(10) not null primary key,
                      addr char(4) not null );
                      
                      
create table clubtbl ( clubName varchar(10) not null primary key,
                      roomNo char(4) not null );


create table stdclubTbl ( 
             num int auto_increment NOT NULL primary key,
             stdName varchar(10) not null,
			 clubName varchar(10) not null,
			 foreign key(stdName) references stdtbl(stdName),
			 foreign key(clubName) references clubtbl(clubName));
             

insert into stdtbl values ('김범수','경남'),('성시경','서울'),('이효리','제주'),('BTS 진','서울'),('블랙핑크 제니','경북');

insert into clubtbl values ('수영','101호'),('바둑','102호'),('축구','103호'),('노래','104호'),('춤','105호');

insert into stdclubtbl values (null,'김범수','바둑'),(null,'김범수','축구'),(null,'이효리','춤'),(null,'BTS 진','노래'),(null,'블랙핑크 제니','노래'),(null,'블랙핑크 제니','춤');
            
```
```sql
-- 데이터 2
USE sqldb;
CREATE TABLE empTbl(emp CHAR(3), manager CHAR(3), empTel VARCHAR(8));

INSERT INTO empTbl VALUES('나사장',NULL,'0000'),('김재무','나사장','2222'),('김부장','김재무','2222-1'),('이부장','김재무','2222-2'),('우대리','이부장','2222-2-1'),
('지사원','이부장','2222-2-2'),('이영업','나사장','1111'),('한과장','이영업','1111-1'),('최정보','나사장','3333'),('윤차장','최정보','3333-1'),('이주임','윤차장','3333-1-1');
```

```sql
-- JOIN 연습문제
use sqldb;
-- empTbl.sql 을 실행하세요. 각 튜플의 내용을 확인하고 1~5 번까지 작성하세요 

-- 1. 구매 테이블에서 아이디가 'JYP'를 가진 사람이 구매한 물건을 발송하기 위해 이름/주소/연락처를 조회하시오.
select * from buytbl;
select * from usertbl;

select name 이름,addr 주소,concat(mobile1,mobile2) 연락처 from usertbl, buytbl where usertbl.userid = buytbl.userid and usertbl.userid = 'JYP';
select name,addr,concat(mobile1,mobile2) from usertbl join buytbl on usertbl.userid = buytbl.userid and usertbl.userid = 'JYP';
-- 2. 전체 회원들이 구매한 목록 모두를 아이디 순으로 출력하세요
select * from buytbl order by userid;

-- 3. 전체 회원의 구매기록을 조회하시오. 단, 구매 기록이 없는 회원도 출력하세요
select * from  usertbl left outer  join buytbl  on  buytbl.userid = usertbl.userID order by usertbl.userid; 

-- 4. 한번 도 구매한 적이 없는 회원의 아이디, 이름, 주소 , 연락처를 조회하세요 
select userid,name,addr,concat(mobile1,mobile2) from usertbl where userid not in (select userid from buytbl);

-- 5. 우대리 상관의 연락처를 조회하세요 
select * from emptbl;
desc emptbl;
select emptel from emptbl e1 where e1.emp = (select manager from emptbl e2 where  e2.emp='우대리');

select A.emp as '부하직원', B.emp as '매니저', B.empTel as '매니저 연락처'   -- 셀프조인
from empTbl A join empTbl B on A.manager = B.emp where A.emp = '우대리';
-- 
select * from empTbl A join empTbl B on A.manager = B.emp;

-- usertbl 사용
-- 6. usertbl에서 사용자를 조회하되 전화번호가 없는 사람을 제외하여 조회하세요 
select * from usertbl;
select * from usertbl where mobile2 is not null;

select u1.* from usertbl u1 join usertbl u2 
on u1.userid = u2.userid where (u1.mobile1 is not null);

-- 7. usertbl에서 전화가 없는 사람만 조회하세요 
select * from usertbl where mobile2 is null;

select u1.* from usertbl u1 join usertbl u2 
on u1.userid = u2.userid where (u1.mobile1 is  null);


-- stdclub.sql 을 실행하고 각 튜플의 내용을 확인 하고 문제르 푸세요

-- 8.  학생 테이블, 동아리 테이블, 학생동아리 테이블을 이용해서 학생을 기준으로 학생 이름/ 지역/가입한 동아리/동아리 방 을 조회하세요
select * from stdTbl;
select * from clubtbl;
select * from stdclubTbl;

select stdtbl.stdname,addr,clubtbl.clubname,roomno 
from stdtbl,stdclubtbl,clubtbl 
where stdTbl.stdname = stdclubtbl.stdname and stdclubtbl.clubName = clubtbl.clubName;

-- 9.  동아리를 기준으로 가입한 학생의 목록을 조회하세요
select stdname,clubname from stdclubtbl order by clubname;
select stdname,clubname from stdclubtbl where stdname in (select stdname from stdtbl);

-- 10. 동아리에 가입되지 않은 학생의 이름도 포함하여 학생의 이름/주소/동아리명/동아리 방 조회하세요
select stdtbl.stdname,addr,clubtbl.clubname,roomno from (stdclubtbl right outer join stdTBl on stdclubtbl.stdName = stdtbl.stdName)
left outer join clubtbl on stdclubtbl.clubName=clubtbl.clubname;

select * from stdclubtbl right outer join stdTBl on stdclubtbl.stdName = stdtbl.stdName;

-- 11. 동아리를 기준으로 가입된 학생을 출력하되, 가입학생이 하나도 없는 동아리도   (이름/주소/동아리명/동아리 방) 조회하세요 .   주소 어떻게?
select stdclubtbl.stdname,addr,clubtbl.clubname,roomno from (stdclubtbl right outer join stdTBl on stdclubtbl.stdName = stdtbl.stdName)
right outer join clubtbl on stdclubtbl.clubName=clubtbl.clubname;
select stdclubtbl.stdname,addr,clubtbl.clubname,roomno from (stdclubtbl left outer join stdTBl on stdclubtbl.stdName = stdtbl.stdName)
right outer join clubtbl on stdclubtbl.clubName=clubtbl.clubname;

-- 12. 동아리에 가입하지 않은 학생도 출력하고, 학생이 한 명도 없는 동아리도 조회 하세요.
select stdtbl.stdname,addr,clubtbl.clubname,roomno from (stdclubtbl right outer join stdTBl on stdclubtbl.stdName = stdtbl.stdName)
left outer join clubtbl on stdclubtbl.clubName=clubtbl.clubname
union
select stdclubtbl.stdname,addr,clubtbl.clubname,roomno from (stdclubtbl right outer join stdTBl on stdclubtbl.stdName = stdtbl.stdName)
right outer join clubtbl on stdclubtbl.clubName=clubtbl.clubname;

```




