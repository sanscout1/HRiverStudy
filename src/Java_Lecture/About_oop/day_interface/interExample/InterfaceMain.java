package Java_Lecture.About_oop.day_interface.interExample;

public class InterfaceMain {
    public static void main(String[] args) {
        InterfaceImpl impl = new InterfaceImpl();

        InterfaceA interfaceA = impl;
        InterfaceB interfaceB = impl;
        InterfaceC interfaceC = impl;

        interfaceA.methodA();

        interfaceB.methodB();
        // 접근 가능한 범위가 다른 것 확인
        interfaceC.methodA();
        interfaceC.methodB();
        interfaceC.methodC();
    }
}
