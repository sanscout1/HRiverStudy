package Java_Lecture.About_oop.day_interface.privateInterface;

public interface Service {
    //1 상수
    public static int A = 1;

    //2 추상메서드
    public int b ();
    //3 deault 메소드

    default  void defaultMethod1(){
        System.out.println("defaultMethod1()의 코드");
        defaultCommon();
    }
    default  void defaultMethod2(){
        System.out.println("defaultMethod2()의 코드");
        defaultCommon();
    }


    // 4. private 메소드

    private void defaultCommon(){
        System.out.println("defaultMethod의 중복코드 1");
        System.out.println("defaultMethod의 중복코드 2");
    }


    // 5 정적 메소드  ... static은 static 끼리만 가능
    static void staticMethod1(){
        System.out.println("staticMethod1의 종속코드 1");
        staticCommon();

    }
    static void staticMethod2(){
        System.out.println("staticMethod1의 종속코드 2");
        staticCommon();
    }

    // 6. private 정적 메소드

    private static void staticCommon(){
        System.out.println("staticMethod 중복 코드 3");
        System.out.println("staticMethod 중복 코드 4");
    }
}
