package Chapter02_연산자;

import java.util.Scanner;

/*
    2023.08.21

    [문제]
    100의 자리 정수를 입력 받아서 3개의 변수에 나누어 대입 하기.
 */
public class IntegerSeparation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세 자리 정수를 입력하세요 : ");
        int num = sc.nextInt();
        int a = (int) num / 100;
        int b = (num % 100) / 10;
        int c = num % 10;
        if(num > 99 && num < 1000) { System.out.println(a + " | " + b + " | " + c); }
        else { System.out.println("세 자리 정수가 아닙니다."); }
    }
}
