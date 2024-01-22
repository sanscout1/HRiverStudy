package JAVA.Java_Lecture.About_oop.day2.basic.classEx.sec03.exam02;

public class Car {

	//필드 선언
	private  String company ;
	private  String model ;
	private  String color ;
	private  int maxSpeed;
	private int speed;


	Car(){}

	//모든 클래스의 생성자는 해당 클래스의 접근제한자를 따라간다.

	//생성자는 ㄴ메소드와 비슷하지만, 리턴타입이 없고 클래스이름과 동일하다.
	// 생성자의 매개변수는 new연산자로 생성자를 호출할떄, 매개값을 생성자 블록 내부로 전다하는 역할을 한다.
	Car(String company,String model,String color,int maxSpeed,int speed){
		this.company=company;
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
		this.speed=speed;
	}

	public String getCompany(){
		return company;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}