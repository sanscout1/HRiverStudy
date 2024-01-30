package JAVA.Java_Lecture.About_IO;

import java.io.*;

public class BufferReaderEx {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("src/JAVA/Java_Lecture/About_IO/test.txt"));
        String str1 = "test 생성1";
        String str2 = "test 생성2";
        bw.write(str1);
        bw.newLine();
        bw.write(str2);
        bw.flush();
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("C:/Temp/test3.text"));
        String str;
        while (true) {
            str = br.readLine();
            if(str == null) break;
            System.out.println(str);
        }

    }
}
