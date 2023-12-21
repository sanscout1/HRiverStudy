package Java_Lecture.About_oop.day6_abstract.vehicle;

public class Bike extends TwoWheeler {

    @Override
    public void printType() {
        System.out.println("이것은 자전거입니다.");
    }

    @Override
    public void printPrice() {
        System.out.println("가격 : 150,000");
    }
    public  void printBrand(){
        System.out.println("브랜드 : 삼천리");
    }
}
