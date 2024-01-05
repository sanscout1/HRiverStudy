package Java_Lecture.About_Collection.GenericEx;

import java.util.ArrayList;
import java.util.List;

// 모든 타입의 객체를 담을수 있는 box 제너릭 클래스 생성
//  객체는 items 라는 ArrayList 에 저장됩니다.
// 상자에 box 객체를 추가하고(addItem) 상자에서 객체를 검색하고(getItem) 상자가 비어있는지 확인하는 메서드(isEmpty)를 작성하세요
public class Box <T>{
    private List<T> items;

    public Box() {
        items=new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public T getItem() {
        if(!items.isEmpty()){
        return items.get(0);}
        return null;
    }
    public boolean isEmpty() {
        return items.isEmpty();
    }
}
