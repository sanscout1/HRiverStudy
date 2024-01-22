package JAVA.Java_Lecture.About_String;

import java.util.ArrayList;

public class ArrayListExample_spilt_substring {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("1 ");
        arrayList.add("2 ");
        arrayList.add("3 ");
        arrayList.add("4 ");
        arrayList.add("5 ");

        for(String s : arrayList){
            System.out.println(s);
        }

        String oldStr = "자바 문자열은 불변의 특징이 있다. 자바 문자열은 String타입이다.";
        String newStr = String.valueOf(oldStr).replace("자바","Java");
        String subject ="자바 네트워크 프로그래밍";
        System.out.println(newStr);


        //3. 문자열 잘라내기 substring();
        System.out.println(oldStr.substring(20));

        String ssn = "931224-1078213";
        int age = Integer.parseInt(ssn.substring(0,2));
        //System.out.println(age);
        String isMaleFemale = ssn.substring(7,8);
        //System.out.println(isMaleFemale);


        System.out.printf("내 나이는 %d \n",123-age+1);
        if(isMaleFemale.equals("1")){
            System.out.println("내 성별은 남자");
        }
        if(isMaleFemale.equals("2")){
            System.out.println("내 성별은 여자");
        }


        //String subject ="자바 네트워크 프로그래밍";  에서 프로 시작하는 문자 찾기
        int index = subject.indexOf("프로그래밍");
        if(index==-1){
            System.out.println("존재하지 않는 문자열입니다.");
        } else {
            System.out.println(index);
            System.out.println("존재함");
        }

        boolean subjectContaion = subject.contains("프로그래밍");

        if(subjectContaion) {
            System.out.println("포함되어 있습니다.");
        } else {
            System.out.println("포함되어 있지 않습니다.");
        }

        String board = "번호 ,제목 ,내용 ,이름";
        String[] th = board.split(" ,");
        for(int i =0; i<th.length;i++) {
            System.out.println(th[i]);
        }


    }
}
