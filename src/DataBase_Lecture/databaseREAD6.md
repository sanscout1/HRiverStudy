
## 실습 1


```sql
/* 이름: demo_scott.sql*/
/* 설명 */

/* root 계정으로 접속, dept,emp 생성 */
/* MySQL Workbench에서  접속한다. */

DROP TABLE IF EXISTS BONUS;
DROP TABLE IF EXISTS EMP;
DROP TABLE IF EXISTS SALGRADE;
DROP TABLE IF EXISTS DEPT;



CREATE TABLE IF NOT EXISTS DEPT (
  deptno int(11) not null primary key,
  dname varchar(14) default null,
  loc varchar(13) default null
);


INSERT INTO DEPT (DEPTNO, DNAME, LOC) VALUES (10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO DEPT (DEPTNO, DNAME, LOC) VALUES(20, 'RESEARCH', 'DALLAS');
INSERT INTO DEPT (DEPTNO, DNAME, LOC) VALUES(30, 'SALES', 'CHICAGO');
INSERT INTO DEPT (DEPTNO, DNAME, LOC) VALUES(40, 'OPERATIONS', 'BOSTON');


CREATE TABLE IF NOT EXISTS EMP (
  empno int(11) not null primary key,
  ename varchar(10) default null,
  job varchar(9) default null,
  mgr int(11) default null,
  hiredate datetime default null,
  sal double default null,
  comm double default null,
  deptno int(11) default null,
  constraint PK_EMP foreign key(deptno) references dept(deptno) on delete cascade
);


INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7369, 'SMITH', 'CLERK', 7902, '1980-12-17 00:00:00', 800, NULL, 20);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20 00:00:00', 1600, 300, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7521, 'WARD', 'SALESMAN', 7698, '1981-02-22 00:00:00', 1250, 500, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7566, 'JONES', 'MANAGER', 7839, '1981-04-02 00:00:00', 2975, NULL, 20);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28 00:00:00', 1250, 1400, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7698, 'BLAKE', 'MANAGER', 7839, '1981-05-01 00:00:00', 2850, NULL, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7782, 'CLARK', 'MANAGER', 7839, '1981-06-09 00:00:00', 2450, NULL, 10);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7788, 'SCOTT', 'ANALYST', 7566, '1987-04-19 00:00:00', 3000, NULL, 20);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7839, 'KING', 'PRESIDENT', NULL, '1981-11-17 00:00:00', 5000, NULL, 10);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7844, 'TURNER', 'SALESMAN', 7698, '1981-09-08 00:00:00', 1500, 0, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7876, 'ADAMS', 'CLERK', 7788, '1987-05-23 00:00:00', 1100, NULL, 20);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7900, 'JAMES', 'CLERK', 7698, '1981-12-03 00:00:00', 950, NULL, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7902, 'FORD', 'ANALYST', 7566, '1981-12-03 00:00:00', 3000, NULL, 20);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7934, 'MILLER', 'CLERK', 7782, '1982-01-23 00:00:00', 1300, NULL, 10);

commit;


select * from emp;



-- 1) 사원의 이름과 직위를 출력하시오. 단, 사원의 이름은'사원이름', 직무는'직무'로 출력한다.
select ename 사원이름,job 직무 from emp ;
-- 2) 30번 부서에 근무하는 모든 사원의 이름과 급여를 출력한다. 
select ename, sal from emp where deptno=30;
-- 3) 사원번호와 이름, 현재 급여, 증가한 급여분('증가액'),10% 인상된 급여('인상된 급여＇)를사원번호순으로 출력하세요.
select empno as 사원번호,ename as 이름,sal as 급여,(sal*0.1) as '증가액',(sal*1.1) as '인상된 급여' from emp order by empno;
-- 4) 'S'로 시작하는 모든 사원과 부서번호를 출력하세요
select ename,deptno from emp where ename like 'S%';
-- 5) 모든 사원의 최대 및 최소급여, 합계 및 평균 급여를 출력하세요.열이름은 각각MAX,MIN,SUM,AVG로 한다. 단 소수점 이하는 반올림하여 정수로 출력하시오. 
select max(sal) as MAX,min(sal) as MIN, sum(sal) as SUM, round(avg(sal),0) as AVG from emp ;
-- 6) 업무 이름과 업무별로 동일한 업무를 하는 사원의 수를 출력하세요.열이름은'업무','업무별 사원수’ 출력하세요
select job as 업무,count(job) as '업무별 사원수' from emp group by job;
-- 7) 사원의 최대 급여와 최소 급여의 차액을 출력하세요
select (max(sal) - min(sal)) as '최대 최소 급여 차액' from emp;
-- 8) 30번 부서의 구성원 수와 사원들의 급여의 합계와 평균을 출력하세요
select count(empno),sum(sal),avg(sal) from emp where deptno =30;
-- 9) 평균 급여가 가장 높은 부서의 번호를 출력하세요
select deptno,avg(sal) from emp group by deptno;
select deptno from emp group by deptno having avg(sal) >= all (select avg(sal) from emp group by deptno);
-- 10) 세일즈맨(SALESMAN)을 제외하고 업무별 사원의 급여가3,000이상인 각 업무에 대해, 업무명과업무별 평균 급여를 출력하시오. 단 평균 급여는 내림차순으로 출력한다. 
select job,avg(sal) from emp where sal>= 3000 group by job having job not in ('SALESMAN') order by avg(sal) desc;
-- 11) 전체 사원 가운데 직속상관이 있는 사원의 수를 출력하시오
select count(empno) from emp where mgr is not null;
-- 12) Emp테이블에서 이름, 급여, 커미션(comm),총액(sal+comm)을 구하여 총액이 많은 순서대로출력하시오. 단, 커미션(comm)이 없는 사람은 제외한다. 
select ename,sal,comm,(sal+comm) as 총액 from emp where comm is not null and comm not in (0) order by (sal+comm) desc; 
-- 13) 부서별로 같은 업무를 하는 사람의 인원 수를 구하여 부서번호, 업무이름, 인원수를 출력하시오
select deptno, job, count(deptno) from emp group by deptno,job order by job;
-- 14) 사원이 한 명도 없는 부서의 이름을 출력하시오emp
select dname from dept left join emp on dept.deptno = emp.deptno group by dept.deptno having count(empno) = 0;
-- 15) 같은 업무를 하는 사람의 수가 4명 이상인 업무와 인원수를 출력하시오
select job,count(empno) from emp group by job having count(empno) >=4 ;
-- 16) 사원번호가 7400이상 7600이하인 사원의 이름을 출력하시오
select ename from emp where empno between 7400 and 7600;
-- 17) 사원의 이름과 사원의 부서를 출력하시오
select ename,dname from emp join dept on emp.deptno = dept.deptno;
-- 18) 사원의 이름과 팀장(mgr)의 이름을 출력하시오
select e1.ename, e2.ename from emp e1 join emp e2 where e2.empno = e1. mgr;
-- 19) 사원 SCOTT보다 급여를 많이 받는 사람의 이름을 출력하시오
select ename from emp where sal > (select sal from emp where ename = 'scott');
-- 20) 사원 SCOTT이 일하는 부서번호 혹은 DALLAS에 있는 부서번호를 출력하시오.
select emp.ename,dept.deptno from emp join dept on emp.deptno = dept.deptno where dept.deptno = (select deptno from emp where ename = 'scott') 
or loc = (select loc from dept where loc = 'dallas');
```


