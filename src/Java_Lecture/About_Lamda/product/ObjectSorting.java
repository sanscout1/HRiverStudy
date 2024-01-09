package Java_Lecture.About_Lamda.product;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ObjectSorting {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(new Product("laptop",150000.0),
                new Product("applePhone",300000.0),
                new Product("Tablet",50000.0),
                new Product("mouse",5000.0));

        List<Product> sortedProducts = products.stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .toList();
        products.forEach(System.out::println);
        System.out.println("정렬후");
        sortedProducts.forEach(System.out::println);

     }
}
