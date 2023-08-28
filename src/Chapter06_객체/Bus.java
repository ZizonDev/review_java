package Chapter06_객체;
/*
    class Bus (버스)
    - 연비 : 5km
    - 속도 : 150km
    - 연료 탱크 크기 : 100 리터
    - 좌석수 : 20
    - 차량이름은 생성자에서 입력 받아서 설정
    - 부가기능 : 보조연료탱크(켜면 연료탱크 크기가 30리터 늘어남)
 */
public class Bus extends Car {
    public Bus(String name) {
        speed = 150;
        fuelEff = 5;
        tankSize = 100;
        seats = 20;
        this.name = name;
        if(isOption) tankSize += 30;
    }
}
