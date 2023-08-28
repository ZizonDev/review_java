package Chapter06_객체;

import java.util.Scanner;

/*
    2023.08.28

    [입력]
    - 이동 지역을 선택 하세요 (1. 부산, 2. 대전, 3. 강릉, 4. 광주)
    - 이동할 승객 수를 입력 하세요 ( 1 ~ 100 사이)
    - 이동 차량을 선택 하세요. (1. 스포츠카, 2.승용차, 3번 버스)
    - 부가 기능의 ON/OFF 를 선택 하세요.

    [출력 예시]
    이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4] 광주 : 1
    이동할 승객 수 입력 : 21
    이동할 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : 1
    부가 기능 [1]ON [2]OFF : 1
    =====Ferrari=====
    총 비용 : 1100000원
    총 주유 횟수 : 19회
    총 이동 시간 : 14시간 40분
 */
public class MakeCarMain {
    public static void main(String[] args) {
        int[] city = {400, 150, 200, 300};
        Car car = new Car();
        Scanner sc = new Scanner(System.in);
        System.out.print("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4] 광주 : ");
        int cityNum = sc.nextInt();
        System.out.print("이동할 승객 수 입력 : ");
        int passengerCount = sc.nextInt();
        System.out.print("이동할 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
        int carNum = sc.nextInt();
        System.out.print("부가 기능 [1]ON [2]OFF : ");
        int option = sc.nextInt();
        boolean isOption = (option == 1) ? true : false;

        switch(carNum) {
            case 1 : car = new SportsCar("Porsche 911"); break;
            case 2 : car = new Sedan("Genesis GV80"); break;
            case 3 : car = new Bus("Express Bus"); break;
        }
        car.setOption(isOption);
        int moveCount = car.moveCnt(passengerCount);
        int oilCount = car.oilCnt(city[cityNum-1], moveCount);

        System.out.println("=".repeat(10) + car.getName() + "=".repeat(10));
        System.out.println("총 비용 : " + car.totalCost(oilCount) + "원");
        System.out.println("총 주유 횟수 : " + oilCount + "회");
        System.out.println("총 이동 시간 : " + car.totalTime(city[cityNum - 1], moveCount, car.getSpeed()));
    }
}
