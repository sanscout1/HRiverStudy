package Java_Lecture.About_API;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    public static void main(String[] args) {
        ThrowsException test = new ThrowsException();

        try {
            test.loadClass("src/Java_Lecture/About_API/data.txt","java.lang.String");
        } catch (FileNotFoundException  | ClassNotFoundException cf){ //Surround try/multi-catch 선택하여 생성
            cf.printStackTrace();  //예외처리 내용들을 파일에 저장 -> log
        }   catch (Exception e){   // 하위 예외 처리 클래스를 사용하고 최상위 클래스를 작성해야함
            e.printStackTrace();
        }
    }
  // 함수에서 발생하는 예외 처리는 throws 를 통해 main 문에 있는 예외 작성 한 곳으로 이동 하게 한다.
    //throws 예외 처리를 미루는 것 : 예외를 호출한 곳으로 보내주는 것

    //throws 는 trycatch를 해야되는 경우지만 다른 곳에서 trycatch 하고자 할때 이용한다.
    private Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c  = Class.forName(className);
        return c;
    }
}
