package JAVA.Java_Lecture.About_oop.day_interface.inter1226;

public class SmartTv implements RemoteControl, Searchable{

    private int volume;
    private int channel;
    @Override
    public void turnOn() {
        System.out.println("smart 전원 on");
    }

    @Override
    public void turnOff() {
        System.out.println("smart 전원 off");

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
        return 0;
    }

    @Override
    public void search(String url) {
        System.out.println(url + " 검색합니다.");

    }

    @Override
    public void channelUp(int channel) {
        this.channel++;
    }

    @Override
    public void channelDown(int channel) {
        this.channel--;
    }

    @Override
    public void setMute(boolean mute) {
        RemoteControl.super.setMute(mute);
    }
}
