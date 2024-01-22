package JAVA.Java_Lecture.About_oop.day2.basic.classEx.sec03.exam01;

public class CarExample {
	public static void main(String[] args) {
		//JAVA.Java_Lecture.About_class_basic.Car 객체 생성
		Car car1 = new Car();

		//JAVA.Java_Lecture.About_class_basic.Car 타입을 저장할 수 있는 myCarArray

		Car[] myCarArray = new Car[5];


		car1.model="그랜저";
		car1.speed=100;
		car1.engine=true;
		//JAVA.Java_Lecture.About_class_basic.Car 객체의 필드값 읽기
		System.out.println(car1.model);
		System.out.println(car1.speed);
		System.out.println(car1.engine);

		//myCarArray에 1번쨰 공간에 그랜저를 저장

		myCarArray[0]=car1;
		System.out.println(myCarArray[0].model);
		System.out.println(myCarArray[0].speed);
		System.out.println(myCarArray[0].engine);

		//myCarArray 주차공간에 그랜저, 아이오닉, 트위지, 모닝, 스파크

		Car car2 = new Car("아이오닉",false,0);
		Car car3 = new Car("트위지",false,0);
		Car car4 = new Car("모닝",false,0);
		Car car5 = new Car("스파크",false,0);

//		car2.model="아이오닉";
//		car3.model="트위지";
//		car4.model="모닝";
//		car5.model="스파크";

		myCarArray[1]=car2;
		myCarArray[2]=car3;
		myCarArray[3]=car4;
		myCarArray[4]=car5;


		for (Car car : myCarArray) {
			System.out.println(car.model+ " "+ car.engine+" "+car.speed);
		}


	}
}