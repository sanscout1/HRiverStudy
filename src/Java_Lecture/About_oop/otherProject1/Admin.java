package Java_Lecture.About_oop.otherProject1;

public class Admin extends User {
    private final String id = "Admin";
    private final String password = "Admin1234";

    public Admin(String name, String contact) {
        super(name, contact);
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}