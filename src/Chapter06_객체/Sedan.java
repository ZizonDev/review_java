package Chapter06_객체;
/*
    class Sedan (세단)
    - 연비 : 12km
    - 속도 : 200km
    - 연료 탱크 크기 : 45 리터
    - 좌석수 : 4
    - 차량이름은 생성자에서 입력 받아서 설정
    - 부가기능 : 트렁크가 좌석으로 변경 (켜면 승객 1명 추가)
 */
public class Sedan extends Car {
    public Sedan(String name) {
        speed = 200;
        fuelEff = 12;
        tankSize = 45;
        seats = 4;
        this.name = name;
        if(isOption) seats += 1;
    }
}
