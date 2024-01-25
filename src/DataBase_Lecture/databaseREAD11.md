
# 데이터베이스 튜닝
- db 성능 향상 --> 응답 시간의 단축
- 응답 시간의 주 원인은 인덱스
- 인덱스는 열 (column) 에 적용

![img.png](dbindex01.png)

- 쿼리문 천개를 전부 검색하는 것을 확인 가능
- 데이터가 많아지면 비효율적이니 index 적용 필요

![img.png](dbindex02.png)
- index 적용하자 위에서 1000개를 검색하던게 두 번 검색만으로 찾음, cost가 100 에서 0.7 로 감소한 것 확인 가능
