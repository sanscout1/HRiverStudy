package JAVA.Java_Lecture.About_Stream.StreamPack03.collect;

public class Member {
    private String name;
    private Integer no;
    private String gender;
    private Integer point;

    public Member(Integer no, String name,  String gender) {
        this.name = name;
        this.no = no;
        this.gender = gender;
    }


    public void setPoint(Integer point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", no=" + no +
                ", gender='" + gender + '\'' +
                ", point=" + point +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getNo() {
        return no;
    }

    public String getGender() {
        return gender;
    }

    public Integer getPoint() {
        return point;
    }
}
