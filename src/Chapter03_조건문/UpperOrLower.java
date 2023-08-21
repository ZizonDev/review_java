package Chapter03_조건문;

import java.util.Scanner;

/*
    2023.08.21

    [문제]
    영문자를 입력받고, 문자가 알파벳 대문자인지 소문자인지 판별하는 프로그램 생성하기.

    [Hint]
    아스키 코드에서 대문자 A의 값 < 소문자 a의 값!!!
 */
public class UpperOrLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("영문자를 입력하세요 : ");
        char alphabet = sc.next().charAt(0);

        if (alphabet >= 'a' && alphabet <= 'z') System.out.println(alphabet + " : 소문자입니다.");
        else if (alphabet >= 'A' && alphabet <= 'Z') System.out.println(alphabet + " : 대문자입니다.");
        else System.out.println(alphabet + "은 영문자가 아닙니다.");
    }
}
