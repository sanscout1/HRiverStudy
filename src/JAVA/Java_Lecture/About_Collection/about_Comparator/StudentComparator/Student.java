package JAVA.Java_Lecture.About_Collection.about_Comparator.StudentComparator;

/*
과제1)
        Student 클래스가 있다.
        5명의 학생들의 정보를 관리하기 위해
        Student 배열을 생성하여, 학번순으로 정렬해서 나타내고자 한다.  Comparable을 이용하여 정렬하세요

        과제2)
        Comparable을 이용해 학번 오름차순대로 정렬을 하였다.
        이 5명의 학생들 중에 성적우수자 2명을 선정하여 장학금을 지급하려 한다.
        이 때, 성적이 같은 학생이 여러 명이라면 학번이 빠른 순서대로 정하려고 한다.
        성적이 높은 학생 2명을 편하게 찾기 위해서 학생들을 "성적이 높은 순으로 정렬한 뒤, 앞에서 2명을 선택"

        성적이 높은 순서대로 정렬하는 후
        Student클래스의 기본 정렬 기준은 "학번 오름차순"이므로 이 기본 정렬 기준과 다른 새로운 정렬 기준을 세워야 하므로, Comparator를 이용하여
        Arrays.sort()내부에 정렬 기준으로 구현하시오.

        정렬 조건
        1) 학점이 높은 순서대로 (학점 내림차순)
        2) 학점이 같다면 학번이 빠른 순서대로(학번 오름차순)
        */

public class Student implements Comparable<Student>{
    String name; //이름
    int id; //학번
    double score; //학점
    public Student(String name, int id, double score){
        this.name = name;
        this.id = id;
        this.score = score;
    }
    public String toString(){ //출력용 toString오버라이드
        return "이름: "+name+", 학번: "+id+", 학점: "+score;
    }

    @Override
    public int compareTo(Student o) {
        //과제 1
        return Integer.compare(this.id,o.id);


    //  과제1 두번째 방법
//          return COMPARATOR.compare(this,o);
    }
//       public static final Comparator<Student> COMPARATOR =
//        Comparator.comparingInt((Student stuTmp) -> stuTmp.id );//     과제1 두번째 방법







}
