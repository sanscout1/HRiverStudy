package JAVA.Java_Lecture.About_oop.day2;

public class VegBurger extends Burger{
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 10.5f;
    }
}
