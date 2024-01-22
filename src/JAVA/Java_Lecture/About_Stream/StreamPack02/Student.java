package JAVA.Java_Lecture.About_Stream.StreamPack02;

public class Student implements Comparable<Student> {
    private String name;
    private Integer score;
    private Integer korscore;
    private Integer engscore;

    public Student(String name,Integer korscore, Integer engscore, Integer mathscore) {
        this.name = name;
        this.korscore = korscore;
        this.engscore = engscore;
        this.mathscore = mathscore;
    }

    public Integer getKorscore() {
        return korscore;
    }

    public Integer getEngscore() {
        return engscore;
    }

    public Integer getMathscore() {
        return mathscore;
    }

    private Integer mathscore;


    public Student(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public Integer getScore() {
        return score;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(korscore,o.korscore);
    }
}
