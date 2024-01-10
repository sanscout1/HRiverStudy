package Java_Lecture.About_Stream.StreamPack02.product;

public class Product {
    private String name;
    private String company;
    private int productNo;
    private Integer price;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", productNo=" + productNo +
                ", price=" + price +
                '}';
    }

    public Product(String name, String company, int productNo, Integer price) {
        this.name = name;
        this.company = company;
        this.productNo = productNo;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getProductNo() {
        return productNo;
    }

    public Integer getPrice() {
        return price;
    }
}
