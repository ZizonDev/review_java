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

public abstract class Car {
    protected String name;
    protected int speed;
    protected int fuelEff;
    protected int tankSize;
    protected int seats;
    protected boolean isOption;

    abstract void setOption(boolean isOption);
    public String getName() {
        return name;
    }
    public int totalCost(int distance, int moveCount) {
        int totalCost = distance * moveCount / fuelEff * 2000;
        return totalCost;
    }
    public int totalOilCount(int distance, int moveCount) {
        if ((distance * moveCount / fuelEff) % tankSize == 0)
            return (distance * moveCount / fuelEff) % tankSize;
        else return (distance * moveCount / fuelEff) % tankSize + 1;
    }
    public int moveCount(int passengerCount) {
        if (passengerCount % seats == 0) return passengerCount / seats;
        else return passengerCount / seats + 1;
    }
    public String totalTime(int distance, int moveCount) {
        double totalTime = (double)(distance * moveCount) / speed;
        int getIntTime = (int)(totalTime * 60);
        int hour = getIntTime / 60;
        int minute = getIntTime % 60;
        return String.format("%d시간 %d분", hour, minute);
    }
}


