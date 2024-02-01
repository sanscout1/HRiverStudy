package JAVA.Java_Lecture.About_network.serversocket.ex01;

import java.io.*;
import java.net.Socket;

public class client01 {
    public static void main(String[] args) {
        try  {
            Socket socket = new Socket("127.0.0.1",50001);

            // 서버에 데이터 보내기
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            bw.write("HRiver");
            bw.newLine();
            bw.flush();


            // 서버에 받은 데이터 출력
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message = br.readLine();
            System.out.println("client : " + message);



            br.close();
            bw.close();
            socket.close();
        } catch (Exception e) {}
    }
}
