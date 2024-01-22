package JAVA.Java_Lecture.About_oop.day6_abstract;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printSound();

        Cat cat = new Cat();
        cat.printSound();
        cat.displayInfo();

        Animal dog1 = new Dog();
        dog1.printSound(); //메서드 오버라이딩은 자식걸 가져온다 는 것 기억


//        Animal animal = new Animal() {
//            @Override
//            public void printSound() {
//                System.out.println("야옹야옹");
//            }
//        };

    }
}
