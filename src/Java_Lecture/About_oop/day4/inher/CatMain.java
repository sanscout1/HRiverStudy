package Java_Lecture.About_oop.day4.inher;

public class CatMain {
    public static void main(String[] args) {
        BabyCat babyCat = new BabyCat("brown");
        babyCat.eat();
        babyCat.meow();
        babyCat.printInf();
        // 나중에 통신떄는 object로 주고받고 해서 , 나중에 클래스 복원 과정을 할 예정 밑에처럼
        Object obj1 = babyCat;
        BabyCat baby = (BabyCat) obj1;


    }
}
