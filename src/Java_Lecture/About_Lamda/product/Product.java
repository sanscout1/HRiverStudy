package Java_Lecture.About_Lamda.product;

class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product1{" +
                "name=" + name +
                ", price=" + price +
                '}';
    }

    public double getPrice() {
        return price;
    }
}
