package Chapter04_반복문;

import java.util.Scanner;

/*
    2023.08.23

    [문제]
    양의 정수 n을 입력 받아 n * n 크기의 행렬을 출력하는 프로그램 만들기.
 */
public class Example04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n*n; i++) {
            System.out.printf("%4d", i);
            if (i % n == 0) System.out.println(" ");
        }
    }
}

