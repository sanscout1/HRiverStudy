package JAVA.Java_Lecture.About_network.serversocket.ex01;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class server01 {

    public static void main(String[] args) {
        try {
            // 1. 서버 소켓 생성
            ServerSocket serverSocket = new ServerSocket(50001);
            // 2, 클라이언트의 소캣과 접속 할수 있도록 accept 서버 소컷에 바인드
            System.out.println("소켓 서버 시작");
            Socket socket = serverSocket.accept();
            // 소켓이 들어올 때까지 accept 는 계속 실행 상태 유지한다. 들어오면 밑에 문구 출력됨
            System.out.println("소켓 요청 시작");

            // client 가 보낸 메시지 받기
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message = br.readLine();
            System.out.println("client : " + message);


            // client에 메시지 보내기
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("Soo");
            bw.newLine();
            bw.flush();


            // 4. 소켓 종료
            br.close();
            bw.close();
            socket.close();
            System.out.println("소켓 종료");
            // 5. 서버 소켓 종료
            serverSocket.close();
        } catch (Exception e){}
    }
}
