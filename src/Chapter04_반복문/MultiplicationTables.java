package Chapter04_반복문;

import java.util.Scanner;

/*
    2023.08.23

    [문제]
    2단부터 9단까지 출력할 수 있는 구구단 프로그램 만들기.
 */
public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 2; i < 10; i++) {
            System.out.print("몇 단을 출력할까요? : ");
            i = sc.nextInt();
            for (int j = 1; j < 10; ) {
                int multiplication = i * j;
                System.out.print(i + " X " + j + " = " + multiplication);
                j++;
                System.out.println(" ");
            }
        }
    }
}
