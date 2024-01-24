
## 프로그래머스 datbase 실습 문제

### [`select 1번`](https://school.programmers.co.kr/learn/courses/30/lessons/151136)
```
SELECT FLOOR(AVG(DAILY_FEE)) AS AVERAGE_FEE
FROM CAR_RENTAL_COMPANY_CAR WHERE CAR_TYPE = 'SUV'
```

***


### [`select 2번`](https://school.programmers.co.kr/learn/courses/30/lessons/144853)

```agsl
SELECT BOOK_ID,DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
FROM BOOK
WHERE CATEGORY = '인문' AND PUBLISHED_DATE LIKE '2021%' ORDER BY PUBLISHED_DATE;
```

- DATE_FORMAT 을 통해 날짜 출력을 지정할 수 있다.

***

### [`select 3번`](https://school.programmers.co.kr/learn/courses/30/lessons/132201)
```agsl
SELECT PT_NAME,PT_NO,GEND_CD,AGE,IFNULL(TLNO,'NONE') AS TLNO 
FROM PATIENT WHERE GEND_CD='W' AND AGE<=12 
ORDER BY AGE DESC,PT_NAME ASC;
```

- select 문에서 `IFNULL(column,value)` 을 작성하여 null 인 값에 원하는 값을 출력할 수 있다. 

***

### [`select 4번`](https://school.programmers.co.kr/learn/courses/30/lessons/131120)
- `SELECT DATE_FORMAT('2019-09-16 20:23:12', '%Y/%M/%D')`
- date_formate 은 뒤에 시간 까지 여서 조절하고 싶으면 위에 문장 처럼 조절

***

### [`select 5번`](https://school.programmers.co.kr/learn/courses/30/lessons/133024)
```sql
SELECT flavor from first_half group by flavor order by sum(total_order) desc, shipment_id asc;
```
- 손쉽게 정답

***

### [`select 6번`](https://school.programmers.co.kr/learn/courses/30/lessons/132203)
```sql
SELECT DR_NAME,DR_ID,MCDP_CD,date_format(HIRE_YMD,'%Y-%m-%d')HIRE_YMD from doctor where MCDP_CD in('cs','gs') order by HIRE_YMD desc,dr_name;
```
- date_format 은 소문자로 양식해야 숫자로 나오고, 대문자로 하면 march april 이런거 나온다.

***

### [`select 6번`](https://school.programmers.co.kr/learn/courses/30/lessons/164673)

```sql
SELECT TITLE,a.BOARD_ID,b.REPLY_ID,b.WRITER_ID,b.CONTENTS,DATE_FORMAT(b.CREATED_DATE , "%Y-%m-%d") as CREATED_DATE
from USED_GOODS_BOARD a join USED_GOODS_REPLY b on a.BOARD_ID = b.BOARD_ID
where a.CREATED_DATE between "2022-10-01" and "2022-10-31"
order by b.CREATED_DATE,a.TITLE;
```
- 게시물 작정이 8월이고 댓글이 10월일 수도 있는데 댓글 작성 날짜 기준으로 검색한 내 잘못

***

### [`select 7번`](https://school.programmers.co.kr/learn/courses/30/lessons/133025)
```sql
SELECT a.FLAVOR from FIRST_HALF a join ICECREAM_INFO b on a.flavor = b.flavor
where INGREDIENT_TYPE = 'fruit_based'
group by flavor having sum(total_order) > 3000;
```
***

### [`select 8번`](https://school.programmers.co.kr/learn/courses/30/lessons/131118)
```sql
SELECT b.REST_ID,REST_NAME,FOOD_TYPE,FAVORITES,ADDRESS, round(avg(review_score),2) SCORE
from REST_INFO a join REST_REVIEW b on a.REST_ID=b.REST_ID
group by b.REST_ID  having address like '서울%'
order by avg(review_score) desc,favorites desc;
```
- 서울 앞에 %는 정답이 아닌 이유는 알 수 없다.

***

