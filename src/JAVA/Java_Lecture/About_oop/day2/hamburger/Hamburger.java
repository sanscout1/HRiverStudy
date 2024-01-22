package JAVA.Java_Lecture.About_oop.day2.hamburger;
//점층적 생성자패턴
public class Hamburger {

    //필수
    private int bun;
    private int patty;

    //선택

    private int cheese;
    private int tomato;
    private int bacon;

    public Hamburger(){}
    public Hamburger(int bun, int patty){
        this.bun=bun;
        this.patty=patty;
    }
    public Hamburger(int bun, int patty,int cheese){
        this.bun=bun;
        this.patty=patty;
        this.cheese=cheese;
    }
    public Hamburger(int bun, int patty,int cheese,int tomato){
        this.bun=bun;
        this.patty=patty;
        this.cheese=cheese;
        this.tomato=tomato;
    }
    public Hamburger(int bun, int patty,int cheese,int tomato,int bacon){
        this.bun=bun;
        this.patty=patty;
        this.cheese=cheese;
        this.tomato=tomato;
        this.bacon=bacon;
    }



}
