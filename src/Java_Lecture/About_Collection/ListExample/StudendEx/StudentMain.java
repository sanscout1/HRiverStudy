package Java_Lecture.About_Collection.ListExample.StudendEx;

public class StudentMain {
    public static void main(String[] args) {
        StudentDao dao = new StudentDao();

        dao.getStudent();
        dao.studentExamInsert();
        dao.studentRecordPrint();
        dao.studentUpdate();
        dao.studentPrintAll();
        dao.studentPickPrint();
    }
}
