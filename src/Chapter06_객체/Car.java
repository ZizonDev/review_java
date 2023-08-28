package Chapter06_객체;
/*
    [자동차]
    아래는 공통으로 포함되어야 할 필드 입니다.
    - 속도
    - 연비
    - 연료탱크 크기
    - 좌석수
    - 차량이름

    [기본 설정]
    - 기름값은 1리터당 2000원
    - 연비란? 리터당 주행거리를 의미 합니다.
    - 부산 400km, 강릉 200km, 대전 150km,  광주 300km
    - 처음 출발시 연료통에는 기름이 없는 상태 입니다.
    - 이동 횟수는 편도로 계산 합니다.
    - 이동 시간은 차량의 최고속도 기준으로 계산 합니다.
 */

public class Car {
    protected String name;
    protected int speed;
    protected int fuelEff;
    protected int tankSize;
    protected int seats;
    protected boolean isOption;

    void setOption(boolean isOption) {
        this.isOption = isOption;
    }

    public int moveCnt(int passengerCnt) {
        int moveCnt;
        if(passengerCnt % seats == 0) {moveCnt = passengerCnt / seats;}
        else {moveCnt = passengerCnt / seats + 1;}
        return moveCnt;
    }
    public int oilCnt(int distance, int moveCnt) {
        int oilCnt;
        if (distance * moveCnt % fuelEff == 0) oilCnt = distance * moveCnt % fuelEff;
        else oilCnt = distance * moveCnt % fuelEff + 1;
        return oilCnt;
    }
    public int totalCost(int oilCnt) {
        int totalCost = oilCnt * 2000;
        return totalCost;
    }
    public int totalTime(int distance, int moveCnt, int speed) {
        int totalTime = distance * moveCnt / speed * 60;
        int time = totalTime / 60;
        int minute = totalTime % 60;
        System.out.printf("%d시간 %d분", time, minute);
        return totalTime;
    }
    public String getName() {
        this.name = name;
        return name;
    }
    public int getSpeed() {
        return speed;
    }
}
