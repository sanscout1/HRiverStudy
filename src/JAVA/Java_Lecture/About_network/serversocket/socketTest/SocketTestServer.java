package JAVA.Java_Lecture.About_network.serversocket.socketTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTestServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(50001);
            // 서버 소켓 생성시 포트 번호를 지정해준다.
            System.out.println("서버 포트 생성");
            Socket socket = serverSocket.accept();
            // 서버는 소켓에 서버소켓 accpet를 해서 소켓을 만든다.
            System.out.println("서버 소켓 시작");

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String message = br.readLine();
            System.out.println(message);


            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("서버의 메시지");
            bw.newLine();
            bw.flush();


            System.out.println("서버 종료");
            br.close();
            bw.close();
            socket.close();
            serverSocket.close();


        } catch (Exception e){}
    }
}
