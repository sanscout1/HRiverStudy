package JAVA.Java_Lecture.About_IO;

// c://temp/test1.text  파일에 10 20 30 데이터를 쓰자

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriterEx01 {

    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("C:/Temp/test1.text");
//            byte a = 10;
//            byte b = 20;
//            byte c = 30;
            byte[] d = {10,20,30,40,50};
//            os.write(a);
//            os.write(b);
//            os.write(c);

            os.write(d);
            os.write(d,0,d.length);
            os.flush();
            os.close();

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
