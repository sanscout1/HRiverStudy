package JAVA.Java_Lecture.About_String;

public class About_StringBuilder {
    public static void main(String[] args) {


        String blank = "";
        if(blank.equals("")){
            System.out.println("blank가 참조하는 String 객체는 빈 문자열");
        }
            StringBuilder str = new StringBuilder();
        StringBuilder strTmp = new StringBuilder();
        //문자 추출
        strTmp.append("자바").append("네트워크");
        strTmp.append(3);
        String subjectTmp =strTmp.toString();
        System.out.println(subjectTmp);
        String subject ="자바 네트워크 프로그래밍";
          char charValue = subject.charAt(4);
          for(int i=0;i<4;i++){
              System.out.printf("%s",subject.charAt(i+3));

              str.append(subject.charAt(i+3));

          }

        System.out.println(str);


    }
}
