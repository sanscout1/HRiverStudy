
## 프로그래머스 datbase 실습 문제

### [`select 1번`](https://school.programmers.co.kr/learn/courses/30/lessons/151136)
```
SELECT FLOOR(AVG(DAILY_FEE)) AS AVERAGE_FEE
FROM CAR_RENTAL_COMPANY_CAR WHERE CAR_TYPE = 'SUV'
```



### [`select 2번`](https://school.programmers.co.kr/learn/courses/30/lessons/144853)

```agsl
SELECT BOOK_ID,DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
FROM BOOK
WHERE CATEGORY = '인문' AND PUBLISHED_DATE LIKE '2021%' ORDER BY PUBLISHED_DATE;
```

- DATE_FORMAT 을 통해 날짜 출력을 지정할 수 있다.