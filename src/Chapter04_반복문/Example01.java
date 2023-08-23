package Chapter04_반복문;

import java.util.Scanner;

/*
    2023.08.23

    [문제]
    정수 n을 입력받고, 마지막 열이 n개가 되는 삼각형 모양의 별 찍기.
 */
public class Example01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
