package Chapter03_조건문;

import java.util.Scanner;

/*
    2023.08.21

    [문제]
    - 시험 성적을 입력 받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지는 F를 출력하는 프로그램
    - 0 ~ 100 사이가 아니면 성적이 잘못 입력 되었다고 출력

    [선택사항]
    성적이 잘못 입력된 경우 다시 입력 받도록 수정
 */
public class Example01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("시험 성적을 입력하세요 : ");
            int score = sc.nextInt();
            if(score < 0 || score > 100) continue;
            if(score >= 90) System.out.println("A");
            else if(score >= 80) System.out.println("B");
            else if(score >= 70) System.out.println("C");
            else if(score >= 60) System.out.println("D");
            else System.out.println("F");
            break;
        }
    }
}
