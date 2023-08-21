package Chapter03_조건문;

import java.util.Scanner;

/*
    2023.08.21

    [문제]
    세자리의 정수를 입력 받아 가장 큰 수 출력하기.
 */
public class Example02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세 자리 정수를 입력하세요 : ");
        int num = sc.nextInt();
        int a = num / 100;
        int b = (int) ((num % 100) / 10);
        int c = num % 10;
        if (a >= b && a >= c) System.out.println("가장 큰 수는 " + a + "입니다.");
        else if (b >= c && b >= a) System.out.println("가장 큰 수는 " + b + "입니다.");
        else System.out.println("가장 큰 수는 " + c + "입니다.");
    }
}
