package Java_Lecture.About_oop.day2;

//추상클래스는 abastract 여부로 추상 표현 여부 가능
// 더 밑에 클래스는 상속이라 item 요소를 여기서 표현안해도 가져올 수 있음

public abstract class ColdDrink implements Item{

    public Packing packing(){
        return new Bottle();
    }

    public abstract float price();
}
