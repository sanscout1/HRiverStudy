package JAVA.Java_Lecture.About_oop.day_interface.inter1226;

public interface RemoteControl {
    // 1. 상수 필드
    public static final int MAX_VOLUME = 30;   //상수 : public static final -- 누구나 접근가능한 변경 불가능 수 ,
    public static final int MIN_VOLUME = 0;

    //2. 추상메소드 abstract , {} 바디가 없는 메소드 abstract 메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    int getVolume();


    //3. 디폴트 메소드 (default method)  인터페이스에서 완전한 실행코드를 가진 유일한 메소드
    //디폴트 메소드도 오버라이딩이 가능

    default void setMute(boolean mute){
        if(mute) {
            System.out.println("Mute Processing");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("Mute Cancel");
        }
    }

    //4. 정적 메소드
    public static void changeBattery(){
        System.out.println("리모컨 건전지를 교환합니다.");
    }




}
