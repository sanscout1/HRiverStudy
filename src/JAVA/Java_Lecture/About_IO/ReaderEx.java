package JAVA.Java_Lecture.About_IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("C:/Temp/test3.text");

//        while (true){
//            int data = reader.read();
//            char data2 = (char) data;
//
//                if(data == -1) break;
//            System.out.println(data2);
//            sb.append(data2);
//
//        }
//        System.out.println(sb);
        char[] data3 = new char[20];
        while (true){
            int n = reader.read(data3);
            // read 함수인자로 char배열 넣으면 알아서 char로 넣어준다.

                if(n == -1) break;
            for(char c : data3){
                System.out.println(c);
            }
        }


        reader.close();

    }
}
