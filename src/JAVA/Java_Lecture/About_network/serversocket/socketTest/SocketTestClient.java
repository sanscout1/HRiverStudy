package JAVA.Java_Lecture.About_network.serversocket.socketTest;

import java.io.*;
import java.net.Socket;

public class SocketTestClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",50001);
        // 클라이언트는 소켓을 보낼 ip 와 포트를 명시한다.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("클라이언트메세지");
        bw.newLine();  // 이거 주석처리 하면 br.readline이 개행문자 기준으로 문자열을 읽는거라 읽지 못한다 서버에서
        bw.flush();


        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String message = br.readLine();
        System.out.println(message);


        System.out.println("클라이언트 종료");
        bw.close();
        br.close();
        socket.close();



    }
}
