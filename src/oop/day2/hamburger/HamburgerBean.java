package oop.day2.hamburger;
//JavaBean 패턴 : setter 메소드를 사용한 패턴(매개변수가 없는 생성자를 생성한 후, setter메소드를 통해 초기화)
public class HamburgerBean {

    //필수
    private int bun;
    private int patty;

    //선택

    private int cheese;
    private int tomato;
    private int bacon;

    public HamburgerBean(){}


    public void setBun(int bun) {
        this.bun = bun;
    }

    public void setPatty(int patty) {
        this.patty = patty;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public void setTomato(int tomato) {
        this.tomato = tomato;
    }

    public void setBacon(int bacon) {
        this.bacon = bacon;
    }
}
