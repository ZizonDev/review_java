package Chapter04_반복문;

import java.util.Scanner;

/*
    2023.08.23

    [문제]
    정수 n을 입력받고, 1부터 n*n까지 나열하기.
    단, n으로 나누어 떨어지는 경우 다음 줄로 넘어가기.
 */
public class MakeNbyN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n*n; i++) {
            System.out.printf("%4d", i);
            if(i % n == 0) System.out.println(" ");
        }
    }
}
