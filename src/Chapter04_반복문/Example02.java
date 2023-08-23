package Chapter04_반복문;
/*
    2023.08.23

    [문제]
    랜덤 함수를 사용하여 두 개의 주사위를 굴리고, 두 주사위의 합이 12이면 무인도를 탈출하는 프로그램.
 */
public class Example02 {
    public static void main(String[] args) {
        int x, y;
        int cnt = 0;
        while (true) {
            cnt++;
            x = (int)(Math.random() * 6) + 1;
            y = (int)(Math.random() * 6) + 1;
            if(x + y == 12) {
                System.out.printf("무인도를 %d번 만에 탈출하였습니다. \n", cnt);
                break;
            }
            else System.out.println("주사위의 합이 " + (int)(x + y) + "입니다.");
        }
    }
}
