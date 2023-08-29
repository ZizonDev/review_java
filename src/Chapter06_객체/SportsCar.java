package Chapter06_객체;
/*
    class SportsCar (스포츠카)
    - 연비 : 8km
    - 속도 : 250km
    - 연료 탱크 크기 : 30 리터
    - 좌석수 : 2
    - 차량이름은 생성자에서 입력 받아서 설정
    - 부가기능 : 터보기능 (켜면 속도 20% 향상)
 */
public class SportsCar extends Car {
    public SportsCar(String name) {
        speed = 250;
        fuelEff = 8;
        tankSize = 30;
        seats = 2;
        this.name = name;
    }
        @Override
        void setOption(boolean isOption) {
        if(isOption) speed *= 1.2;
    }
}
