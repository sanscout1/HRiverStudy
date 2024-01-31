package JAVA.Java_Test.BookProjectList.BookProject_4th.MAPPER;



import JAVA.Java_Test.BookProjectList.BookProject_4th.VO.Book;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class BookMapper  {
    Map<String, Book> booklist = new HashMap<>();
    Map<Integer, Map<String,Book>> Cart = new HashMap<>();
    public BookMapper() {
        booklist.put("ISBN1234", new Book("ISBN1234", "쉽게 배우는 JSP 웹 프로그래밍", 27000, "송미영", "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍", "IT전문서", "2018/10/08"));
        booklist.put("ISBN1235", new Book("ISBN1235", "안드로이드 프로그래밍", 33000, "우재남", "실습 단계별 명쾌한 멘토링!", "IT전문서", "2022/01/22"));
        booklist.put("ISBN1236", new Book("ISBN1236", "스크래치", 22000, "고광일", "컴퓨팅 사고력을 키우는 블록 코딩", "컴퓨터 입문", "2019/06/10"));
    }

    public Map<String, Book> showBookList (){
        return booklist;
    }
    public List<Book> showCartList (int id){
        return Cart.get(id).values().stream().toList();
    }
    public void addCartList(int userid,String bookid){
        Map<String, Book> bookcart = new HashMap<>();
        bookcart.put(bookid,booklist.get(bookid));
        Cart.put(userid,bookcart);
    }

    public Map<Integer, Map<String, Book>> getCart() {
        return Cart;
    }

    @Override
    public String toString() {
        booklist.values().stream().map(Book::toString).forEach(System.out::println);
        return null;
    }
}
