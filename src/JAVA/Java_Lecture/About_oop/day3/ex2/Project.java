package JAVA.Java_Lecture.About_oop.day3.ex2;

import java.util.ArrayList;
import java.util.Scanner;

class Order {
    public void run(){
        Scanner sc = new Scanner(System.in);
        String name;
        String tel;
        ArrayList<Book> bookMall = new ArrayList<>(); // 이 쇼핑몰 책리스트
        int choiceNum; // 메뉴 선택번호
        String inputId = ""; // 입력받는 책아이디
        String inputTF;   // 장바구니 추가하겠습니까? Y|N

        Book book1 = new Book("ISBN1234", "쉽게 배우는 JSP 웹 프로그래밍", 27000, "송미영", "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍", "IT전문서", "2018/10/06");
        Book book2 = new Book("ISBN1235", "안드로이드 프로그래밍", 33000, "우재남", "실습 단계별 명쾌한 멘토링!", "IT전문서", "2022/01/22");
        Book book3 = new Book("ISBN1236", "스크래치", 22000, "고광일", "컴퓨터 사고력 키우는 블록 코딩", "컴퓨터입문", "2019/06/10");

        bookMall.add(book1);
        bookMall.add(book2);
        bookMall.add(book3);

        System.out.print("당신의 이름을 입력하세요 : ");
        name = sc.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        tel = sc.nextLine();

        Customer cus1 = new Customer(name, tel); // 고객생성
        System.out.println("******************************\n");
        System.out.println("\tWelcom to Shopping Mall");
        System.out.println("\tWelcom to Book Market");

        while (true) {
            System.out.println();
            System.out.println("******************************");
            System.out.println("1. 고객 정보 확인하기");
            System.out.println("2. 장바구니 상품 목록보기");
            System.out.println("4. 바구니에 항목 추가하기");
            System.out.println("8. 종료");
            System.out.println("******************************");
            System.out.print("\n메뉴 번호를 선택해주세요 ");
            choiceNum = sc.nextInt();
            sc.nextLine();

            switch (choiceNum) {
                case 1 -> {
                    System.out.println("고객 정보확인");
                    cus1.printCustomerInform(); // 고객 이름, 전화번호 출력
                }
                case 2 -> {
                    System.out.println("장바구니 상품목록 보기");
                    if (!cus1.getBookCart().isEmpty()) { // 장바구니가 비어있지 않으면 장바구니 리스트 출력
                        cus1.printCartList();
                    } else {
                        System.out.println("장바구니가 비었습니다.");
                    }
                }
                case 4 -> {
                    boolean bookIs = true;

                    System.out.println();
                    for (Book book : bookMall) { // 쇼핑몰 책리스트 출력
                        book.bookPrint();
                    }
                    while (bookIs) { // false 나올때까지 반복
                        System.out.print("\n장바구니에 추가할 도서의 ID를 입력하세요 ");
                        inputId = sc.nextLine();

                        for (Book book : bookMall) {
                            if (inputId.equals(book.getBookId())) {
                                bookIs = false;
                                // 입력받은 book아이디랑 쇼핑몰 책 리스트에 같은이름이 있으면 이 if문에 들어오고 bookIs는 false가 되어서 for문 빠져나옴
                            }
                        }
                        if (bookIs) { // 같은 이름이 없으면 true 니까 if 실행 그리고 while 반복
                            System.out.println("목록에 그런 책이없습니다.");
                        }
                    }


                    System.out.print("장바구니에 추가하시겟습니까? (Y|N) "); //
                    inputTF = sc.nextLine();
                    if (inputTF.equalsIgnoreCase("Y")) {
                        for (Book book : bookMall) {
                            if (book.getBookId().equals(inputId)) {
                                cus1.addBookCart(book); // Y면 장바구니에 추가
                                System.out.println(book.getBookId() + " 도서가 장바구니에 추가되었습니다.");
                            }
                        }

                    } else if (inputTF.equalsIgnoreCase("N")) {
                        System.out.println("N입력");
                    } else {
                        System.out.println("다른 문자 입력,다시 입력 해주세요");
                    }
                }
                case 8 -> {
                    System.out.println("종료");
                    System.exit(0);
                }
                default -> {
                    System.out.println("1부터 8까지 중에 입력하세요.");
                }
            }
        }
    }
}
public class Project {
    public static void main(String[] args) {
        Order od = new Order();
        od.run();
    }
}
