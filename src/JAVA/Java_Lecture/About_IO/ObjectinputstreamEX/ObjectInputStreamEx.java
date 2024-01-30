package JAVA.Java_Lecture.About_IO.ObjectinputstreamEX;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectInputStreamEx {

    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("src/JAVA/Java_Lecture/About_IO/object.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // 객체생성
        Member member = new Member("박진영",20);
        int[] arry = {1,2,3};
        // 객체를 역직렬화해서 파일에 저장
        oos.writeObject(member);
        oos.writeObject(arry);

        oos.flush();
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("src/JAVA/Java_Lecture/About_IO/object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Member m1 = (Member)ois.readObject();
        int[] arr2 = (int[])ois.readObject();

        ois.close();
        fis.close();

        System.out.println(m1);
        System.out.println(Arrays.toString(arr2));

    }

}
