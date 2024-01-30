package JAVA.Java_Lecture.About_IO;

import java.io.*;

public class FileCopyEx {

    public static void main(String[] args) throws IOException {
        String originFileName = "C:/Temp/testimg.png";
        String targetFileName = "C:/Temp/testimg1.png";
        String target2FileName = "C:/Temp/testimg2.png";

        InputStream is = new FileInputStream(originFileName);
        InputStream is2 = new FileInputStream(originFileName);
        OutputStream os = new FileOutputStream(targetFileName);
        OutputStream os2 = new FileOutputStream(target2FileName);

        byte[] data = new byte[600000];
        while (true){
            int num = is.read(data);
            if(num == -1) break;
            os.write(data,0,num);
            //os.write(data);

        }

        is2.transferTo(os2);  // 이거 한줄로 위에거 다 처리함
        // 스트림이라 한번 사용하면 재사용이 불가능하다, 재사용처럼 쓸려면 새로 변수 만들어야한다.

        os.flush();
        os.close();
        is.close();
        System.out.println("EOF");
    }
}
