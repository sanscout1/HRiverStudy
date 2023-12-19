package Java_Lecture.About_oop.day4.inher;

public class ParentCat {

    private String breed;

    ParentCat(){}

    ParentCat(String breed){
        this.breed=breed;
    }
    public void eat(){
        System.out.println("냠냠 먹이먹기");
    }

    public void getBreed(){
        System.out.println(this.breed);
    }
}
