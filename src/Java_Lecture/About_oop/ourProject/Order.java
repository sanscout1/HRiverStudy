package Java_Lecture.About_oop.ourProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    static String adName = "홍길동";
    static String adPhone = "1234";

    public void run() {
        Scanner sc = new Scanner(System.in);
        String name;
        String tel;

        int choiceNum; // 메뉴 선택번호

        ArrayList<Book> bookMall = new ArrayList<>(); // 이 쇼핑몰 책리스트

        Book book1 = new Book("ISBN1234", "쉽게 배우는 JSP 웹 프로그래밍", 27000, "송미영", "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍", "IT전문서", "2018/10/06");
        Book book2 = new Book("ISBN1235", "안드로이드 프로그래밍", 33000, "우재남", "실습 단계별 명쾌한 멘토링!", "IT전문서", "2022/01/22");
        Book book3 = new Book("ISBN1236", "스크래치", 22000, "고광일", "컴퓨터 사고력 키우는 블록 코딩", "컴퓨터입문", "2019/06/10");

        bookMall.add(book1);
        bookMall.add(book2);
        bookMall.add(book3);

        User cus1 = null;
        Admin admin = null;

        System.out.print("당신의 이름을 입력하세요 : ");
        name = sc.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        tel = sc.nextLine();
        if (adName.equals(name) && adPhone.equals(tel)) {
            admin = new Admin(adName, adPhone, "Admin", "Admin1234");

        } else {
            cus1 = new User(name, tel); // 고객생성
        }

        OrderService orderService = new OrderService(cus1);

        System.out.println("******************************\n");
        System.out.println("\tWelcom to Shopping Mall");
        System.out.println("\tWelcom to Book Market");

        while (true) {
            orderService.printMenu();

            choiceNum = sc.nextInt();
            sc.nextLine();

            switch (choiceNum) {
                case 1 -> {
                    if (admin != null) {
                        System.out.println("관리자 입니다 다시 선택해주세요");
                    } else {
                        orderService.serviceCustomerPrint();
                    }
                }
                case 2 -> {
                    if (admin != null) {
                        System.out.println("관리자 입니다 다시 선택해주세요");
                    } else {
                        orderService.servicePrintCartList();
                    }
                }
                case 4 -> {
                    if (admin != null) {
                        System.out.println("관리자 입니다 다시 선택해주세요");
                    } else {
                        orderService.serviceAddBook(bookMall);
                    }
                }
                case 8 -> {
                    System.out.println("종료");
                    System.exit(0);
                }
                case 9 -> {
                    if (admin != null) {
                        admin.menuAdminLogin();
                    } else {
                        System.out.println("관리자 권한이 없습니다. 다시 선택해주세요");
                    }

                }
                default -> {
                    System.out.println("1부터 8까지 중에 입력하세요.");
                }
            }
        }
    }
}
