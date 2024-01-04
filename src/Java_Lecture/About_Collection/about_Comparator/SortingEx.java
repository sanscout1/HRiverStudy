package Java_Lecture.About_Collection.about_Comparator;

public class SortingEx {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        System.out.println(compare(x,y));
    }

    //compare 함수 기본 구조
    public static int compare(int x , int y){

        return  x<y ? -1 : ((x==y) ? 0 :1);
    }
}
