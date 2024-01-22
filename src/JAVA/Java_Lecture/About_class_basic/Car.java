package JAVA.Java_Lecture.About_class_basic;

public class Car {
    private String model = "BMW528i";
    private int distance = 100000;
    private int price = 90000000;
    private String company = "BMW";
    private boolean auto = true;
    private String type = "AType";
    private int year =2010;
    private float gasmi = 12.5F;

    public void  getModel(){
        System.out.println(this.model);
    }
    public void getDistance() {
        System.out.println(this.distance+"km");
    }
    public void getPrice() {
        System.out.println(this.price);
    }
    public void getCompany() {
        System.out.println(this.company);
    }

    public void getType() {
        System.out.println(this.type);
    }

    public void getAuto(){
        System.out.println(this.auto);
    }
    public void getYear() {
        System.out.println(this.year);
    }

    public void getGasmi() {
        System.out.println(this.gasmi);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGasmi(float gasmi) {
        this.gasmi = gasmi;
    }

    public static void main(String[] args) {
        Car car = new Car();


        car.getModel();
        car.getDistance();
        car.getPrice();
        car.getCompany();
        car.getType();
        car.getAuto();
        car.getYear();
        car.getGasmi();

    }


}
