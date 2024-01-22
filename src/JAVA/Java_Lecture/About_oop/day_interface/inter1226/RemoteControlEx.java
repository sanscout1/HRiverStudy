package JAVA.Java_Lecture.About_oop.day_interface.inter1226;

//인터페이스를 활용하여 객체에 따라 출력 다르게 하기 위하여 같은 타입에 인스턴스만 바꿈
public class RemoteControlEx {
    public static void main(String[] args) {
        //상수는 구현객체와 상관 없는 인터페이스 맴버로 바로 접근해서 읽을 수 있다.
//        System.out.println(RemoteControl.MAX_VOLUME);
//        System.out.println(RemoteControl.MIN_VOLUME);

        //

        RemoteControl tv = new TV();
        //Tv tv = new TV();
        tv.turnOn();
        System.out.println(tv.MAX_VOLUME +" "+ tv.MIN_VOLUME);
        //tv.printMAXMIN();   RemoteControl로 생성 하면 tv 클래스만 가지고 있는 것은 호출 불가능
        tv.setVolume(20);
       // tv.printVolume();
        tv.turnOff();

        System.out.println();
        //

        RemoteControl radio = new Radio();
        radio.turnOn();
        System.out.println(radio.MAX_VOLUME + " "+RemoteControl.MIN_VOLUME);
        radio.setVolume(15);
        radio.turnOff();


        System.out.println();
        System.out.println("TV");
        // 오버라이딩은 마지막으로 자신을 구현한 오버라이딩 메소드를 추적해서 이용한다.
        RemoteControl remoteControl;
        remoteControl = new TV();
        remoteControl.turnOn();
        remoteControl.turnOff();
        remoteControl.setVolume(25);
        remoteControl.setMute(true);
        System.out.println(remoteControl.getVolume());
        remoteControl.setMute(false);
        System.out.println(remoteControl.getVolume());
        System.out.println();
        System.out.println("RADIO");
        // 느슨한 결합이기 떄문에 확장성이 좋음
        remoteControl = new Radio(); // radio객체를 생성하여 인터페이스 타입 변수에 주입(injection)
        remoteControl.turnOn();
        remoteControl.turnOff();
        remoteControl.setVolume(15);
        remoteControl.setMute(true);
        System.out.println(remoteControl.getVolume());
        remoteControl.setMute(false);
        System.out.println(remoteControl.getVolume());
        System.out.println();
        //

        RemoteControl.changeBattery();   //정적 메소드 .. 직접 호출
        //remoteControl.changeBattery();


    }
}
