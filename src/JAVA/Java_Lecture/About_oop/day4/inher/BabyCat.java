package JAVA.Java_Lecture.About_oop.day4.inher;

public class BabyCat extends ParentCat {

    private String color;

    BabyCat(){}

    BabyCat(String color){
        super("샴 고양이");
        this.color=color;
    }
    public void meow(){

        System.out.println("야옹");
    }

    //extends 라 protected 하면 super. 으로 혹은 그냥 불러올 수 있음
    public void printInf(){
        getBreed();
        super.getBreed();
        //System.out.println(breed);
        System.out.println(this.color);
    }
}
