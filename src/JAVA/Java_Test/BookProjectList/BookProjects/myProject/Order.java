package JAVA.Java_Test.BookProjectList.BookProjects.myProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    static Scanner sc = new Scanner(System.in);
    String inputName;
    String inputTel;
    ArrayList<Book> bookMall = new ArrayList<>(); // 이 쇼핑몰 책리스트
    public void run() throws InterruptedException {

        fillBookMall();
        inputData();

        User cus1 = new User(inputName, inputTel);
        BookService bookService1 = new BookService();
        OrderService orderService = new OrderService(cus1,bookService1);

        System.out.println("******************************\n");
        System.out.println("\tWelcom to Shopping Mall");
        System.out.println("\tWelcom to Book Market");

        while (true) {
            orderService.printMenu();


            switch (sc.nextInt()) {
                case 1 -> {

                    orderService.serviceCustomerPrint();
                    Thread.sleep(1000);

                }
                case 2 -> {

                    orderService.servicePrintCartList();
                    Thread.sleep(1000);
                }
                case 4 -> {

                    orderService.serviceAddBook(bookMall);
                    Thread.sleep(1000);
                }
                case 8 -> {
                    System.out.println("종료");
                    System.exit(0);
                }
                case 9 -> {

                    AdminService adminService = new AdminService();
                    adminService.menuAdminLogin(cus1);
                    Thread.sleep(1000);
                }
                default -> {
                    System.out.println("1부터 8까지 중에 입력하세요.");
                    Thread.sleep(1000);
                }
            }
        }
    }

    private void inputData(){
        System.out.print("당신의 이름을 입력하세요 : ");
        inputName = sc.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        inputTel = sc.nextLine();
    }

    private void fillBookMall(){
        Book book1 = new Book("ISBN1234", "쉽게 배우는 JSP 웹 프로그래밍", 27000, "송미영", "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍", "IT전문서", "2018/10/06");
        Book book2 = new Book("ISBN1235", "안드로이드 프로그래밍", 33000, "우재남", "실습 단계별 명쾌한 멘토링!", "IT전문서", "2022/01/22");
        Book book3 = new Book("ISBN1236", "스크래치", 22000, "고광일", "컴퓨터 사고력 키우는 블록 코딩", "컴퓨터입문", "2019/06/10");

        bookMall.add(book1);
        bookMall.add(book2);
        bookMall.add(book3);
    }

}
