package JAVA.Java_Lecture.About_IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx {

    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("C:/Temp/test3.text");
        char a = 'A';
        writer.write(a);
        char b = 'B';
        writer.write(b);

        char[] c = {'이', '한', '강'};
        writer.write(c);

        String str = "신세계 자바 과정";
        writer.write(str);
        writer.flush();
        writer.close();

    }
}
