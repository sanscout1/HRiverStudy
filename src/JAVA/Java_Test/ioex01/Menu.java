package JAVA.Java_Test.ioex01;

import java.util.Scanner;

public class Menu {

    MemoDao memoDao = MemoDao.getInstance();
    Scanner sc =new Scanner(System.in);
    public void printMenu() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("메모 추가: 1 | 메모 검색: 2 | 메모 리스트: 3 | 메모 삭제: 4 | 저장: 5");
        System.out.println("-------------------------------------------------------------------");
        System.out.println();
        menu();
    }

    private void menu() {

        try {
            String menuInput = sc.nextLine();  // 메뉴 선택

            switch (menuInput) {
                case "1" -> memoDao.writeMemo("이한강");  // 메모 추가
                case "2" -> {               // 읽을 메모
                    System.out.println("확인할 메모 번호를 입력하세요");
                    System.out.print("번호 입력 : ");
                    int choice = Integer.parseInt(sc.nextLine());
                    memoDao.getMemo(choice);
                }
                case "3" -> { // 메모 리스트
                    memoDao.getMemoList();
                }
                case "4" -> {
                    memoDao.getMemoList();
                    System.out.println("삭제할  메모 번호를 입력하세요");
                    System.out.print("번호 입력 : ");
                    int choice = Integer.parseInt(sc.nextLine());
                    memoDao.delete(choice);  // 메모 삭제
                }
                case "5" -> memoDao.saveMemo();    // 저장
                default -> {
                    printMenu();
                }
            }
            printMenu();
        } catch (Exception e) {}
    }
    }

