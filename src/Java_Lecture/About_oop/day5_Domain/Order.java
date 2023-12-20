package Java_Lecture.About_oop.day5_Domain;

import java.util.ArrayList;

public class Order {

    private ArrayList<OrderLine> List;

    private Money totalAmounts;

    private ShippingInfo shippingInfo;
    private OrderState state;
}
