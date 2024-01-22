package JAVA.Java_Lecture.About_class_basic;

class  Book {
    String company;
    String bookTitle;
    int price;
}

class Member{
    String name;
    String memberNo;

}





public class JavaTest01 {
    public static void main(String[] args) {
        int a,b,c;

        a=20;
        b=30;
        c=a*b;

        System.out.println("a = "+a+" b = "+b+" c = "+c);

        float f= 34.5f;
        System.out.println(f);

        char d = 'A';
        System.out.println(d);

        boolean e= true;
        System.out.println(e);

        Book book = new Book();
        Member m1 = new Member();

        m1.name="이한강";
        m1.memberNo="1234NO";
        System.out.println("name : "+ m1.name);
        System.out.println("memberNo : "+ m1.memberNo);

        Member m2 = new Member();

        m2.name="이강";
        m2.memberNo="12NO";
        System.out.println("name : "+ m2.name);
        System.out.println("memberNo : "+ m2.memberNo);

        int a1=10;
        int b1=a1;
        int c1 = b1*10;

        int sum=0;
        sum += 1;
        System.out.println(sum);
        sum += 2;
        System.out.println(sum);
        sum += 3;
        System.out.println(sum);
        sum += 4;
        System.out.println(sum);
        sum += 5;
        System.out.println(sum);
        int x=10;
        int y=20;

        int temp ;

        temp = x;
        x= y;
        y= temp;
        System.out.println(x);
        System.out.println(y);
    }
}
