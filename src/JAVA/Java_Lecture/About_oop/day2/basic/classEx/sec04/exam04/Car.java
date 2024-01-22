package JAVA.Java_Lecture.About_oop.day2.basic.classEx.sec04.exam04;

public class Car {
	//필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 선언
	Car() {}
	
	Car(String model) { 

		this(model,"white",200);
	}
	// this()생성자 호출 메소드 반드시 생성자의 첫줄에 작성되어야 다른 생성자를 호출할 수 있다.
	Car(String model, String color) {
//		this.model = model;
//		this.color = color;
		this(model,color,200);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}