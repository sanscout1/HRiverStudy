package JAVA.Java_Lecture.About_oop.day_interface.inter1226;

//전원을 켠다 -> 해당 tv 기본 max,min 볼륨값 확인, tv의 볼륨을 20으로 설정하고 값 확인, 전원을 끈다

public class TV implements RemoteControl{

    private int volume;
    private int saveVolume;

    @Override
    public void turnOn() { //추상메소드 재정의 : 오버라이딩
        System.out.println("전원을 켰습니다.");
    }

    public void printMAXMIN(){
        System.out.println(RemoteControl.MAX_VOLUME);
        System.out.println(RemoteControl.MIN_VOLUME);
    }


    @Override
    public void turnOff() { //추상메소드 재정의 : 오버라이딩
        System.out.println("전원을 껐습니다.");
    }

    @Override
    public void setVolume(int volume) {  //추상메소드 재정의 : 오버라이딩
        //인터페이스 상수를 사용하여 조건 내부에 있도록 설정
        if(volume>RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume<RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume=volume;
        }
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    public void printVolume(){
        System.out.println(this.volume);
    }


    // default 함수는 오버라이딩 할때 public 으로 해줘야함
    @Override
    public void setMute(boolean mute) {

        if(mute) {
            this.saveVolume=getVolume();
            System.out.println("Mute Processing");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("Mute Cancel");
            this.volume=this.saveVolume;
        }
    }
}