### [`select 8번`](https://school.programmers.co.kr/learn/courses/30/lessons/131118)
```sql
SELECT FACTORY_ID,FACTORY_NAME,ADDRESS
from FOOD_FACTORY
where ADDRESS like '강원도%';
```
***

### [`select 9번`](https://school.programmers.co.kr/learn/courses/30/lessons/131536)

```sql
SELECT USER_ID,PRODUCT_ID
from ONLINE_SALE
group by USER_ID,PRODUCT_ID having count(*)>=2
order by user_id,PRODUCT_ID desc;
```
***
### [`select 10번`](https://school.programmers.co.kr/learn/courses/30/lessons/59034)
```sql
SELECT ANIMAL_ID,ANIMAL_TYPE,DATETIME,INTAKE_CONDITION,NAME,SEX_UPON_INTAKE
from ANIMAL_INS
```
***

### [`select 11번`](https://school.programmers.co.kr/learn/courses/30/lessons/131537)
```sql
SELECT date_format(SALES_DATE,'%Y-%m-%d') as SALES_DATE,PRODUCT_ID,USER_ID,SALES_AMOUNT
from ONLINE_SALE
where SALES_DATE like '2022-03%'
union
(SELECT date_format(SALES_DATE,'%Y-%m-%d') as SALES_DATE,PRODUCT_ID, NULL as USER_ID,SALES_AMOUNT
from OFFLINE_SALE
where SALES_DATE like '2022-03%')
order by SALES_DATE,PRODUCT_ID,USER_ID;
```
- 1) union 을 활용 해야 할때가 있다

***

### [`select 12번`](https://school.programmers.co.kr/learn/courses/30/lessons/59035)
```sql
SELECT NAME,DATETIME
from ANIMAL_INS
order by ANIMAL_ID desc;
```
***

### [`select 13번`](https://school.programmers.co.kr/learn/courses/30/lessons/59036)
```sql
SELECT ANIMAL_ID,NAME
from ANIMAL_INS
where INTAKE_CONDITION='Sick'
order by ANIMAL_ID;
```
***

### [`select 14번`](https://school.programmers.co.kr/learn/courses/30/lessons/59037)
```sql
SELECT ANIMAL_ID,NAME
from ANIMAL_INS
where INTAKE_CONDITION not in ('aged')
order by ANIMAL_ID;
```
***

### [`select 15번`](https://school.programmers.co.kr/learn/courses/30/lessons/59403)
```sql
SELECT ANIMAL_ID,NAME
from ANIMAL_INS
order by ANIMAL_ID;
```
***

### [`select 16번`](https://school.programmers.co.kr/learn/courses/30/lessons/59404)
```sql
SELECT ANIMAL_ID,NAME,DATETIME
from ANIMAL_INS
order by NAME,DATETIME desc;
```
***

### [`select 17번`](https://school.programmers.co.kr/learn/courses/30/parts/17042)
```sql
SELECT NAME
from ANIMAL_INS
where DATETIME <= all (select DATETIME from ANIMAL_INS);
-- 두개 방법
SELECT NAME
from ANIMAL_INS
order by datetime limit 1;
```
***

### [`select 18번`](https://school.programmers.co.kr/learn/courses/30/parts/131535)
```sql
SELECT count(*) USERS
from USER_INFO
where joined like '2021%' and age between 20 and 29;
```
***




![img.png](db10001.png)

```sql
SELECT member_id,member_name,gender,DATE_FORMAT(DATE_OF_BIRTH,'%Y-%m-%d') AS DATE_OF_BIRTH
from member_profile
where date_of_birth like '%03%'  and tlno is not null and gender='w'
order by member_id;

```

***

### [`join 1번`](https://school.programmers.co.kr/learn/courses/30/lessons/133027)

```sql
-- 코드를 입력하세요
-- select * from first_half;
-- select * from july;

 SELECT fh.flavor from first_half as fh join july as ju on fh.flavor = ju.flavor
 group by ju.flavor
 order by sum(fh.total_order+ju.total_order) desc limit 3;

```
- 내용물을 확인을 하자....... 테이블에 딸기가 두번 입력되어 있는 경우가 있다,, 그룹을 해줘야 한다.
- 그래서 order by 에서도 sum 함수를 해야한다. 

