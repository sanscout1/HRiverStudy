package JAVA.Java_Lecture.About_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx01 {

    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("C:/Temp/test1.text");

            while (true){
                int data = is.read();
                if(data == -1){
                    break;   //EOF
                }
                System.out.println(data);
            }


        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
