package Java_Lecture.About_oop.day_interface.inter1226;

// 인터페이스를 활용하여 필요한 기능에 따라 타입을 바꾸며 사용
public class MultiInterfaceMain {
    public static void main(String[] args) {
        RemoteControl remoteControl;
        Searchable searchable;

        remoteControl = new SmartTv();
        remoteControl.turnOn();
        remoteControl.turnOff();
        remoteControl.setVolume(20);
        remoteControl.setMute(true);
        System.out.println();
        // Searchable 거는 remoteControl 에서 이용 불가능한 상태 (smartTV에는 있겠지만 타입 RemoteControl 에는 없기 떄문이다.)

        searchable = new SmartTv();
        searchable.search("https://naver.com");
        searchable.channelUp(40);
        searchable.channelDown(40);

    }
}
