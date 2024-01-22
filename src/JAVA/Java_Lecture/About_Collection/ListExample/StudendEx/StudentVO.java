package JAVA.Java_Lecture.About_Collection.ListExample.StudendEx;

public class StudentVO {
    private String stuno;
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int[] score = new int[3];   // kor, eng , math

    public String getStuno() {
        return stuno;
    }

    public void setStuno(String stuno) {
        this.stuno = stuno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public StudentVO(String stuno, String name) {
        this.stuno = stuno;
        this.name = name;
    }

    public int[] getScore() {
        return score;
    }

    public void setScore(int[] score) {
        this.score = score;
    }
}