***

### [`join 2번`](https://school.programmers.co.kr/learn/courses/30/lessons/157339)

```sql
SELECT DISTINCT CAR.CAR_ID
      ,CAR.CAR_TYPE
      ,ROUND(DAILY_FEE * (1- (DISCOUNT_RATE / 100)) * 30) AS FEE

FROM CAR_RENTAL_COMPANY_CAR CAR 
INNER JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY HISTORY ON CAR.CAR_ID = HISTORY.CAR_ID
INNER JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN DISCOUNT ON CAR.CAR_TYPE = DISCOUNT.CAR_TYPE
WHERE CAR.CAR_ID NOT IN (
    SELECT CAR_ID
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    WHERE END_DATE > '2022-11-01' 
    AND START_DATE < '2022-11-30'
)
     AND CAR.CAR_TYPE IN ('세단', 'SUV')
     AND DISCOUNT.DURATION_TYPE = '30일 이상'
HAVING FEE BETWEEN 500000 AND 2000000
ORDER BY FEE DESC, CAR_TYPE, CAR_ID DESC
```

### [`join 3번`](https://school.programmers.co.kr/learn/courses/30/lessons/131117)

```sql
SELECT a.PRODUCT_ID,PRODUCT_NAME, sum(price*amount) as TOTAL_SALES
from FOOD_PRODUCT a join FOOD_ORDER b on a.PRODUCT_ID = b.PRODUCT_ID
where month(PRODUCE_DATE) = 5
group by PRODUCT_ID
order by TOTAL_SALES desc, PRODUCT_ID
```

***

### [`join 4번`](https://school.programmers.co.kr/learn/courses/30/lessons/144854)

```sql
SELECT BOOK_ID,AUTHOR_NAME,date_format(PUBLISHED_DATE,'%Y-%m-%d') PUBLISHED_DATE
from BOOK a join AUTHOR b on a.AUTHOR_ID= b.AUTHOR_ID
where CATEGORY='경제'
order by PUBLISHED_DATE;
```

***

### [`join 5번`](https://school.programmers.co.kr/learn/courses/30/lessons/131124)

```sql
SELECT MEMBER_NAME,REVIEW_TEXT,date_format(REVIEW_DATE,'%Y-%m-%d') REVIEW_DATE
from MEMBER_PROFILE a join REST_REVIEW b on a.MEMBER_ID=b.MEMBER_ID 
where a.member_id 
= (select member_id from REST_REVIEW group by  member_id 
                     order by count(REVIEW_ID) desc limit 1)
order by REVIEW_DATE,REVIEW_TEXT;
```

***

### [`join 6번`](https://school.programmers.co.kr/learn/courses/30/lessons/59042)

```sql
SELECT b.ANIMAL_ID,b.NAME
from ANIMAL_INS a right join ANIMAL_OUTS b on a.ANIMAL_ID=b.ANIMAL_ID
where a.ANIMAL_ID is null
order by ANIMAL_ID;
```

***

### [`join 7번`](https://school.programmers.co.kr/learn/courses/30/lessons/59043)

```sql
SELECT b.ANIMAL_ID,b.NAME
from ANIMAL_INS a join ANIMAL_OUTS b on a.ANIMAL_ID=b.ANIMAL_ID
where b.datetime < a.datetime
order by a.datetime;
```

***

### [`join 8번`](https://school.programmers.co.kr/learn/courses/30/lessons/59044)

```sql
SELECT NAME,DATETIME
from ANIMAL_INS 
where ANIMAL_ID not in (select ANIMAL_ID from ANIMAL_OUTS )
order by datetime limit 3;


# 풀이2
SELECT I.NAME, I.DATETIME
FROM ANIMAL_INS AS I
    LEFT JOIN ANIMAL_OUTS AS O ON I.ANIMAL_ID = O.ANIMAL_ID
WHERE O.ANIMAL_ID IS NULL
ORDER BY I.DATETIME
LIMIT 3;

```

