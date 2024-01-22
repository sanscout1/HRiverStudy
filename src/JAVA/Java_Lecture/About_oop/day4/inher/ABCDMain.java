package JAVA.Java_Lecture.About_oop.day4.inher;

class A {
    private int numberA;

    A() {
    }

    public int getNumberA() {
        return numberA;
    }

    public void printNumberA() {
        System.out.println(getNumberA());
        ;
    }
}

class B extends A {
    private int numberB;

    B() {
        super();
        printNumberB();
    }

    public int getNumberB() {
        return numberB;
    }

    public void printNumberB() {
        System.out.println(getNumberB());
    }
}

class C extends B {
    private int numberC;

    public int getNumberC() {
        return numberC;
    }

    public void printNumberC() {
        System.out.println(getNumberC());
    }
}

class D extends C {
    private int numberD;

    public int getNumberD() {
        return numberD;
    }

    public void getAllInfo() {
        super.printNumberA();
        super.printNumberB();
        super.printNumberC();
        System.out.println(getNumberD());
    }
}

public class ABCDMain {
    public static void main(String[] args) {
        B b = new B();
        b.getNumberB();
        b.getNumberA();
        b.printNumberB();
        b.printNumberA();

        A a = new B();
        a.getNumberA();
        a.printNumberA();

        D d = new D();
        d.getAllInfo();

    }
}
