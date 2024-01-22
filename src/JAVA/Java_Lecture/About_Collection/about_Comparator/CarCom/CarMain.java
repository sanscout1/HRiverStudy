package JAVA.Java_Lecture.About_Collection.about_Comparator.CarCom;

import java.util.Arrays;

public class CarMain {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Car("GENESIS", 3000);
        cars[1] = new Car("SOUL", 1500);
        cars[2] = new Car("SPARK", 1800);
        cars[3] = new Car("sonata",2400);
        Arrays.sort(cars);

        // 기준은 첫 add 한애
        // 들어온애랑 비교해서 리턴이 음수라면 기준이 더 작은거라고 판단하고 정렬! 기본인 오름차순이기에
        // 작다고 판단하니 더 앞에 출력 되도록 하는것
        //ex) 제네시스가 들어가고, soul이 들어갈때 리턴이 음수라면, soul 이 작다고 판단 해서 정렬
        // 그다음에 스파크가 들어가면서 soul 보다 작다고 판단해서 정렬


        for (Car car : cars) {
            System.out.println(car.getCar());
        }


    }
}