***

### [`join 9번`](https://school.programmers.co.kr/learn/courses/30/lessons/59045)

```sql
SELECT a.ANIMAL_ID,a.ANIMAL_TYPE,a.NAME
from ANIMAL_INS a join ANIMAL_OUTS b on a.ANIMAL_ID = b.ANIMAL_ID
where a.SEX_UPON_INTAKE != b.SEX_UPON_OUTCOME
```

***

### [`join 10번`](https://school.programmers.co.kr/learn/courses/30/lessons/131533)

```sql
SELECT PRODUCT_CODE, sum(price*sales_amount) SALES
from PRODUCT a join OFFLINE_SALE b on a.PRODUCT_ID=b.PRODUCT_ID
group by PRODUCT_CODE
order by sales desc,PRODUCT_CODE;
```

***

### [`join 11번`](https://school.programmers.co.kr/learn/courses/30/lessons/131534)

```sql
SELECT YEAR(OS.SALES_DATE) AS YEAR
     , MONTH(OS.SALES_DATE) AS MONTH
     , COUNT(DISTINCT OS.USER_ID) AS PURCHASED_USERS
     , ROUND(COUNT(DISTINCT OS.USER_ID)
             / (SELECT COUNT(DISTINCT USER_ID) FROM USER_INFO WHERE YEAR(JOINED) = 2021), 1) AS PURCHASED_RATIO
FROM USER_INFO AS UI JOIN ONLINE_SALE AS OS ON UI.USER_ID = OS.USER_ID
WHERE YEAR(UI.JOINED) = 2021
GROUP BY YEAR, MONTH
ORDER BY YEAR, MONTH
```

***



### [`group by 1번`](https://school.programmers.co.kr/learn/courses/30/lessons/131123)
```sql
SELECT food_type,rest_id,rest_name,favorites from REST_INFO 
where (food_type, favorites ) in (select food_type,max(favorites)
      from rest_info group by food_type)
order by food_type desc;
```
- where 문에 다중으로 타입을 비교 가능하다.

***

### [`group by 2번`](https://school.programmers.co.kr/learn/courses/30/lessons/164668)
```sql
SELECT USER_ID,NICKNAME, sum(price) TOTAL_SALES
from USED_GOODS_BOARD join USED_GOODS_USER on writer_id = USER_ID
where status = 'done'
group by user_id
having sum(price) >= 700000
order by TOTAL_SALES;
```

***

### [`group by 3번`](https://school.programmers.co.kr/learn/courses/30/lessons/144856)
```sql
SELECT a.AUTHOR_ID,AUTHOR_NAME,CATEGORY, sum(PRICE*SALES) TOTAL_SALES
from AUTHOR a join BOOK b on a.AUTHOR_ID=b.AUTHOR_ID
join BOOK_SALES c on c.BOOK_ID = b.BOOK_ID
where SALES_DATE like '2022-01%'
group by AUTHOR_ID,CATEGORY
order by AUTHOR_ID,CATEGORY desc;
```

***

### [`group by 4번`](https://school.programmers.co.kr/learn/courses/30/lessons/144855)
```sql
SELECT CATEGORY, sum(sales) TOTAL_SALES
from BOOK a join BOOK_SALES b on a.BOOK_ID = b.BOOK_ID
where SALES_DATE like '2022-01%'
group by CATEGORY
order by category;
```

***

### [`group by 5번`](https://school.programmers.co.kr/learn/courses/30/lessons/157340)
```sql
SELECT CAR_ID, 
case When car_id in(
    select car_id
    from CAR_RENTAL_COMPANY_RENTAL_HISTORY
    where '2022-10-16' between START_DATE and END_DATE)
    then '대여중'
    else '대여 가능'
    end as AVAILABILITY
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
group by car_id
order by CAR_ID desc;
```

***

### [`group by 6번`](https://school.programmers.co.kr/learn/courses/30/lessons/132202)
```sql
SELECT MCDP_CD 진료과코드, count(PT_NO) 5월예약건수
from APPOINTMENT
where APNT_YMD like '2022-05%'
group by MCDP_CD
order by count(PT_NO),MCDP_CD
```

