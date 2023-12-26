package Java_Lecture.About_oop.day1;

public class PersonMain {
    public static void main(String[] args) {
//        Person sinsae = new Person("신세계",20,"서울시 강남구","010-1234-4568");
//        sinsae.personInformation();

        Person sinsae = new Person.Builder("신세계",20,"서울시 강남구","010-1234-4568").build();
        sinsae.personInformation();

    }
}
