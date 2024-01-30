package JAVA.Java_Lecture.About_IO.ioex01;

public class Memo {
    private String id;
    private String name;
    private String content;
    private String date;
    private String nice;

    public Memo(String id, String name, String content, String date, String nice) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.date = date;
        this.nice = nice;
    }

    @Override
    public String toString() {
        return "Memo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", date='" + date + '\'' +
                ", nice='" + nice + '\'' +
                '}';
    }
}
