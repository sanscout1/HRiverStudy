package JAVA.Java_Lecture.About_oop.day2.basic.classEx.sec05.exam01;

public class CalculatorExample {
	public static void main(String[] args) {
		//Calculator 객체 생성

		Calculator cal1 = new Calculator();

		//리턴값이 없는 powerOn() 메소드 호출

		cal1.powerOn();;

		System.out.println(cal1.power);

		//plus 메소드 호출 시 5와 6을 매개값으로 제공하고,
		//덧셈 결과를 리턴 받아 result1 변수에 대입

		int result1 =cal1.plus(5,6);


		//divide() 메소드 호출 시 변수 x와 y의 값을 매개값으로 제공하고,
		//나눗셈 결과를 리턴 받아 result2 변수에 대입

		double result2 = cal1.divide(12 , 4);

		//리턴값이 없는 powerOff() 메소드 호출

	}
}