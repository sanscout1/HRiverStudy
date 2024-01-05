## Board 퀴즈

### 40분이라는 시간 안에 완성 못한 이유

1. 클래스 간의 객체 생성 개념 미흡
   - BoardMenu 에서 BoardDao 객체를 생성 했으면서 BoardDao 에서 BoardMenu 객체 생성을 하게 만들어서 무한 객체 생성 구조를 만들었다.
   - 이전 board 실습 때 메서드 안에 메뉴 출력 메서드를 부르는 구조를 생각 하며 이번에도 비슷하게 만들려고 했으나, 메뉴 메서드는 다른 클래스에 있다는 생각을 하지 못해서 발생한 오류
   ```agsl
    switch (choice) {
    case 1-> {boardDao.Create(); mainMenu();}
    case 2-> {boardDao.Read();  mainMenu();}
    case 3-> {boardDao.Clear();  mainMenu();}
    case 4-> {boardDao.Exit();  mainMenu();}
    default -> mainMenu();
    //이렇게 함수 2개 해서 반복되게 가능
    } ```
    
   
  - case 내부에서 자기 자신을 부르는 메서드 호출로 해결 할 생각을 하지 못했다.

2. read 함수에서 delete 함수 호출 시 비정상 종료하는 현상
   - try catch로 오류 발생 예상 지점을 찾았지만 모두 비정상 종료가 발생
   - 알고보니 foreach 문에서 작동하는 배열이 remove로 처음 진입했을 때 반복사이즈와 다르니 발생하는 오류
   - foreach의 반복이 될 배열 요소사이즈가 변화하는 내용을 담는다면 break; 로 바로 멈추게 하던가 아니면 주의를 해야겠다.

