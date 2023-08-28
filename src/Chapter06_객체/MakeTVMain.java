package Chapter06_객체;
/*
    2023.08.28

    [문제]
    전원 On / Off 기능, 볼륨 조정, 채널 조정 기능을 포함하는 부모클래스를 만들고,
    부모클래스로부터 상속받아 추가로 인터넷 기능을 오버라이딩한 TV를 만들어보자.

 */
public class MakeTVMain {
    public static void main(String[] args) {
        TV tv1 = new TV();
        TV tv2 = new TV("Samsung Smart TV");
        tv1.isInternet = false;
        tv1.TVInfo();
        tv2.setPower(true);
        tv2.setChannel(100, true);
        tv2.setVolume(50);
        tv2.TVInfo();
    }
}
class TV extends MakeTV{
    String name;
    boolean isInternet;
    TV() {
        super(true, 20, 11);
        name = "LG OLED TV";
    }
    TV(String name) {
        this.name = name;
        isPower = false;
        channel = 13;
        volume = 20;
        isInternet = false;
    }
    void setPower(boolean isPower) {
        this.isPower = isPower;
    }
    public void setChannel(int channelNum, boolean isInternet) {
        if(isInternet) System.out.println("인터넷 모드를 실행합니다.");
        else if(channelNum > 5 && channelNum < 2000) {
            channel = channelNum;
            System.out.println("채널을 " + channelNum + "번으로 변경합니다.");
        } else System.out.println("채널 설정 범위가 아닙니다.");
    }
    void TVInfo() {
        System.out.println("이름 : " + name);
        System.out.println("전원 : " + isPower);
        System.out.println("볼륨 : " + volume);
        System.out.println("채널 : " + channel);
        System.out.println("인터넷 모드 : " + isInternet);
    }

        }
