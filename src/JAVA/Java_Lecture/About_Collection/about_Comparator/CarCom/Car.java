package JAVA.Java_Lecture.About_Collection.about_Comparator.CarCom;

public class Car implements Comparable<Car>{
    private String car;
    private int price;

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car(String car, int price) {
        this.car = car;
        this.price = price;
    }

    @Override
    public int compareTo(Car o) {
        if(o.getPrice()==this.price)return 0;
        return -1;
        //int comparePrice = o.getPrice();

        //  return  comparePrice - this.price;   //내림차순 ,,, 반대로 바꾸면 오름차순

        //처음에 제네시스, 두번째 비교할애는 소울이라 음수가 나옴,,,, 내림차순

        //가장 큰값 기준으로 return이 음수들이 나오면 내림차순  (가장큰값은 this.price로 보자)
        // 가장 큰값 기준으로 return이 양수들이나오면 오름차순
    }
}
