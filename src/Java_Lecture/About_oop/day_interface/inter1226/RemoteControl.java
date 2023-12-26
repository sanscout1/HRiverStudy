package Java_Lecture.About_oop.day_interface.inter1226;

public interface RemoteControl {
    // 1. 상수 필드
    public static final int MAX_VOLUME = 30;   //상수 : public static final -- 누구나 접근가능한 변경 불가능 수 ,
    public static final int MIN_VOLUME = 0;

    //2. 추상메소드 abstract , {} 바디가 없는 메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);


}