***
### [`group by 7번`](https://school.programmers.co.kr/learn/courses/30/lessons/151137)
```sql
SELECT CAR_TYPE,count(CAR_TYPE) CARS
from CAR_RENTAL_COMPANY_CAR
WHERE OPTIONS LIKE '%열선시트%' OR OPTIONS LIKE '%통풍시트%' OR OPTIONS LIKE '%가죽시트%'
group by CAR_TYPE
order by CAR_TYPE;
```

***

### [`group by 8번`](https://school.programmers.co.kr/learn/courses/30/lessons/151139)
```sql
SELECT MONTH(START_DATE) AS MONTH
     , CAR_ID
     , COUNT(HISTORY_ID) AS RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE CAR_ID IN (SELECT CAR_ID
                 FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
                 WHERE MONTH(START_DATE) IN (8, 9, 10)
                 GROUP BY CAR_ID
                 HAVING COUNT(HISTORY_ID) >= 5)
      AND MONTH(START_DATE) IN (8, 9, 10)
GROUP BY MONTH, CAR_ID
ORDER BY MONTH, CAR_ID DESC;
```

***

### [`group by 9번`](https://school.programmers.co.kr/learn/courses/30/lessons/133026)
```sql
SELECT INGREDIENT_TYPE, sum(total_order) TOTAL_ORDER
from FIRST_HALF a join ICECREAM_INFO b on a.FLAVOR = b.FLAVOR
group by INGREDIENT_TYPE
```

***

### [`group by 10번`](https://school.programmers.co.kr/learn/courses/30/lessons/131116)
```sql
SELECT CATEGORY,price, product_name
from FOOD_PRODUCT
where CATEGORY in ('과자', '국', '김치', '식용유')
and price in (SELECT MAX(PRICE) FROM FOOD_PRODUCT GROUP BY CATEGORY)
group by category
order by price desc;
```

***

### [`group by 11번`](https://school.programmers.co.kr/learn/courses/30/lessons/131530)
```sql
SELECT floor(price/10000)*10000 as price_group, count(product_code) as products
from product
group by price_group
order by price_group
```

***
### [`group by 12번`](https://school.programmers.co.kr/learn/courses/30/lessons/59040)
```sql
SELECT ANIMAL_TYPE,count(ANIMAL_TYPE) as count
from ANIMAL_INS
group by ANIMAL_TYPE
order by ANIMAL_TYPE
```

***
### [`group by 13번`](https://school.programmers.co.kr/learn/courses/30/lessons/59041)
```sql
SELECT NAME,COUNT(ANIMAL_ID) as count
from ANIMAL_INS
group by name having count(ANIMAL_ID) >= 2 and name is not null
order by name
```

***

### [`group by 14번`](https://school.programmers.co.kr/learn/courses/30/lessons/131532)
```sql
SELECT date_format(sales_date,'%Y') as YEAR,
date_format(sales_date,'%m') as MONTH 
,GENDER, count(distinct(b.USER_ID)) as USERS
from USER_INFO a join ONLINE_SALE b on a.USER_ID=b.USER_ID
where gender in (0,1)
group by year(sales_date),month(sales_date),gender
order by year,month,gender
```

***

### [`group by 15번`](https://school.programmers.co.kr/learn/courses/30/lessons/59412)
```sql
SELECT hour(DATETIME) as HOUR, count(ANIMAL_ID) as COUNT
from ANIMAL_OUTS
group by hour having hour between 9 and 20
order by hour
```
- select 문의 별명을 group by , where order by 등등에 이용 가능

***

### [`group by 16번`](https://school.programmers.co.kr/learn/courses/30/lessons/59413)
```sql
SET @i = -1;
SELECT (@i := @i + 1) AS HOUR
        , (SELECT COUNT(*) 
           FROM animal_outs 
           WHERE HOUR(datetime) = @i) AS COUNT
FROM animal_outs
WHERE @i < 23
```

