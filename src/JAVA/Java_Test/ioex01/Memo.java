package JAVA.Java_Test.ioex01;

import lombok.Getter;

public class Memo {
    @Getter
    private int id;
    private String name;
    private String content;
    private String date;
    private String nice;

    public Memo(int id, String name, String content, String date, String nice) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.date = date;
        this.nice = nice;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", date='" + date + '\'' +
                ", 우선도 ='" + nice + '\'' +
                '}';
    }
    public String memoInfo(){
        return String.valueOf(id)+','+name+','+content+','+date+','+nice;
    }
}
