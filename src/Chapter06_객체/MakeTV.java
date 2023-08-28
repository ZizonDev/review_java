package Chapter06_객체;

public class MakeTV {
    boolean isPower;
    int volume;
    int channel;
    public MakeTV() {
        this.isPower = false;
        this.volume = 10;
        this.channel = 7;
    }
    public MakeTV(boolean isPower, int volume, int channel) {
        this.isPower = isPower;
        this.volume = volume;
        this.channel = channel;
    }
    public void setChannel(int channelNum) {
        if (channelNum > 0 && channelNum < 1000) {
            channel = channelNum;
        } else System.out.println("채널 설정 범위가 아닙니다.");
    }
    public void setVolume(int volNum) {
        if (volNum > 0 && volNum < 100) {
            volume = volNum;
        } else System.out.println("볼륨 설정 범위가 아닙니다.");
    }
}
