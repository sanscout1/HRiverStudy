package test;

public class C {
    public static void main(String[] args) {
        A s1 , s2;
        B x1, x2;

        s1 = new A();
        s2 = new A();

        x1 = new B();
        x2 = new B();

        s1.a1();
        s2.a1();
        s1.a2();
        x1.b1();
        x2.b2();
        String data = s1.a3();
        x1.b3(data);

        System.out.println(x2.b4(s2.a3()));
    }
}