## 실습 2
```sql
-- 이름: demo_sinsaege_advanced.sql
-- 설명

/* root 계정으로 접속,  데이터베이스 생성, sinsaegeadmin 계정 생성 */
/* MySQL Workbench에서 초기화면에서 +를 눌러 root Connection을 만들어 접속한다. */
/* user : sinsaegeadmin, database : sinsaegebookdb */

/* 여기서부터 sinsaegeadmin 계정으로 접속 */


USE sinsaegebookdb;
-- 처음 실행시는 아래 4문장의 오류는 무시한다. 

DROP TABLE Orders;
DROP TABLE Book;
DROP TABLE Customer;
DROP TABLE Imported_Book;


CREATE TABLE Book (
  bookid		INTEGER PRIMARY KEY,
  bookname	VARCHAR(40),
  publisher	VARCHAR(40),
  price		INTEGER
);

CREATE TABLE  Customer (
  custid		INTEGER PRIMARY KEY,
  name		VARCHAR(40),
  address		VARCHAR(50),
  phone		VARCHAR(20)
);


CREATE TABLE Orders (
  orderid INTEGER PRIMARY KEY,
  custid  INTEGER,
  bookid  INTEGER,
  saleprice INTEGER,
  orderdate DATE,
  FOREIGN KEY (custid) REFERENCES Customer(custid),
  FOREIGN KEY (bookid) REFERENCES Book(bookid)
);


INSERT INTO Book VALUES(1, '축구의 역사', '굿스포츠', 7000);
INSERT INTO Book VALUES(2, '축구 아는 여자', '나무수', 13000);
INSERT INTO Book VALUES(3, '축구의 이해', '대한미디어', 22000);
INSERT INTO Book VALUES(4, '골프 바이블', '대한미디어', 35000);
INSERT INTO Book VALUES(5, '피겨 교본', '굿스포츠', 8000);
INSERT INTO Book VALUES(6, '배구 단계별기술', '굿스포츠', 6000);
INSERT INTO Book VALUES(7, '야구의 추억', '이상미디어', 20000);
INSERT INTO Book VALUES(8, '야구를 부탁해', '이상미디어', 13000);
INSERT INTO Book VALUES(9, '올림픽 이야기', '삼성당', 7500);
INSERT INTO Book VALUES(10, 'Olympic Champions', 'Pearson', 13000);

INSERT INTO Customer VALUES (1, '박지성', '영국 맨체스타', '000-5000-0001');
INSERT INTO Customer VALUES (2, '김연아', '대한민국 서울', '000-6000-0001'); 
INSERT INTO Customer VALUES (3, '김연경', '대한민국 경기도', '000-7000-0001');
INSERT INTO Customer VALUES (4, '추신수', '미국 클리블랜드', '000-8000-0001');
INSERT INTO Customer VALUES (5, '박세리', '대한민국 대전',  NULL);

INSERT INTO Orders VALUES (1, 1, 1, 6000, STR_TO_DATE('2024-07-01','%Y-%m-%d'));
INSERT INTO Orders VALUES (2, 1, 3, 21000, STR_TO_DATE('2024-07-03','%Y-%m-%d'));
INSERT INTO Orders VALUES (3, 2, 5, 8000, STR_TO_DATE('2024-07-03','%Y-%m-%d'));
INSERT INTO Orders VALUES (4, 3, 6, 6000, STR_TO_DATE('2024-07-04','%Y-%m-%d'));
INSERT INTO Orders VALUES (5, 4, 7, 20000, STR_TO_DATE('2024-07-05','%Y-%m-%d'));
INSERT INTO Orders VALUES (6, 1, 2, 12000, STR_TO_DATE('2024-07-07','%Y-%m-%d'));
INSERT INTO Orders VALUES (7, 4, 8, 13000, STR_TO_DATE( '2024-07-07','%Y-%m-%d'));
INSERT INTO Orders VALUES (8, 3, 10, 12000, STR_TO_DATE('2024-07-08','%Y-%m-%d'));
INSERT INTO Orders VALUES (9, 2, 10, 7000, STR_TO_DATE('2024-07-09','%Y-%m-%d'));
INSERT INTO Orders VALUES (10, 3, 8, 13000, STR_TO_DATE('2024-07-10','%Y-%m-%d'));

--  Imported_book 테이블
CREATE TABLE Imported_Book (
  bookid		INTEGER,
  bookname	VARCHAR(40),
  publisher	VARCHAR(40),
  price		INTEGER
);
INSERT INTO Imported_Book VALUES(21, 'Zen Golf', 'Pearson', 12000);
INSERT INTO Imported_Book VALUES(22, 'Soccer Skills', 'Human Kinetics', 15000);

COMMIT;


CREATE TABLE  Cust_addr (
   addrid integer auto_increment primary key,
   custid integer,
   address varchar(50),
   phone varchar(20),
   changeday date,
   constraint fk_cust_addr_custid foreign key (custid) references customer(custid)
);

INSERT INTO Cust_addr VALUES (null,1, '영국 에인트호번', '010-5000-0001', STR_TO_DATE('2003-07-01','%Y-%m-%d'));
INSERT INTO Cust_addr VALUES (null,1, '영국 맨체스터', '010-5000-0002', STR_TO_DATE('2005-07-01','%Y-%m-%d'));
INSERT INTO Cust_addr VALUES (null,1, '영국 에인트호번', '010-5000-0003', STR_TO_DATE('2013-07-01','%Y-%m-%d'));
INSERT INTO Cust_addr VALUES (null,1, '영국 퀸즈파크', '010-5000-0004', STR_TO_DATE('2021-07-01','%Y-%m-%d'));

commit;

CREATE TABLE Cart (
  cartid integer auto_increment primary key,
  custid integer,
  bookid integer,
  cartdate date,
  constraint fk_cart_custid foreign key (custid) references customer(custid),
  constraint fk_cart_bookid foreign key (bookid) references book(bookid)
);

INSERT INTO Cart VALUES (null, 1, 1, STR_TO_DATE('2024-07-01','%Y-%m-%d')); 
INSERT INTO Cart VALUES (null, 1, 3, STR_TO_DATE('2024-07-03','%Y-%m-%d'));
INSERT INTO Cart VALUES (null, 1, 5, STR_TO_DATE('2024-07-03','%Y-%m-%d')); 
INSERT INTO Cart VALUES (null, 1, 6, STR_TO_DATE('2024-07-04','%Y-%m-%d')); 
commit;


-- 1) Cust_addr테이블을 생성하고 제공한 스크립트를 이용하여 데이터를 입력하세요

-- 2) 고객번호 1번의 주소 변경 내역을 모두 나타내세요
select custid,address from cust_addr where custid=1;
-- 3) 고객번호 1번의 전화번호 변경 내역을 모두 나타내세요
select custid,phone from cust_addr where custid=1;
-- 4) 고객번호 1번의 가입 당시 전화번호를 나타내시오. 단, 가입당시 전화번호는 주소이력(history)중 가장 오래된 것을 찾습니다. 주소변경 이력이 없으면현재 주소를 반환합니다.
select custid,phone from cust_addr where addrid >= all(select addrid from cust_addr where custid =1);
--  5) 고객번호 1번의 '2024년 01월01일' 당시 전화번호를 나타내세요. 단, 주소 이력 중changeday 속성값이 '2024년 01월 01일'보다 오래된 첫번째 값을 찾습니다. 
-- 제일 최신 전번 출력하기로 함
select custid,phone from cust_addr where changeday >= (select changeday from cust_addr where addrid >= all(select addrid from cust_addr where custid =1));
-- 이거 문제 요구사항
select custid,phone from cust_addr where changeday <= '2024-01-01' limit 1;

-- 6) Cart 테이블을 생성하고 제공한 데이터를 입력합니다.

--  7) 고객번호 1번의 cart에 저장된 도서 중 주문한 도서를 구하세요'
select * from cart join orders on cart.custid = orders.custid and cart.bookid = orders.bookid
join book on orders.bookid = book.bookid where cart.custid=1;
select * from cart natural join orders 
join book on orders.bookid = book.bookid where cart.custid=1;
-- 8) 고객번호 1번의 cart에 저장된 도서 중 주문하지 않는 도서를 구하세요
select bookname from book left join cart  on cart.bookid = book.bookid where custid is null or custid not in (1);
-- 9) 고객번호 1번의 cart에 저장된 도서의 정가의 합을 구하세요. 
select sum(price) from book join cart on cart.bookid = book.bookid  group by cart.custid having custid =1;


```

***





