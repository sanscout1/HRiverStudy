package JAVA.Java_Lecture.About_oop.day4.inher.family;

public class SubFather extends GrandFather{

    private String houseAddress;
    private String job;

    public String getHouseAddress() {
        return houseAddress;
    }

    public String getJob() {
        return job;
    }

    SubFather(){}

    SubFather(String houseAddress,String job){
        this.houseAddress=houseAddress;
        this.job=job;
    }

    void printFather(){
        System.out.println("나는 아버지입니다! 나는 할아버지로부터 상속받습니다.");
        super.printGrandFather();
    }
}
