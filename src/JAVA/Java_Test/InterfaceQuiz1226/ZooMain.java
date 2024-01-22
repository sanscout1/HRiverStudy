package JAVA.Java_Test.InterfaceQuiz1226;

public class ZooMain {
    public static void main(String[] args) {
        //A
        Dog dog = new Dog(8);

        //B
        Chicken chicken = new Chicken(3);

        //C
        Cheatable cheatableChicken;
        cheatableChicken=new Chicken(5);

        //D

        if(cheatableChicken instanceof Cheatable ){
            cheatableChicken.fly();
        }

        //E
        for (int i = 1; i < 4; i++) {
            System.out.println(i+ "시간 후");
            dog.run(1);
            chicken.run(1);
            ((Chicken) cheatableChicken).run(1);

            System.out.println("개의 이동거리="+dog.getDistance());
            System.out.println("닭의 이동거리="+chicken.getDistance());
            System.out.println("날으는 닭의 이동거리="+ ((Chicken) cheatableChicken).getDistance());

        }


    }
}