***



### [`SUM, MAX, MIN 1번`](https://school.programmers.co.kr/learn/courses/30/lessons/131115)
```sql
SELECT product_id,product_name,product_cd,category,price as price 
from food_product where price = (select max(price) from food_product )
```

- where 절을 통해 찾고자 하는 튜플의 범위를 좁혀야한다.

***

### [`SUM, MAX, MIN 2번`](https://school.programmers.co.kr/learn/courses/30/lessons/131697)
```sql
SELECT max(price) MAX_PRICE
from PRODUCT
```
***

### [`SUM, MAX, MIN 3번`](https://school.programmers.co.kr/learn/courses/30/lessons/131697)
```sql
SELECT max(DATETIME) 시간
from ANIMAL_INS
```
***

### [`SUM, MAX, MIN 4번`](https://school.programmers.co.kr/learn/courses/30/lessons/59038)
```sql
SELECT min(DATETIME) 시간
from ANIMAL_INS
```
***

### [`SUM, MAX, MIN 5번`](https://school.programmers.co.kr/learn/courses/30/lessons/59406)
```sql
SELECT count(*)
from ANIMAL_INS
```
***

### [`SUM, MAX, MIN 6번`](https://school.programmers.co.kr/learn/courses/30/lessons/59406)
```sql
SELECT count(distinct name)
from ANIMAL_INS
```
***




### [`IS NULL 1번`](https://school.programmers.co.kr/learn/courses/30/lessons/131114)
```sql
SELECT WAREHOUSE_ID,warehouse_name,ADDRESS, 
CASE   WHEN freezer_yn IS NULL THEN "N"
        ELSE freezer_yn
    END AS freezer_yn 
    from FOOD_WAREHOUSE
where address like '경기도%'
order by warehouse_id;
```
```sql
CASE   WHEN freezer_yn IS NULL THEN "N"
  ELSE freezer_yn
  END AS freezer_yn 
```
 - `case when` 칼럼 조건 `then` 넣을 값  `else` 넣을 값 `end` as 별명

***

### [`IS NULL 2번`](https://school.programmers.co.kr/learn/courses/30/lessons/59039)
```sql
SELECT ANIMAL_ID
from ANIMAL_INS
where NAME is null
order by ANIMAL_ID;
```

***

### [`IS NULL 3번`](https://school.programmers.co.kr/learn/courses/30/lessons/59407)
```sql
SELECT ANIMAL_ID
from ANIMAL_INS 
where NAME is not null
order by ANIMAL_ID;
```

***

### [`IS NULL 4번`](https://school.programmers.co.kr/learn/courses/30/lessons/59410)
```sql
SELECT ANIMAL_TYPE,ifnull(NAME,'No name') as name,SEX_UPON_INTAKE
from ANIMAL_INS
order by ANIMAL_ID;
```

***

### [`IS NULL 5번`](https://school.programmers.co.kr/learn/courses/30/lessons/131528)
```sql
SELECT count(user_id) users
from USER_INFO
where age is null
```

***

### [`String,Date 1번`](https://school.programmers.co.kr/learn/courses/30/lessons/151138)

```sql
SELECT HISTORY_ID, CAR_ID, DATE_FORMAT(START_DATE, "%Y-%m-%d"), DATE_FORMAT(END_DATE, "%Y-%m-%d"),
    CASE WHEN DATEDIFF(END_DATE, START_DATE)+1 < 30 THEN "단기 대여" ELSE "장기 대여" END AS RENT_TYPE
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    WHERE START_DATE BETWEEN "2022-09-01" AND "2022-09-30"
    ORDER BY HISTORY_ID DESC
```
- 이 부분은 외워야 할 것이 많다.
1. `DATE_FORMAT(START_DATE, "%Y-%m-%d")` date_format 사용 방법
2. `CASE WHEN DATEDIFF(END_DATE, START_DATE)+1 < 30 THEN "단기 대여" ELSE "장기 대여" END AS RENT_TYPE`
   - datediff(end_date, start_date) : 날짜 차이 값 보여주는 함수
   - case when 조건식 then true값 반환 else false 값 반환 end as 타입값
