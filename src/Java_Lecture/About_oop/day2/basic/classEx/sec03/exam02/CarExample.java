package Java_Lecture.About_oop.day2.basic.classEx.sec03.exam02;
// 데이터 처리의 기본 기능 : CRUD create read update delete
public class CarExample {
	public static void main(String[] args) {


		Car myCar1 = new Car(); //Java_Lecture.About_class_basic.Car 타입의 생성자(new연산자를 이용하여 생선된 객체의 주소값)를 호출해서 객체를 초기화한다.
		//객체 초기화란 생성된 객체의 필드 초기화 하거나 메소드들을 호출해서 객체를 사용할 준비

		Car myCar2 = new Car("Tesla","Xmodel","White",300,80);

		System.out.println(myCar2.getCompany()+" "+myCar2.getModel()+" "+myCar2.getColor()+" "+myCar2.getMaxSpeed()+" "+myCar2.getSpeed());


		myCar2.setSpeed(40);
		System.out.println(myCar2.getSpeed());
		//Java_Lecture.About_class_basic.Car 객체 생성

		//2. 생성자 오버로딩

		//3. 모든 필드는 private 변경한다  -->캡슐화

		//4. company, model, maxSpeed, color 는 객체가 생성되면 변경할 수 없고, 읽기만 가능하도록 재구성 하세요  getter 메소드

		//5. speed 맴버는 읽기 쓰기가 가능하도록 public getter setter 메소드를 작성하세요.

	}
}