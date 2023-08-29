package Chapter06_객체_Ex01;

import java.util.Scanner;

public class MovieTicket {
    int seat[] = new int[10];
    int totalCost() {
        int cnt = 0;
        for(int e : seat) {
            if (e == 1) cnt++;
        }
        return cnt * 12000;
    }
    void printSeat() {
        for(int i = 0; i < seat.length; i++) {
            if(seat[i] == 0) System.out.print("[ ]");
            else System.out.print("[V]");
        }
        System.out.println();
    }
    void selectSeat() {
        printSeat();
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석 번호를 입력하세요 : ");
        int num = sc.nextInt();
        if(seat[num-1] == 0) {
            seat[num-1] = 1;
            printSeat();
        } else System.out.println("이미 예매된 좌석입니다. 다른 좌석을 선택하세요.");
    }
}
