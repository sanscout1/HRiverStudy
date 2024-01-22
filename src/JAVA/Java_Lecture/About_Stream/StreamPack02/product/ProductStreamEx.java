package JAVA.Java_Lecture.About_Stream.StreamPack02.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import static java.lang.Math.random;

public class ProductStreamEx {
    public static void main(String[] args) {

        // 1. 외부반복자 fori 를 이용하여 product를 생성할떄 제품번호 => i , 상품명 => "상품명"+i, 회사 "Shinsegae,
        // 가격 random() 메서드로 책정하여 10개 생상하여 리스트 컬렉션 productList에 저장
        List<Product> products = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            products.add(new Product("상품명"+i,"Shinsegae",i, (int) (random()*10000)));
        }

        Random random = new Random();
        random.nextInt(10000); //이렇게도 가능


        // 2. 객체 스트림을 통하여 productList 의 상품정보를 출력

        Stream<Product> productStream = products.stream();
        productStream.forEach(System.out::println);
    }
}
