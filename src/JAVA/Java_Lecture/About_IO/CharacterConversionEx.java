package JAVA.Java_Lecture.About_IO;


import java.io.*;
import java.nio.charset.StandardCharsets;

public class CharacterConversionEx {

    // UTF-8 문자셋으로 파일에 문자열을 저장하고, 파일에 저장된 문자를 다시 읽어서 출력하는 프로그램

    public static void main(String[] args) throws Exception {

        write("너에게 나를 보낸다.");
        read();
        read1();

    }

    public static void write(String str) throws Exception {

        OutputStream os = new FileOutputStream("src/JAVA/Java_Lecture/About_IO/data.txt");
        Writer writer = new OutputStreamWriter(os, StandardCharsets.UTF_8);
        writer.write(str);
        writer.flush();
        writer.close();

    }

    public static void read()  throws Exception {

        InputStream is = new FileInputStream("src/JAVA/Java_Lecture/About_IO/data.txt");
        Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8);
        char[] data = new char[100];
        int num = reader.read(data);   // 문자열을 읽으면 문자수를 리턴해줌
        reader.close();

        String str = new String(data,0,num);
        System.out.println(str);
    }

    public static void read1()  throws Exception {
        //위와 동일함
        FileReader is = new FileReader("src/JAVA/Java_Lecture/About_IO/data.txt");
        BufferedReader reader = new BufferedReader(is);
        String str=reader.readLine();
        reader.close();
        System.out.println(str);
    }
}