***

### [`String,Date 2`](https://school.programmers.co.kr/learn/courses/30/lessons/157343)

```sql
SELECT CAR_ID,CAR_TYPE,DAILY_FEE,OPTIONS
from CAR_RENTAL_COMPANY_CAR
where options like '%네비게이션%'
order by car_id desc;
```

***

### [`String,Date 3`](https://school.programmers.co.kr/learn/courses/30/lessons/164671)

```sql
SELECT concat('/home/grep/src/',b.board_id,'/',b.file_id,FILE_NAME,b.file_ext) FILE_PATH
from USED_GOODS_BOARD a join USED_GOODS_FILE b on a.BOARD_ID=b.BOARD_ID
where a.views >= all(select views from USED_GOODS_BOARD)
order by FILE_ID desc;
```

***

### [`String,Date 4`](https://school.programmers.co.kr/learn/courses/30/lessons/164670)

```sql
SELECT USER_ID,NICKNAME, concat(CITY,' ',STREET_ADDRESS1,' ',STREET_ADDRESS2) 전체주소,
CONCAT_WS("-", SUBSTR(b.TLNO, 1, 3), SUBSTR(b.TLNO, 4, 4), SUBSTR(b.TLNO, 8, 4)) 전화번호
from USED_GOODS_BOARD a join USED_GOODS_USER b on WRITER_ID = USER_ID
group by USER_ID having count(BOARD_ID) >=3
order by USER_ID desc;
```

***


### [`String,Date 5`](https://school.programmers.co.kr/learn/courses/30/lessons/151141)

```sql

```

***

### [`String,Date 6`](https://school.programmers.co.kr/learn/courses/30/lessons/164672)

```sql
SELECT BOARD_ID,WRITER_ID,TITLE,PRICE,
(case 
 when STATUS = 'SALE' then '판매중'
 when STATUS = 'RESERVED' then '예약중'
 when STATUS = 'DONE' then '거래완료'
end) as STATUS
from USED_GOODS_BOARD
where DATE_FORMAT(CREATED_DATE,'%Y-%m-%d') = '2022-10-05'
order by BOARD_ID desc;
```

***

### [`String,Date 7`](https://school.programmers.co.kr/learn/courses/30/lessons/131113)

```sql
SELECT ORDER_ID,PRODUCT_ID, date_format(OUT_DATE,'%Y-%m-%d'),
(case when OUT_DATE <= '2022-05-01' then '출고완료'
when OUT_DATE > '2022-05-01' then '출고대기'
else '출고미정' end ) as 출고여부
from FOOD_ORDER
order by ORDER_ID;
```

***

### [`String,Date 8`](https://school.programmers.co.kr/learn/courses/30/lessons/157341)

```sql
SELECT distinct(b.CAR_ID)
from CAR_RENTAL_COMPANY_CAR a join CAR_RENTAL_COMPANY_RENTAL_HISTORY b
on a.CAR_ID =b.CAR_ID
where CAR_TYPE='세단' and month(start_date) = 10
order by CAR_ID desc;
```

***

### [`String,Date 9`](https://school.programmers.co.kr/learn/courses/30/lessons/157342)

```sql
SELECT CAR_ID, ROUND(AVG(DATEDIFF(END_DATE,START_DATE)+1),1) AS AVERAGE_DURATION
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY CAR_ID HAVING AVERAGE_DURATION >= 7
ORDER BY AVERAGE_DURATION DESC, CAR_ID DESC
```

***

### [`String,Date 10`](https://school.programmers.co.kr/learn/courses/30/lessons/132204)

```sql

```

***

### [`String,Date 11`](https://school.programmers.co.kr/learn/courses/30/lessons/59046)

```sql
SELECT ANIMAL_ID,NAME,SEX_UPON_INTAKE
from ANIMAL_INS 
where NAME in ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty')
```

***
### [`String,Date 12`](https://school.programmers.co.kr/learn/courses/30/lessons/59047)

```sql

```

***