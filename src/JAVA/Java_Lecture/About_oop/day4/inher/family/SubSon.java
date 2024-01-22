package JAVA.Java_Lecture.About_oop.day4.inher.family;

public class SubSon extends SubFather{

    SubSon(){}

    SubSon(String homeAddress,String job){
        super(homeAddress,job);
    }
    void printSon(){
        System.out.println("나는 아들입니다.");
        System.out.println("나는 아버지로부터 상속받습니다.");
        System.out.printf("나의 아버지는 %s\n",super.getJob());
        System.out.printf("나의 집은 %s\n",super.getHouseAddress());
        super.printFather();
    }
}
