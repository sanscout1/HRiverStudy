package JAVA.Java_Lecture.About_oop.day_interface.inter1226;

public class Radio implements RemoteControl{
    private int volume;
    private int saveVolume;

    @Override
    public void turnOn() {
        System.out.println("라디오 전원 on");
    }

    @Override
    public void turnOff() {
        System.out.println("라디오 전원 off");
    }

    @Override
    public void setVolume(int volume) {
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
    public void setMute(boolean mute) {

        if(mute) {
            this.saveVolume=getVolume();
            System.out.println("Radio Mute Processing");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("Radio Mute Cancel");
            this.volume=this.saveVolume;
        }
    }
}
