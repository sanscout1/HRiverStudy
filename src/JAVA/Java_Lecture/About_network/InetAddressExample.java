package JAVA.Java_Lecture.About_network;


import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) {
        try {
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("내 컴퓨터 IP 주소: " + local.getHostAddress());

            InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
            // 클라이언트 분배하기 위하여 ip 2개로 나누어서 등록한 것

            for(InetAddress remote : iaArr) {
                System.out.println("www.naver.com IP 주소: " + remote.getHostAddress());
            }
        } catch(UnknownHostException e) {
            e.printStackTrace();
        }
    }
}