package JAVA.Java_Lecture.About_oop.day2.basic.classEx.sec05.exam01;

public class Calculator {
	//리턴값이 없는 메소드 선언
    boolean power =false;


    public Calculator(){}

    public Calculator(boolean power){
        this.power=power;
        if(this.power==true){
            powerOn();
        } else{
            powerOff();
        }
    }
    public void powerOn() {
        this.power=true;
        System.out.println("전원이 켜집니다.");
    }

	//리턴값이 없는 메소드 선언

    public void powerOff(){
        this.power=false;
        System.out.println("전원을 끕니다.");
    }

	//호출 시 두 정수 값을 전달받고,
	//호출한 곳으로 결과값 int를 리턴하는 메소드 선언
    public int plus (int x,int y){
        return x+y;
    }

	//호출 시 두 정수 값을 전달받고,
	//호출한 곳으로 결과값 double을 리턴하는 메소드 선언

    public double divide (int x, int y){
        return (double) x/y;
    }

}