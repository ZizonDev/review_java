package Chapter06_객체_Ex01;
/*
    2023.08.29

    [문제]
    간단한 영화표 예매 시스템에 대한 예제 입니다.
    사용자가 영화의 좌석을 선택하고 선택한 좌석 수에 따라 총 금액을 계산합니다.

    [조건]
    - 예매하기와 종료하기 메뉴 작성
    - 극장의 좌석은 10개 입니다.
    - 각 좌석당 판매 가격은 12000원 입니다.
 */

import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        MovieTicket booking = new MovieTicket();
        Scanner sc = new Scanner(System.in);
        System.out.println("=====간단한 영화표 예매 시스템=====");
        while (true) {
            System.out.print("[1]예매하기 [2]종료하기 : ");
            int sel = sc.nextInt();
            if(sel == 1) booking.selectSeat();
            else if(sel == 2) {
                System.out.println("총 비용 : " + booking.totalCost() + "원");
                break;
            }
        }
    }
}