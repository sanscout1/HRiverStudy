package Java_assignments.HR_usecaseAssignment;
//상품 등록,관리
public class Product {
    private String productName;
    private String brandCode;
    private String originCountry;
    private String manufacturer;
    private int price;
    Product(){}
    Product(String productName,String brandCode,String originCountry,String manufacturer, int price){
        this.productName=productName;
        this.brandCode=brandCode;
        this.originCountry=originCountry;
        this.manufacturer=manufacturer;
        this.price=price;
    }
    //필요한 정보는 더 있지만 구상하는게 목표이니 이정도만 작성

    public void changeDataOfProduct(){
    }
    public void getProduct(){
        System.out.printf("상품명 : %s , 브랜드코드 : %s , 원산지 : %s , 제조사 : %s , 가격 : %d\n",productName,brandCode,originCountry,manufacturer,price);
    }
}
