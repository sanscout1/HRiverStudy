## 퀴즈

### 시간 안에 오류를 해결 못하고 제출 못 한 이유


1. 생성자에 내용을 잘 채우자 (생성자에 `this.speed=speed;` 를 작성하지 않아 출력이 계속 0이 나옴)
2. 형변환을 통하여 호출이 안되는 함수를 잘 호출하자 
     - `((Chicken) cheatableChicken).run(1);`  cheatable 으로 타입을 정해서 Animal의 함수 출력 못해서 형변환 해야 가능
3. 부모의 변수는 자식이 super를 통해 저장 할 수 있고, 함수도 잘 불러오니 괜히 헷갈려 하지 말고, 문제 있으면 뭘 빼먹었는지를 생각하자.
   - 오류가 나오자 내 지식을 불신 한 것이 제일 큰 문제
4. protected로 해서 자식 클래스는 자기거 처럼 변수 불러오게 설정하자!
   - `        this.distance+=(speed*hours)/2;` 간단 표현 가능