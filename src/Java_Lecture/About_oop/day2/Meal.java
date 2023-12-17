package Java_Lecture.About_oop.day2;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    // - (private 접근 제한자로 설정)
    private List<Item> itemList = new ArrayList<Item>();   //순서가 있는 객체 저장 자료구조

    public void addItem (Item item){
        itemList.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : itemList) {   //iter
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : itemList) {
            System.out.print("Item : "+ item.name());
            System.out.print(", Packing : "+ item.packing().pack());
            System.out.println(", Price : "+ item.price());
        }
    }

}
