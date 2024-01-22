package JAVA.Java_Lecture.About_oop.day2.hamburger;

public class HandBurgerHouse {
    public static void main(String[] args) {
        //모든 재료가 있는 햄버거
        Hamburger hamburger1 = new Hamburger(2,1,2,2,1);

        Hamburger hamburger2 = new Hamburger(2,2);



        HamburgerBean hamburgerBean1 = new HamburgerBean();
        hamburgerBean1.setBun(1);
        hamburgerBean1.setPatty(1);
        hamburgerBean1.setBacon(1);
        hamburgerBean1.setCheese(2);
        hamburgerBean1.setTomato(1);
        // 객체 생성 일관성 , 불변성 문제 야기  --> 객체 생성 부분과 값을 설정하는 부분이 물리적으로 분리되었기 때문, public이라 누구나 접근이 가능해서 불변성 깨짐
        //setter 는 필수 변수와 선택 변수 구별을 할 수 없음


        HamburgerBuilder hamburgerBuilder = new HamburgerBuilder.Builder(2,2).cheese(2).bacon(1).tomato(2).build();
        hamburgerBuilder.showHamburgerDetail();
    }
}
