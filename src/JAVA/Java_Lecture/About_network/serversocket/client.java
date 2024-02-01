package JAVA.Java_Lecture.About_network.serversocket;

import java.net.Socket;

public class client {
    public static void main(String[] args) {
        try  {
            Socket socket = new Socket("127.0.0.1",50001);
            socket.close();
        } catch (Exception e) {}
    }
}
